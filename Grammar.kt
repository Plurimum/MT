package grammar_parser

class Grammar(var name: String, val terminals: List<Terminal>, val rules: List<Rule>) {

    data class Rule(val decl: RuleDeclaration, val body: RuleBody)

    data class RuleDeclaration(val name: String, val inherited: String, val synthesized: String)

    data class Element(val name: String, val inherited: String, val code: String)

    data class RuleBody(val elements: List<Element>)

    data class Terminal(val name: String, val value: String)
}