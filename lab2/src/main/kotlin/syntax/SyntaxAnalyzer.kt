package syntax

import exceptions.ParserException
import lexis.LexicalAnalyzer
import lexis.Token
import lexis.Token.*
import java.io.InputStream

class SyntaxAnalyzer {
    private lateinit var lex: LexicalAnalyzer

    fun parse(inputStream: InputStream): Tree {
        lex = LexicalAnalyzer(inputStream)

        return S()
    }

    private fun S(): Tree {
        val forKeyword = nextExpectedFragment(FOR)
        val openBracket = nextExpectedFragment(OPEN_BRACKET)
        val subI = I()
        val semicolon1 = nextExpectedFragment(SEMICOLON)
        val subC = C()
        val semicolon2 = nextExpectedFragment(SEMICOLON)
        val subK = K()
        val closeBracket = nextExpectedFragment(CLOSE_BRACKET)
        val end = nextExpectedFragment(END)

        return Tree(
            "S",
            "S",
            Tree(FOR, forKeyword),
            Tree(OPEN_BRACKET, openBracket),
            subI,
            Tree(SEMICOLON, semicolon1),
            subC,
            Tree(SEMICOLON, semicolon2),
            subK,
            Tree(CLOSE_BRACKET, closeBracket),
            Tree(END, end)
        )
    }

    private fun nextExpectedFragment(expected: Token): String {
        lex.nextToken()

        if (lex.curToken != expected) throw ParserException(lex.curFragment, lex.curPos)

        return lex.curFragment
    }

    private fun I(): Tree {
        val typeWord = nextExpectedFragment(WORD)
        val variableName = nextExpectedFragment(WORD)
        val assign = nextExpectedFragment(ASSIGN)
        val number = nextExpectedFragment(NUMBER)

        return Tree(
            "I",
            "I",
            Tree(WORD, typeWord),
            Tree(WORD, variableName),
            Tree(ASSIGN, assign),
            Tree(NUMBER, number)
        )
    }

    private fun C(): Tree {
        val variableName = nextExpectedFragment(WORD)
        val subO = O()
        val number = nextExpectedFragment(NUMBER)

        return Tree(
            "C",
            "C",
            Tree(WORD, variableName),
            subO,
            Tree(NUMBER, number)
        )
    }

    private fun K(): Tree {
        val variableName = nextExpectedFragment(WORD)
        val subD = D()

        return Tree("K", "K", Tree(WORD, variableName), subD)
    }

    private fun D(): Tree {
        lex.nextToken()

        return when (lex.curToken) {
            INCREMENT -> Tree(INCREMENT, lex.curFragment)
            DECREMENT -> Tree(INCREMENT, lex.curFragment)
            else -> throw ParserException(lex.curFragment, lex.curPos)
        }
    }

    private fun O(): Tree {
        lex.nextToken()

        return when (lex.curToken) {
            EQUALS -> Tree(EQUALS, lex.curFragment)
            GREATER_EQUALS -> Tree(GREATER_EQUALS, lex.curFragment)
            LESS_EQUALS -> Tree(LESS_EQUALS, lex.curFragment)
            NOT_EQUALS -> Tree(NOT_EQUALS, lex.curFragment)
            LESS -> Tree(LESS, lex.curFragment)
            GREATER -> Tree(GREATER, lex.curFragment)
            else -> throw ParserException(lex.curFragment, lex.curPos)
        }
    }
}