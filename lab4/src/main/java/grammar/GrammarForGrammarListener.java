// Generated from D:/ITMO/MT/lab4/src/main/java/grammar\GrammarForGrammar.g4 by ANTLR 4.9.2
package grammar;

import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarForGrammarParser}.
 */
public interface GrammarForGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarForGrammarParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(GrammarForGrammarParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGrammarParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(GrammarForGrammarParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarForGrammarParser#rule}.
	 * @param ctx the parse tree
	 */
	void enterRule(GrammarForGrammarParser.RuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGrammarParser#rule}.
	 * @param ctx the parse tree
	 */
	void exitRule(GrammarForGrammarParser.RuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarForGrammarParser#inh}.
	 * @param ctx the parse tree
	 */
	void enterInh(GrammarForGrammarParser.InhContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGrammarParser#inh}.
	 * @param ctx the parse tree
	 */
	void exitInh(GrammarForGrammarParser.InhContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarForGrammarParser#syn}.
	 * @param ctx the parse tree
	 */
	void enterSyn(GrammarForGrammarParser.SynContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGrammarParser#syn}.
	 * @param ctx the parse tree
	 */
	void exitSyn(GrammarForGrammarParser.SynContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarForGrammarParser#ntRule}.
	 * @param ctx the parse tree
	 */
	void enterNtRule(GrammarForGrammarParser.NtRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGrammarParser#ntRule}.
	 * @param ctx the parse tree
	 */
	void exitNtRule(GrammarForGrammarParser.NtRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarForGrammarParser#sequence}.
	 * @param ctx the parse tree
	 */
	void enterSequence(GrammarForGrammarParser.SequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGrammarParser#sequence}.
	 * @param ctx the parse tree
	 */
	void exitSequence(GrammarForGrammarParser.SequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarForGrammarParser#subsequence}.
	 * @param ctx the parse tree
	 */
	void enterSubsequence(GrammarForGrammarParser.SubsequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGrammarParser#subsequence}.
	 * @param ctx the parse tree
	 */
	void exitSubsequence(GrammarForGrammarParser.SubsequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarForGrammarParser#eps}.
	 * @param ctx the parse tree
	 */
	void enterEps(GrammarForGrammarParser.EpsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGrammarParser#eps}.
	 * @param ctx the parse tree
	 */
	void exitEps(GrammarForGrammarParser.EpsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarForGrammarParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(GrammarForGrammarParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGrammarParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(GrammarForGrammarParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarForGrammarParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(GrammarForGrammarParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGrammarParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(GrammarForGrammarParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarForGrammarParser#tRule}.
	 * @param ctx the parse tree
	 */
	void enterTRule(GrammarForGrammarParser.TRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGrammarParser#tRule}.
	 * @param ctx the parse tree
	 */
	void exitTRule(GrammarForGrammarParser.TRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarForGrammarParser#grName}.
	 * @param ctx the parse tree
	 */
	void enterGrName(GrammarForGrammarParser.GrNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGrammarParser#grName}.
	 * @param ctx the parse tree
	 */
	void exitGrName(GrammarForGrammarParser.GrNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarForGrammarParser#regexp}.
	 * @param ctx the parse tree
	 */
	void enterRegexp(GrammarForGrammarParser.RegexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGrammarParser#regexp}.
	 * @param ctx the parse tree
	 */
	void exitRegexp(GrammarForGrammarParser.RegexpContext ctx);
}