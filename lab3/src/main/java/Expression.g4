grammar Expression;

@header {
import java.util.*;
}

s returns [StringBuilder output] @init {
    Map<String, Integer> vars = new HashMap<>();
    StringBuilder output = new StringBuilder();
    $output = output;
} : (assign[vars, output])*;

assign [Map <String, Integer> vars, StringBuilder output]:
    var ASSIGN exp[vars] SEMICOLON { $vars.put($var.text, $exp.val);
        $output.append($var.text + " = " + $exp.val + ";\n"); };

exp [Map <String, Integer> vars] returns[int val]:
    mulDiv[vars] addSub[vars, $mulDiv.val] { $val = $addSub.val; };

addSub [Map <String, Integer> vars, int acc] returns[int val]:
    ADD mulDiv[vars] { $acc = $acc + $mulDiv.val; } addSub[vars, $acc] { $val = $addSub.val; } |
    SUB mulDiv[vars] { $acc = $acc - $mulDiv.val; } addSub[vars, $acc] { $val = $addSub.val; } |
    { $val = $acc; };

mulDiv [Map <String, Integer> vars] returns[int val]:
    single[vars] mulDivRight[vars, $single.val] { $val = $mulDivRight.val; };

mulDivRight [Map <String, Integer> vars, int acc] returns[int val]:
    MUL single[vars] { $acc = $acc * $single.val; } mulDivRight[vars, $acc] { $val = $mulDivRight.val; } |
    DIV single[vars] { $acc = $acc / $single.val; } mulDivRight[vars, $acc] { $val = $mulDivRight.val; } |
    { $val = $acc; };

single [Map <String, Integer> vars] returns[int val]:
    OB exp[vars] CB { $val = $exp.val; } |
    num { $val = Integer.parseInt($num.text); } |
    var {
        Integer varValue = $vars.get($var.text);
        $val = varValue == null ? 0 : varValue;
    };

num: NUM;
var: VAR;

// считать несущ переменные нулем

VAR: [a-z]+[A-Z]*;
NUM: [0-9]+;

OB: '(';
CB: ')';
ASSIGN: '=';
ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';

SEMICOLON: ';';
WS : [ \n\t\r]+ -> skip;
