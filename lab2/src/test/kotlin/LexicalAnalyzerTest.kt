import exceptions.ParserException
import lexis.LexicalAnalyzer
import lexis.Token
import lexis.Token.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals

class LexicalAnalyzerTest {
    companion object {
        private val CORRECT_MAP = mapOf(
            "for(int a=228;a<1509;a++)" to listOf(
                FOR,
                OPEN_BRACKET,
                WORD,
                WORD,
                ASSIGN,
                NUMBER,
                SEMICOLON,
                WORD,
                LESS,
                NUMBER,
                SEMICOLON,
                WORD,
                INCREMENT,
                CLOSE_BRACKET,
                END
            ),
            "for some word for" to listOf(FOR, WORD, WORD, FOR, END),
            ">= ; ++ --\n\t\r <= == != 29" to listOf(
                GREATER_EQUALS,
                SEMICOLON,
                INCREMENT,
                DECREMENT,
                LESS_EQUALS,
                EQUALS,
                NOT_EQUALS,
                NUMBER,
                END
            ),
            "1294195792537927592759273698732682973692376972639732697926879" to listOf(NUMBER, END)
        )
        private val INCORRECT_LIST = listOf(
            "f%r",
            "228^=</.228",
            "`#@",
            "abc" + (-1).toChar() + "abc"
        )
    }

    @Test
    fun testCorrectInput() = CORRECT_MAP.forEach { assertEquals(it.value, getTokensOf(it.key)) }

    @Test
    fun testIncorrectInput() = INCORRECT_LIST.forEach { assertThrows<ParserException> { getTokensOf(it) } }

    private fun getTokensOf(string: String): List<Token> {
        val tokens = arrayListOf<Token>()
        val lexer = LexicalAnalyzer(string.byteInputStream())

        lexer.nextToken()

        while (lexer.curToken != END) {
            tokens.add(lexer.curToken)
            lexer.nextToken()
        }

        tokens.add(lexer.curToken)

        return tokens
    }
}