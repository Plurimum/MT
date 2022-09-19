grammar GrammarForGrammar;

@header {
import java.util.*;
}

s returns[Grammar grammar] @init {
    Grammar grammar = new Grammar("", new ArrayList<>(), new ArrayList<>());
    $grammar = grammar;
} : grName (rule[grammar])* { $grammar.name = $grName.n; };

rule[Grammar grammar]: ntRule[grammar] | tRule[grammar];

inh: INH;
syn: SYN;

ntRule[Grammar grammar]: name inh syn CU_OB
    sequence[grammar, new RuleDeclaration($name.text, $inh.text, $syn.text)]
    (OR sequence[grammar, new RuleDeclaration($name.text, $inh.text, $syn.text)])*
CU_CB;

sequence[Grammar grammar, RuleDeclaration decl] @init {
    List<Sequence> sequences = new ArrayList<>();
}:
    (subsequence { sequences.add($subsequence.seq); })+ { $grammar.rules.add(new Rule($decl, new RuleBody(sequences))); }
    | eps code? { $grammar.rules.add(new Rule($decl, new RuleBody(List.of(new Sequence(List.of(), $code.text))))); }
    ;

subsequence returns [Sequence seq] @init {
    List<Element> elements = new ArrayList<>();
}:
    (name inh? { elements.add(new Element($name.text, $inh.text)); })+
    code { $seq = new Sequence(elements, $code.text); }
    ;

eps: EPS;
code: CODE;
name: NAME | T_NAME;

tRule[Grammar grammar]: name CU_OB regexp CU_CB { $grammar.terminals.add(new Terminal($name.text, $regexp.text)); } ;

grName returns[String n]: GRAMMAR name SEMICOLON { $n = $name.text; };

regexp: REGEXP;

REGEXP: '"'.*?'"';
INH: RO_OB .*? RO_CB;
SYN: SQ_OB .*? SQ_CB;
CODE: TR_OB .*? TR_CB;

SEMICOLON: ';';
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
NAME: [a-z]+[A-Z]*;

WS: [ \t\r\n]+ -> skip;