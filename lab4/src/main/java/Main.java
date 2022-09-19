import generation.LexicalAnalyzerGenerator;
import generation.ParserGenerator;
import grammar.Grammar;
import grammar.GrammarForGrammarLexer;
import grammar.GrammarForGrammarParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List.of(
                Path.of("D:\\ITMO\\MT\\lab4\\src\\main\\java\\expression"),
                Path.of("D:\\ITMO\\MT\\lab4\\src\\main\\java\\for")
        ).forEach(path -> {
            try {
                Scanner scanner = new Scanner(Files.newBufferedReader(path));
                StringBuilder input = new StringBuilder();
                while (scanner.hasNext()) {
                    input.append(scanner.nextLine());
                }

                CharStream charStream = CharStreams.fromString(input.toString());

                GrammarForGrammarLexer lexer = new GrammarForGrammarLexer(charStream);
                GrammarForGrammarParser parser = new GrammarForGrammarParser(new CommonTokenStream(lexer));

                Grammar grammar = parser.s().grammar;

                LexicalAnalyzerGenerator analyzer = new LexicalAnalyzerGenerator(grammar);
                analyzer.generate();
                ParserGenerator generatorParser = new ParserGenerator(grammar);
                generatorParser.generate();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
