package lexis

import exceptions.ParserException
import java.io.InputStream
import lexis.Token.*

class LexicalAnalyzer(private val inputStream: InputStream) {
    private var curChar = Char.MIN_VALUE
    var curPos = 0L
        private set
    lateinit var curToken: Token
        private set
    var curFragment = ""
        private set

    companion object {
        private val STRANGE_SYMBOLS_SET = setOf('+', '-', '=', '!', '<', '>')
        private const val END_SYMBOL = (-1).toChar()
    }

    init {
        nextChar()
    }

    fun nextToken() {
        while (isBlank(curChar)) nextChar()

        when (curChar) {
            ';' -> assignTokenAndNext(SEMICOLON, curChar)
            '(' -> assignTokenAndNext(OPEN_BRACKET, curChar)
            ')' -> assignTokenAndNext(CLOSE_BRACKET, curChar)
            END_SYMBOL -> assignToken(END, "$")
            else -> handleFragment(nextFragment())
        }
    }

    private fun nextChar() {
        curPos++
        curChar = inputStream.read().toChar()
    }

    private fun isBlank(symbol: Char): Boolean {
        return symbol == ' ' || symbol == '\r' || symbol == '\n' || symbol == '\t'
    }

    private fun assignTokenAndNext(token: Token, tokenValue: Char) {
        assignToken(token, tokenValue.toString())
        nextChar()
    }

    private fun assignToken(token: Token, fragment: String) {
        curToken = token
        curFragment = fragment
    }

    private fun nextFragment() = readStrangeFragment().ifEmpty { readWordOrNum() }

    private fun readStrangeFragment(): String {
        var result = ""

        while (STRANGE_SYMBOLS_SET.contains(curChar)) {
            result += curChar
            nextChar()
        }

        return result
    }

    private fun readWordOrNum(): String {
        var result = ""

        while (curChar.isLetter() || curChar.isDigit()) {
            result += curChar
            nextChar()
        }

        return result
    }

    private fun handleFragment(fragment: String) {
        when (fragment) {
            "++" -> assignToken(INCREMENT, "++")
            "--" -> assignToken(DECREMENT, "--")
            "==" -> assignToken(EQUALS, "==")
            "!=" -> assignToken(NOT_EQUALS, "!=")
            ">=" -> assignToken(GREATER_EQUALS, ">=")
            "<=" -> assignToken(LESS_EQUALS, "<=")
            "<" -> assignToken(LESS, "<")
            ">" -> assignToken(GREATER, ">")
            "=" -> assignToken(ASSIGN, "=")
            "for" -> assignToken(FOR, "for")
            else -> when {
                fragment.isEmpty() -> throw ParserException(fragment, curPos)
                fragment.first().isDigit() -> assignToken(NUMBER, fragment)
                fragment.first().isLetter() -> assignToken(WORD, fragment)
            }
        }
    }
}