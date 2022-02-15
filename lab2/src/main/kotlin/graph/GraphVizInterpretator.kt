package graph

import syntax.Tree

class GraphVizInterpretator {
    companion object {
        fun interpret(tree: Tree): String {
            return "graph {\n${interpretToDOT(tree, 1)}\n}"
        }

        private fun interpretToDOT(tree: Tree, seed: Int): String {
            var number = seed
            val nodeName = tree.token + seed

            return "$nodeName[label=\"${tree.tokenValue}\"]\n" +
                    tree.children.joinToString("\n") {
                        "$nodeName -- ${it.token + (++number)}\n${interpretToDOT(it, number)}"
                    }
        }
    }
}