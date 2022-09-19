import generated.lexis_expression.LexicalAnalyzer;
import generated.parser_expression.Parser;

import java.util.Scanner;

public class ExprTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String test = scanner.nextLine();
            LexicalAnalyzer lexicalAnalyzer = new LexicalAnalyzer(test);
            Parser parser = new Parser(lexicalAnalyzer);
            System.out.println(parser.expr().val);
        }
    }
}
