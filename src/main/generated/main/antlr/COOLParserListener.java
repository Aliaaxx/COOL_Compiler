// Generated from D:/UNI/Semester 8/Compilers/Project/Trial 2/CoolCompiler/src/main/antlr/COOLParser.g4 by ANTLR 4.13.2
package main.generated.main.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link COOLParser}.
 */
public interface COOLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link COOLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(COOLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link COOLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(COOLParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link COOLParser#classDef}.
	 * @param ctx the parse tree
	 */
	void enterClassDef(COOLParser.ClassDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link COOLParser#classDef}.
	 * @param ctx the parse tree
	 */
	void exitClassDef(COOLParser.ClassDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodFeature}
	 * labeled alternative in {@link COOLParser#feature}.
	 * @param ctx the parse tree
	 */
	void enterMethodFeature(COOLParser.MethodFeatureContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodFeature}
	 * labeled alternative in {@link COOLParser#feature}.
	 * @param ctx the parse tree
	 */
	void exitMethodFeature(COOLParser.MethodFeatureContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttributeFeature}
	 * labeled alternative in {@link COOLParser#feature}.
	 * @param ctx the parse tree
	 */
	void enterAttributeFeature(COOLParser.AttributeFeatureContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttributeFeature}
	 * labeled alternative in {@link COOLParser#feature}.
	 * @param ctx the parse tree
	 */
	void exitAttributeFeature(COOLParser.AttributeFeatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link COOLParser#formal}.
	 * @param ctx the parse tree
	 */
	void enterFormal(COOLParser.FormalContext ctx);
	/**
	 * Exit a parse tree produced by {@link COOLParser#formal}.
	 * @param ctx the parse tree
	 */
	void exitFormal(COOLParser.FormalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprWhile}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprWhile(COOLParser.ExprWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprWhile}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprWhile(COOLParser.ExprWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprComparison}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprComparison(COOLParser.ExprComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprComparison}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprComparison(COOLParser.ExprComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParen}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParen(COOLParser.ExprParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParen}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParen(COOLParser.ExprParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprString(COOLParser.ExprStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprString(COOLParser.ExprStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprCase}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprCase(COOLParser.ExprCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprCase}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprCase(COOLParser.ExprCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprFalse}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprFalse(COOLParser.ExprFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprFalse}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprFalse(COOLParser.ExprFalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprInt}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprInt(COOLParser.ExprIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprInt}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprInt(COOLParser.ExprIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprSelfDispatch}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprSelfDispatch(COOLParser.ExprSelfDispatchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprSelfDispatch}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprSelfDispatch(COOLParser.ExprSelfDispatchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNeg}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNeg(COOLParser.ExprNegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNeg}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNeg(COOLParser.ExprNegContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprTrue}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprTrue(COOLParser.ExprTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprTrue}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprTrue(COOLParser.ExprTrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNot}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNot(COOLParser.ExprNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNot}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNot(COOLParser.ExprNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprDispatch}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprDispatch(COOLParser.ExprDispatchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprDispatch}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprDispatch(COOLParser.ExprDispatchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprBlock}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprBlock(COOLParser.ExprBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprBlock}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprBlock(COOLParser.ExprBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(COOLParser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(COOLParser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMulDiv}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMulDiv(COOLParser.ExprMulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMulDiv}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMulDiv(COOLParser.ExprMulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprLet}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprLet(COOLParser.ExprLetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprLet}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprLet(COOLParser.ExprLetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprIsvoid}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprIsvoid(COOLParser.ExprIsvoidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprIsvoid}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprIsvoid(COOLParser.ExprIsvoidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNew}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNew(COOLParser.ExprNewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNew}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNew(COOLParser.ExprNewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAssign}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAssign(COOLParser.ExprAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAssign}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAssign(COOLParser.ExprAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprIf}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprIf(COOLParser.ExprIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprIf}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprIf(COOLParser.ExprIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprId(COOLParser.ExprIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link COOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprId(COOLParser.ExprIdContext ctx);
}