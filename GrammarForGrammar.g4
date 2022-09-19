grammar GrammarForGrammar;

@header {
import java.util.*;
}

s returns[Grammar grammar] @init {
    Grammar grammar = new Grammar("", new ArrayList<>(), new ArrayList<>());
    $grammar = grammar;
} : grName (rule[grammar])* { $grammar.name = $grName.name; };

rule[Grammar grammar]: ntRule[grammar] | tRule[grammar];

ntRule[Grammar grammar]: NAME inh? syn? body[grammar] {
    $grammar.rules.add(new Rule(new RuleDeclaration($NAME, $inh.text, $syn.text), $body.ruleBody));
};

inh: INH;
syn: SYN;

body[Grammar grammar] returns[RuleBody ruleBody] @init {
    List<Element> elems = ArrayList<>();
} : CU_OB elem[elems]+ (OR elem[elems]+)* CU_CB { $ruleBody = new RuleBody(elems); };

elem[List<Element> elems]:
    NAME inh? code? { $elems.add(new Element($NAME, $inh.text, $code.text)); } |
    T_NAME { $elems.add(new Element($T_NAME, "", "")); } |
    eps code? { $elems.add(new Element("", "", $code.text)); };

eps: EPS;

code: CODE;

tRule[Grammar grammar]: T_NAME CU_OB regexp CU_CB { $grammar.terminals.add(new Terminal($T_NAME.text, $regexp.text)); } ;

grName returns[String name]: GRAMMAR NAME SEMICOLON { $name = $NAME; };

regexp: REGEXP;

REGEXP: '"'.*?'"';
INH: RO_OB .*? RO_CB;
SYN: SQ_OB .*? SQ_CB;
CODE: TR_OB .*? TR_CB;

COLON: ':';
SEMICOLON: ';';
BODY: '->';
OR: '|';
EPS: '@eps';

RO_OB: '(';
RO_CB: ')';
SQ_OB: '[';
SQ_CB: ']';
CU_OB: '{';
CU_CB: '}';
TR_OB: '<';
TR_CB: '>';

GRAMMAR: 'grammar';

T_NAME: [A-Z]+;
NAME: [a-z]+[a-zA-Z]*;

WS: [ \t\r\n]+ -> skip;