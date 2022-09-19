// Generated from D:/ITMO/MT/lab4/src/main/java/grammar\GrammarForGrammar.g4 by ANTLR 4.9.2
package grammar;

import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarForGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarForGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarForGrammarParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(GrammarForGrammarParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarForGrammarParser#rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule(GrammarForGrammarParser.RuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarForGrammarParser#inh}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInh(GrammarForGrammarParser.InhContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarForGrammarParser#syn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSyn(GrammarForGrammarParser.SynContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarForGrammarParser#ntRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNtRule(GrammarForGrammarParser.NtRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarForGrammarParser#sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence(GrammarForGrammarParser.SequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarForGrammarParser#subsequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubsequence(GrammarForGrammarParser.SubsequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarForGrammarParser#eps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEps(GrammarForGrammarParser.EpsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarForGrammarParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(GrammarForGrammarParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarForGrammarParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(GrammarForGrammarParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarForGrammarParser#tRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTRule(GrammarForGrammarParser.TRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarForGrammarParser#grName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrName(GrammarForGrammarParser.GrNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarForGrammarParser#regexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegexp(GrammarForGrammarParser.RegexpContext ctx);
}