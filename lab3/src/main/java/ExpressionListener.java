// Generated from D:/ITMO/MT/lab3/src/main/java\Expression.g4 by ANTLR 4.9.2

import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpressionParser}.
 */
public interface ExpressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(ExpressionParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(ExpressionParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(ExpressionParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(ExpressionParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(ExpressionParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(ExpressionParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#addSub}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(ExpressionParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#addSub}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(ExpressionParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#mulDiv}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(ExpressionParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#mulDiv}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(ExpressionParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#mulDivRight}.
	 * @param ctx the parse tree
	 */
	void enterMulDivRight(ExpressionParser.MulDivRightContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#mulDivRight}.
	 * @param ctx the parse tree
	 */
	void exitMulDivRight(ExpressionParser.MulDivRightContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#single}.
	 * @param ctx the parse tree
	 */
	void enterSingle(ExpressionParser.SingleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#single}.
	 * @param ctx the parse tree
	 */
	void exitSingle(ExpressionParser.SingleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(ExpressionParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(ExpressionParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(ExpressionParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(ExpressionParser.VarContext ctx);
}