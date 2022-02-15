import exceptions.ParserException
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow
import org.junit.jupiter.api.assertThrows
import syntax.SyntaxAnalyzer

class SyntaxAnalyzerTest {
    companion object {
        private val CORRECT_LIST = CorrectExpressionsList.value
        private val INCORRECT_LIST = listOf(
            "f%r",
            "228^=</.228",
            "`#@",
            "(int a=228;a<1509;a++)",
            "for(;;)",
            "for int a=228;a<1509;a++)",
            "for(abc abc abc = 228; abc == 123; abc--)",
            "for(type abc=abc; abc == 1; abc--)",
            "for(type abc=123; 1 == 1; abc--)",
            "for(type abc=123; abc != 1; 1++)"
        )
        private val PARSER = SyntaxAnalyzer()
    }

    @Test
    fun testCorrectInput() = CORRECT_LIST.forEach { assertDoesNotThrow { tryParse(it) } }

    @Test
    fun testIncorrectInput() = INCORRECT_LIST.forEach { assertThrows<ParserException> { tryParse(it) } }

    private fun tryParse(string: String) = PARSER.parse(string.byteInputStream())

}