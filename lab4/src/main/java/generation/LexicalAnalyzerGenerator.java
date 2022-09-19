package generation;

import grammar.Grammar;
import grammar.Terminal;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class LexicalAnalyzerGenerator {
    private static final String TAB = "    ";

    private final Grammar grammar;
    private final String path;

    public LexicalAnalyzerGenerator(Grammar grammar) {
        this.grammar = grammar;
        this.path = "./src/main/java/generated/lexis_" + grammar.name;
    }

    public void generate() {
        try {
            Files.createDirectories(Paths.get(path));
        } catch (IOException ignored) {}

        generateTokenClass();
        generateTypeToken();
        generateLexicalAnalyzer();
    }

    private void generateTokenClass() {
        final String sourceCodeToken = String.format("""
            package generated.lexis_%s;
            public record Token (TypeToken typeToken, String text) {
                @Override
                public String toString() {
                    return typeToken.name();
                }
            }""", grammar.name);

        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(Path.of(path + "/Token.java"))) {
            bufferedWriter.write(sourceCodeToken);
        } catch (IOException e) {
            throw new GenerationException("Can't create Token.java.");
        }
    }

    private void generateTypeToken() {
        String startClass = String.format("""
                package generated.lexis_%s;
                                
                import java.util.regex.Pattern;
                                
                public enum TypeToken {
                    END("\\\\$"),""", grammar.name);

        String endClass = """
                    private final Pattern pattern;
                                
                    TypeToken (String regexp) {
                        this.pattern = Pattern.compile(regexp);
                    }
                                
                    public boolean match(String text) {
                        return pattern.matcher(text).matches();
                    }
                }
                """;
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(Path.of(path + "/TypeToken.java"))) {
            bufferedWriter.write(startClass
                    + grammar
                    .terminals
                    .stream()
                    .map(terminal -> TAB + terminal.name() + "(" + terminal.value() + ")")
                    .collect(Collectors.joining(",\n", "\n", ";\n"))
                    + endClass);
        } catch (IOException e) {
            throw new GenerationException("Can't create TypeToken.java");
        }
    }

    private void generateLexicalAnalyzer() {
        String startClass = String.format("""
                package generated.lexis_%s;
                       
                import generated.parser_%s.ParseException;
                               
                import java.util.regex.Matcher;
                import java.util.regex.Pattern;
                                
                public class LexicalAnalyzer {
                                
                    private final static Pattern PATTERN_EXPRESSION = Pattern.compile(""",
                grammar.name,
                grammar.name);

        String endClass = """
                );
                                
                    private final Matcher tokenMatcher;
                                
                    private Token curToken;
                                
                    public LexicalAnalyzer(String expression) {
                        this.tokenMatcher = PATTERN_EXPRESSION.matcher(expression);
                    }
                                
                    public void nextToken() {
                        while (tokenMatcher.find()) {
                                
                            if (Character.isWhitespace(tokenMatcher
                                    .group()
                                    .charAt(0))
                            ) {
                                continue;
                            }
                                
                            for (var typeToken : TypeToken.values()) {
                                String tokenStr = tokenMatcher.group();
                                if (typeToken.match(tokenStr)) {
                                    curToken = new Token(typeToken, tokenStr);
                                    return;
                                }
                            }
                                
                            throw new ParseException("No valid token on pos: " + tokenMatcher.start());
                        }
                                
                        curToken = new Token(TypeToken.END, "$");
                    }
                                
                    public Token getToken() {
                        return curToken;
                    }
                }
                """;
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(Path.of(path + "/LexicalAnalyzer.java"))) {
            bufferedWriter.write(startClass
                    + grammar
                    .terminals
                    .stream()
                    .map(Terminal::value)
                    .map(s -> s.substring(1, s.length() - 1))
                    .collect(Collectors.joining("|", "\"", "|.\""))
                    + endClass);
        } catch (IOException e) {
            throw new GenerationException("Can't create TypeToken.java");
        }
    }
}