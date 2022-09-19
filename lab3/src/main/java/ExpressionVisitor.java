// Generated from D:/ITMO/MT/lab3/src/main/java\Expression.g4 by ANTLR 4.9.2

import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExpressionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExpressionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(ExpressionParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(ExpressionParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(ExpressionParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#addSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(ExpressionParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#mulDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(ExpressionParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#mulDivRight}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivRight(ExpressionParser.MulDivRightContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#single}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle(ExpressionParser.SingleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(ExpressionParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(ExpressionParser.VarContext ctx);
}