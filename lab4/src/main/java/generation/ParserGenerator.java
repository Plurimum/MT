package generation;

import grammar.*;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ParserGenerator {
    private static final String EPSILON = "@eps";
    private static final String TAB = "    ";
    private static final String SOURCE_CODE_PARSE_EXCEPTION = """         
            public class ParseException extends RuntimeException {
                public ParseException(String message) {
                    super(message);
                }
            }
            """;
    private static final String SOURCE_CODE_TREE = """
            import java.util.ArrayList;
            import java.util.List;
                        
            public class Tree {
                private final String node;
                private final List<Tree> children;
                        
                public Tree(String node) {
                    this.node = node;
                    this.children = new ArrayList<>();
                }
                        
                public void addChild(Tree node) {
                    children.add(node);
                }
                        
                public void addChild(String node) {
                    children.add(new Tree(node));
                }
                        
                public String getNode() {
                    return node;
                }
                        
                public List<Tree> getChildren() {
                    return children;
                }
            }
            """;

    private final Grammar grammar;
    private final FirstAndFollow firstAndFollow;
    private final String path;

    public ParserGenerator(Grammar grammar) {
        this.grammar = grammar;
        this.firstAndFollow = new FirstAndFollow(grammar);
        this.path = "./src/main/java/generated/parser_" + grammar.name;
    }

    public void generate() {
        try {
            Files.createDirectories(Paths.get(path));
        } catch (IOException ignored) {
        }
        generateClassResourceCode(SOURCE_CODE_PARSE_EXCEPTION, "ParseException.java");
        generateClassResourceCode(SOURCE_CODE_TREE, "Tree.java");
        generateParser();
    }

    private void generateClassResourceCode(String sourceCode, String nameClass) {
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(Path.of(path + "/" + nameClass))) {
            bufferedWriter.write(String.format("""
                    package generated.parser_%s;
                                        
                    """, grammar.name));
            bufferedWriter.write(sourceCode);
        } catch (IOException e) {
            throw new GenerationException("Can't create " + nameClass + ".");
        }
    }

    private void generateParser() {
        Map<RuleDeclaration, List<RuleBody>> map = grammar
                .rules
                .stream()
                .collect(Collectors.groupingBy(Rule::decl,
                        Collectors.mapping(Rule::body,
                                Collectors.toList()))
                );

        StringBuilder sourceCode = new StringBuilder();
        final String sourceCodeHeadParser = String.format("""            
                        import generated.lexis_%s.LexicalAnalyzer;
                        import generated.lexis_%s.Token;
                        import generated.lexis_%s.TypeToken;
                                    
                        public class Parser {
                            private final LexicalAnalyzer tokens;
                            private Token token;
                            
                            private void nextToken() {
                                tokens.nextToken();
                                token = tokens.getToken();
                            }
                            
                            public Parser(LexicalAnalyzer tokens) {
                                this.tokens = tokens;
                                nextToken();
                            }
                                        
                        """,
                grammar.name,
                grammar.name,
                grammar.name);

        sourceCode.append(sourceCodeHeadParser);

        generateFun(map, sourceCode);
        generateClasses(map.keySet(), sourceCode);

        generateClassResourceCode(sourceCode + """
                }
                """, "Parser.java");
    }

    private String nameClass(String name) {
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }

    private String getCode(String code) {
        return code == null ? "" : code.substring(1, code.length() - 1);
    }

    private void generateCases(StringBuilder sourceCode, Set<String> tokens) {
        sourceCode.append(String.format("""
                            case %s -> {
                """, String.join(", ", tokens)));
    }

    private void generateFun(Map<RuleDeclaration, List<RuleBody>> map, StringBuilder sourceCode) {
        for (var entry : map.entrySet()) {
            final String nameToken = entry.getKey().name();
            final String nameClass = nameClass(nameToken);

            sourceCode.append(String.format("""
                                public %s %s%s {
                                    %s res = new %s("%s");
                                    switch(token.typeToken()) {
                            """,
                    nameClass,
                    nameToken,
                    entry.getKey().inherited(),
                    nameClass,
                    nameClass,
                    nameToken)
            );

            boolean isEps = false;
            String codeForFollow = "";

            for (var ruleBody : entry.getValue()) {
                final List<Sequence> sequences = ruleBody.sequences();
                final Set<String> firsts = firstAndFollow.getFirstString(ruleBody.elementsNames());

                if (firsts.contains(EPSILON)) {
                    isEps = true;
                    codeForFollow = ruleBody.sequences().get(0).code();
                }

                firsts.remove(EPSILON);

                if (firsts.size() == 0) {
                    continue;
                }

                generateCases(sourceCode, firsts);
                int i = 0;
                for (var sequence : sequences) {
                    for (var element : sequence.elements()) {
                        if (element.name().matches("[A-Z]+")) {
                            sourceCode.append(String.format("""   
                                                    if (token.typeToken() != TypeToken.%s) {
                                                        throw new ParseException("No valid token: " + token.text());
                                                    }
                                                    String %s%d = token.text();
                                                    res.addChild(token.text());
                                                    nextToken();
                                    """, element.name(), element.name(), i));
                        } else {
                            sourceCode.append(String.format("""
                                                            %s %s%d = %s%s;
                                                            res.addChild(%s%d);
                                            """,
                                    nameClass(element.name()),
                                    element.name(),
                                    i,
                                    element.name(),
                                    element.inherited(),
                                    element.name(),
                                    i
                            ).replaceAll("\\$", "res."));
                        }
                        i++;
                    }

                    final String code = getCode(sequence.code());
                    if (!code.isEmpty())
                        sourceCode.append(String.format("""
                                                %s
                                """, code).replaceAll("\\$", "res."));
                }
                sourceCode.append("""
                                    }
                        """);
            }

            if (isEps) {
                generateCases(sourceCode, firstAndFollow.getFollow().get(nameToken));
                sourceCode.append(String.format("""
                                        res.addChild("eps");
                                        %s
                                    }
                        """, getCode(codeForFollow)).replaceAll("\\$", "res."));
            }

            sourceCode.append("""
                                default ->
                                    throw new ParseException("No valid token: " + token.text());
                            }
                            
                            return res;
                        }
                        
                    """);
        }
    }


    private void generateClasses(Set<RuleDeclaration> nonTerminals, StringBuilder sourceCode) {
        sourceCode.append("\n");

        for (var nonTerm : nonTerminals) {
            final String nameClass = nameClass(nonTerm.name());

            sourceCode.append(String.format("""
                        public static class %s extends Tree {
                    """, nameClass));

            sourceCode.append(Arrays
                    .stream(getCode(nonTerm
                            .synthesized())
                            .split(","))
                    .filter(str -> !str.isBlank())
                    .map(attr -> TAB + TAB + "public " + attr + ";\n")
                    .collect(Collectors.joining())
            );

            sourceCode.append(String.format("""
                            public %s(String node) {
                                super(node);
                            }
                        }
                        
                    """, nameClass));
        }
    }

}