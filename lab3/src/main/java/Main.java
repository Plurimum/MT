import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    public static void main(String[] args) {
        String expressions = """
                a = 20;
                b = a + 2 + kek;
                c = a + b * (b - 3);
                a = 3;
                c = a + d + b * (b - 3);
                """;

        CharStream charStream = CharStreams.fromString(expressions);

        ExpressionLexer lexer = new ExpressionLexer(charStream);
        ExpressionParser parser = new ExpressionParser(new CommonTokenStream(lexer));

        System.out.println(parser.s().output);
    }
}