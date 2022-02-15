package syntax

import lexis.Token

class Tree(val token: String, val tokenValue: String, vararg val children: Tree) {
    constructor(token: Token, tokenValue: String, vararg children: Tree) : this(token.toString(), tokenValue, *children)
}