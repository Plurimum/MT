import graph.GraphVizInterpretator
import syntax.SyntaxAnalyzer
import java.nio.file.Files
import java.nio.file.Path

object CorrectExpressionsList{
    val value = listOf(
        "for(int a=228;a<1509;a++)",
        "for  (someType a = 228; b <= 123; variable++)  ",
        "      \nfor (typeName228 \n\t varName123     = 1234; kek != 0    ; lol--) \n\r"
    )
}

fun main() {
    val parser = SyntaxAnalyzer()
    var index = 0

    CorrectExpressionsList.value.forEach { expr ->
        Files.newBufferedWriter(Path.of("pictures/input${index++}.dot")).use {
            it.write(GraphVizInterpretator.interpret(parser.parse(expr.byteInputStream())))
        }
    }
}