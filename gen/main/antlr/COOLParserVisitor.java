// Generated from D:/UNI/Semester 8/Compilers/Project/Trial 2/CoolCompiler/src/main/antlr/COOLParser.g4 by ANTLR 4.13.2
package main.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link COOLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface COOLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link COOLParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(COOLParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link COOLParser#classDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDef(COOLParser.ClassDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link COOLParser#feature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeature(COOLParser.FeatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link COOLParser#formal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal(COOLParser.FormalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprWhile}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprWhile(COOLParser.ExprWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprComparison}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprComparison(COOLParser.ExprComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParen}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParen(COOLParser.ExprParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprString(COOLParser.ExprStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprCase}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCase(COOLParser.ExprCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprFalse}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFalse(COOLParser.ExprFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprInt}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprInt(COOLParser.ExprIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprSelfDispatch}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSelfDispatch(COOLParser.ExprSelfDispatchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNeg}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNeg(COOLParser.ExprNegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprTrue}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprTrue(COOLParser.ExprTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNot}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNot(COOLParser.ExprNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprDispatch}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDispatch(COOLParser.ExprDispatchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprBlock}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBlock(COOLParser.ExprBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAddSub(COOLParser.ExprAddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMulDiv}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMulDiv(COOLParser.ExprMulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprLet}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLet(COOLParser.ExprLetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprIsvoid}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprIsvoid(COOLParser.ExprIsvoidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNew}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNew(COOLParser.ExprNewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAssign}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAssign(COOLParser.ExprAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprIf}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprIf(COOLParser.ExprIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprId(COOLParser.ExprIdContext ctx);
}