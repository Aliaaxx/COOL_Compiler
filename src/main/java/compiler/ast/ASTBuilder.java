/*
package main.java.compiler.ast;
import main.java.generated.COOLParser;

import main.java.generated.COOLParser;
import main.java.generated.COOLParserBaseVisitor;
import main.java.compiler.ast.*;
import cool.parser.CoolParser;
import cool.parser.CoolParserBaseVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ASTBuilder extends COOLParserBaseVisitor<ASTNode> {

    @Override
    public ASTNode visitProgram(COOLParser.ProgramContext ctx) {
        List<ClassDef> classes = ctx.classDef().stream()
                .map(classDef -> (ClassDef)visit(classDef))
                .collect(Collectors.toList());

        return new Program(classes, ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public ASTNode visitClassDef(COOLParser.ClassDefContext ctx) {
        String className = ctx.TYPE_ID(0).getText();
        String parentClass = ctx.TYPE_ID().size() > 1 ? ctx.TYPE_ID(1).getText() : null;

        List<Feature> features = ctx.feature().stream()
                .map(feature -> (Feature)visit(feature))
                .collect(Collectors.toList());

        return new ClassDef(className, parentClass, features,
                ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public ASTNode visitFeature(COOLParser.FeatureContext ctx) {
        if (ctx.OBJECT_ID() != null && ctx.LPAREN() != null) {
            // Method definition
            String methodName = ctx.OBJECT_ID().getText();
            String returnType = ctx.TYPE_ID().getText();

            List<Formal> formals = ctx.formal().stream()
                    .map(formal -> (Formal)visit(formal))
                    .collect(Collectors.toList());

            Expression body = (Expression)visit(ctx.expr());

            return new Method(methodName, formals, returnType, body,
                    ctx.start.getLine(), ctx.start.getCharPositionInLine());
        } else {
            // Attribute definition
            String attrName = ctx.OBJECT_ID().getText();
            String attrType = ctx.TYPE_ID().getText();
            Expression init = ctx.expr() != null ?
                    (Expression)visit(ctx.expr()) : null;

            return new Attribute(attrName, attrType, init,
                    ctx.start.getLine(), ctx.start.getCharPositionInLine());
        }
    }

    @Override
    public ASTNode visitFormal(COOLParser.FormalContext ctx) {
        String paramName = ctx.OBJECT_ID().getText();
        String paramType = ctx.TYPE_ID().getText();
        return new Formal(paramName, paramType,
                ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public ASTNode visitExprInt(COOLParser.ExprIntContext ctx) {
        int value = Integer.parseInt(ctx.INTEGER().getText());
        return new IntLiteral(value,
                ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public ASTNode visitExprString(COOLParser.ExprStringContext ctx) {
        String text = ctx.STRING().getText();
        // Remove surrounding quotes
        String value = text.substring(1, text.length() - 1);
        return new StringLiteral(value,
                ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public ASTNode visitExprBool(COOLParser.ExprBoolContext ctx) {
        boolean value = ctx.BOOL().getText().equals("true");
        return new BoolLiteral(value,
                ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public ASTNode visitExprId(COOLParser.ExprIdContext ctx) {
        return new Identifier(ctx.OBJECT_ID().getText(),
                ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public ASTNode visitExprAssign(COOLParser.ExprAssignContext ctx) {
        String varName = ctx.OBJECT_ID().getText();
        Expression value = (Expression)visit(ctx.expr());
        return new Assignment(varName, value,
                ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public ASTNode visitExprIf(COOLParser.ExprIfContext ctx) {
        Expression cond = (Expression)visit(ctx.expr(0));
        Expression thenBranch = (Expression)visit(ctx.expr(1));
        Expression elseBranch = (Expression)visit(ctx.expr(2));
        return new If(cond, thenBranch, elseBranch,
                ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public ASTNode visitExprWhile(COOLParser.ExprWhileContext ctx) {
        Expression cond = (Expression)visit(ctx.expr(0));
        Expression body = (Expression)visit(ctx.expr(1));
        return new While(cond, body,
                ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public ASTNode visitExprBlock(COOLParser.ExprBlockContext ctx) {
        List<Expression> expressions = ctx.expr().stream()
                .map(expr -> (Expression)visit(expr))
                .collect(Collectors.toList());
        return new Block(expressions,
                ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public ASTNode visitExprLet(COOLParser.ExprLetContext ctx) {
        List<Let.Binding> bindings = new ArrayList<>();
        for (CoolParser.LetBindingContext bindingCtx : ctx.letBinding()) {
            String varName = bindingCtx.OBJECT_ID().getText();
            String varType = bindingCtx.TYPE_ID().getText();
            Expression init = bindingCtx.expr() != null ?
                    (Expression)visit(bindingCtx.expr()) : null;
            bindings.add(new Let.Binding(varName, varType, init));
        }

        Expression body = (Expression)visit(ctx.expr());
        return new Let(bindings, body,
                ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public ASTNode visitExprCase(COOLParser.ExprCaseContext ctx) {
        Expression expr = (Expression)visit(ctx.expr());

        List<CaseBranch> branches = ctx.caseBranch().stream()
                .map(branchCtx -> {
                    String varName = branchCtx.OBJECT_ID().getText();
                    String varType = branchCtx.TYPE_ID().getText();
                    Expression branchExpr = (Expression)visit(branchCtx.expr());
                    return new CaseBranch(varName, varType, branchExpr,
                            branchCtx.start.getLine(),
                            branchCtx.start.getCharPositionInLine());
                })
                .collect(Collectors.toList());

        return new Case(expr, branches,
                ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public ASTNode visitExprNew(COOLParser.ExprNewContext ctx) {
        String type = ctx.TYPE_ID().getText();
        return new New(type,
                ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public ASTNode visitExprIsvoid(COOLParser.ExprIsvoidContext ctx) {
        Expression expr = (Expression)visit(ctx.expr());
        return new IsVoid(expr,
                ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public ASTNode visitExprNot(COOLParser.ExprNotContext ctx) {
        Expression expr = (Expression)visit(ctx.expr());
        return new Not(expr,
                ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public ASTNode visitExprParen(COOLParser.ExprParenContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public ASTNode visitExprMultDiv(COOLParser.ExprMultDivContext ctx) {
        Expression left = (Expression)visit(ctx.expr(0));
        Expression right = (Expression)visit(ctx.expr(1));
        String operator = ctx.op.getText();

        if (operator.equals("*")) {
            return new Multiply(left, right,
                    ctx.start.getLine(), ctx.start.getCharPositionInLine());
        } else {
            return new Divide(left, right,
                    ctx.start.getLine(), ctx.start.getCharPositionInLine());
        }
    }

    @Override
    public ASTNode visitExprPlusMinus(COOLParser.ExprPlusMinusContext ctx) {
        Expression left = (Expression)visit(ctx.expr(0));
        Expression right = (Expression)visit(ctx.expr(1));
        String operator = ctx.op.getText();

        if (operator.equals("+")) {
            return new Plus(left, right,
                    ctx.start.getLine(), ctx.start.getCharPositionInLine());
        } else {
            return new Minus(left, right,
                    ctx.start.getLine(), ctx.start.getCharPositionInLine());
        }
    }

    @Override
    public ASTNode visitExprComparison(COOLParser.ExprComparisonContext ctx) {
        Expression left = (Expression)visit(ctx.expr(0));
        Expression right = (Expression)visit(ctx.expr(1));
        String operator = ctx.op.getText();

        switch (operator) {
            case "<": return new LessThan(left, right, ctx.start.getLine(), ctx.start.getCharPositionInLine());
            case "<=": return new LessThanOrEqual(left, right, ctx.start.getLine(), ctx.start.getCharPositionInLine());
            case "=": return new Equal(left, right, ctx.start.getLine(), ctx.start.getCharPositionInLine());
            default: throw new RuntimeException("Unknown comparison operator: " + operator);
        }
    }

    @Override
    public ASTNode visitExprDispatch(COOLParser.ExprDispatchContext ctx) {
        Expression caller = ctx.expr().size() > 0 ? (Expression)visit(ctx.expr(0)) : null;
        String methodName = ctx.OBJECT_ID().getText();

        List<Expression> args = ctx.expr().stream()
                .skip(caller != null ? 1 : 0)
                .map(expr -> (Expression)visit(expr))
                .collect(Collectors.toList());

        String staticType = ctx.TYPE_ID() != null ? ctx.TYPE_ID().getText() : null;

        return new Dispatch(caller, methodName, args, staticType,
                ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }
}

--------------------------------------------------------------------------------
*/

package main.java.compiler.ast;

import main.generated.main.antlr.COOLParser;
import main.generated.main.antlr.COOLParserBaseVisitor;
import main.java.compiler.ast.*;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ASTBuilder extends COOLParserBaseVisitor<ASTNode> {

    @Override
    public ASTNode visitProgram(COOLParser.ProgramContext ctx) {
        List<ClassDef> classes = ctx.classDef().stream()
                .map(classDef -> (ClassDef)visit(classDef))
                .collect(Collectors.toList());
        return new Program(classes, ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public ASTNode visitClassDef(COOLParser.ClassDefContext ctx) {
        String className = ctx.TYPE_ID(0).getText();
        String parentClass = ctx.TYPE_ID().size() > 1 ? ctx.TYPE_ID(1).getText() : null;

        List<Feature> features = ctx.feature().stream()
                .map(feature -> (Feature)visit(feature))
                .collect(Collectors.toList());

        return new ClassDef(className, parentClass, features,
                ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }
    public ASTNode visitMethodFeature(COOLParser.MethodFeatureContext ctx) {
        String methodName = ctx.ID().getText();
        String returnType = ctx.TYPE_ID().getText();

        List<Formal> formals = new ArrayList<>();
        if (ctx.formal() != null) {
            for (COOLParser.FormalContext formalCtx : ctx.formal()) {
                formals.add((Formal) visit(formalCtx));
            }
        }

        Expression body = (Expression) visit(ctx.expr());
        return new Method(methodName, formals, returnType, body,
                ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }
    /*
    @Override
    public ASTNode visitMethodFeature(COOLParser.MethodFeatureContext ctx) {
        if (ctx instanceof COOLParser.MethodFeatureContext) {
            // Handle method feature
            COOLParser.MethodFeatureContext methodCtx = (COOLParser.MethodFeatureContext) ctx;
            String methodName = methodCtx.ID().getText();
            String returnType = methodCtx.TYPE_ID().getText();

            List<Formal> formals = new ArrayList<>();
            if (methodCtx.formal() != null) {
                for (COOLParser.FormalContext formalCtx : methodCtx.formal()) {
                    formals.add((Formal) visit(formalCtx));
                }
            }

            Expression body = (Expression) visit(methodCtx.expr());
            return new Method(methodName, formals, returnType, body,
                    ctx.start.getLine(), ctx.start.getCharPositionInLine());
        } else if (ctx instanceof COOLParser.AttributeFeatureContext) {
            // Handle attribute feature
            COOLParser.AttributeFeatureContext attrCtx = (COOLParser.AttributeFeatureContext) ctx;
            String attrName = attrCtx.ID().getText();
            String attrType = attrCtx.TYPE_ID().getText();
            Expression init = attrCtx.expr() != null ?
                    (Expression) visit(attrCtx.expr()) : null;

            return new Attribute(attrName, attrType, init,
                    ctx.start.getLine(), ctx.start.getCharPositionInLine());
        }
        throw new RuntimeException("Unknown feature type");
    }
    */
    @Override
    public ASTNode visitAttributeFeature(COOLParser.AttributeFeatureContext ctx) {
        String attrName = ctx.ID().getText();
        String attrType = ctx.TYPE_ID().getText();
        Expression init = ctx.expr() != null ?
                (Expression) visit(ctx.expr()) : null;

        return new Attribute(attrName, attrType, init,
                ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }
    @Override
    public ASTNode visitFormal(COOLParser.FormalContext ctx) {
        String paramName = ctx.ID().getText();
        String paramType = ctx.TYPE_ID().getText();
        return new Formal(paramName, paramType,
                ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    // Expression visitors
    @Override
    public ASTNode visitExprAssign(COOLParser.ExprAssignContext ctx) {
        String varName = ctx.ID().getText();
        Expression value = (Expression)visit(ctx.expr());
        return new Assignment(varName, value,
                ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public ASTNode visitExprDispatch(COOLParser.ExprDispatchContext ctx) {
        Expression caller = (Expression)visit(ctx.expr(0));
        String methodName = ctx.ID().getText();

        List<Expression> args = ctx.expr().stream()
                .skip(1)
                .map(expr -> (Expression)visit(expr))
                .collect(Collectors.toList());

        String staticType = ctx.TYPE_ID() != null ? ctx.TYPE_ID().getText() : null;

        return new Dispatch(caller, methodName, args, staticType,
                ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public ASTNode visitExprSelfDispatch(COOLParser.ExprSelfDispatchContext ctx) {
        String methodName = ctx.ID().getText();

        List<Expression> args = ctx.expr().stream()
                .map(expr -> (Expression)visit(expr))
                .collect(Collectors.toList());

        return new Dispatch(null, methodName, args, null,
                ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public ASTNode visitExprIf(COOLParser.ExprIfContext ctx) {
        Expression cond = (Expression)visit(ctx.expr(0));
        Expression thenBranch = (Expression)visit(ctx.expr(1));
        Expression elseBranch = (Expression)visit(ctx.expr(2));
        return new If(cond, thenBranch, elseBranch,
                ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public ASTNode visitExprWhile(COOLParser.ExprWhileContext ctx) {
        Expression cond = (Expression)visit(ctx.expr(0));
        Expression body = (Expression)visit(ctx.expr(1));
        return new While(cond, body,
                ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public ASTNode visitExprBlock(COOLParser.ExprBlockContext ctx) {
        List<Expression> expressions = ctx.expr().stream()
                .map(expr -> (Expression)visit(expr))
                .collect(Collectors.toList());
        return new Block(expressions,
                ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public ASTNode visitExprLet(COOLParser.ExprLetContext ctx) {
        List<Let.Binding> bindings = new ArrayList<>();
        for (int i = 0; i < ctx.ID().size(); i++) {
            String varName = ctx.ID(i).getText();
            String varType = ctx.TYPE_ID(i).getText();
            Expression init = ctx.expr(i) != null ?
                    (Expression)visit(ctx.expr(i)) : null;
            bindings.add(new Let.Binding(varName, varType, init));
        }

        Expression body = (Expression)visit(ctx.expr(ctx.expr().size()-1));
        return new Let(bindings, body,
                ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public ASTNode visitExprCase(COOLParser.ExprCaseContext ctx) {
        Expression expr = (Expression)visit(ctx.expr(0));

        List<CaseBranch> branches = new ArrayList<>();
        for (int i = 0; i < ctx.ID().size(); i++) {
            String varName = ctx.ID(i).getText();
            String varType = ctx.TYPE_ID(i).getText();
            Expression branchExpr = (Expression)visit(ctx.expr(i+1));
            branches.add(new CaseBranch(varName, varType, branchExpr,
                    ctx.start.getLine(), ctx.start.getCharPositionInLine()));
        }

        return new Case(expr, branches,
                ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public ASTNode visitExprNew(COOLParser.ExprNewContext ctx) {
        String type = ctx.TYPE_ID().getText();
        return new New(type,
                ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public ASTNode visitExprIsvoid(COOLParser.ExprIsvoidContext ctx) {
        Expression expr = (Expression)visit(ctx.expr());
        return new IsVoid(expr,
                ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public ASTNode visitExprNot(COOLParser.ExprNotContext ctx) {
        Expression expr = (Expression)visit(ctx.expr());
        return new Not(expr,
                ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public ASTNode visitExprNeg(COOLParser.ExprNegContext ctx) {
        Expression expr = (Expression)visit(ctx.expr());
        return new Negate(expr,
                ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public ASTNode visitExprMulDiv(COOLParser.ExprMulDivContext ctx) {
        Expression left = (Expression)visit(ctx.expr(0));
        Expression right = (Expression)visit(ctx.expr(1));
        //String operator = ctx.op.getText();

        if (ctx.MUL() != null) {
            return new Multiply(left, right,
                    ctx.start.getLine(), ctx.start.getCharPositionInLine());
        } else {
            return new Divide(left, right,
                    ctx.start.getLine(), ctx.start.getCharPositionInLine());
        }
    }

    @Override
    public ASTNode visitExprAddSub(COOLParser.ExprAddSubContext ctx) {
        Expression left = (Expression)visit(ctx.expr(0));
        Expression right = (Expression)visit(ctx.expr(1));

        // Check which alternative was used
        if (ctx.ADD() != null) {
            return new Plus(left, right,
                    ctx.start.getLine(), ctx.start.getCharPositionInLine());
        } else {
            return new Minus(left, right,
                    ctx.start.getLine(), ctx.start.getCharPositionInLine());
        }
    }

    @Override
    public ASTNode visitExprComparison(COOLParser.ExprComparisonContext ctx) {
        Expression left = (Expression)visit(ctx.expr(0));
        Expression right = (Expression)visit(ctx.expr(1));

        // Check which comparison operator was used
        if (ctx.LT() != null) {
            return new LessThan(left, right,
                    ctx.start.getLine(), ctx.start.getCharPositionInLine());
        }
        else if (ctx.LE() != null) {
            return new LessThanOrEqual(left, right,
                    ctx.start.getLine(), ctx.start.getCharPositionInLine());
        }
        else if (ctx.EQUAL() != null) {
            return new Equal(left, right,
                    ctx.start.getLine(), ctx.start.getCharPositionInLine());
        }
        else {
            throw new RuntimeException("Unknown comparison operator");
        }
    }

    @Override
    public ASTNode visitExprParen(COOLParser.ExprParenContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public ASTNode visitExprId(COOLParser.ExprIdContext ctx) {
        return new Identifier(ctx.ID().getText(),
                ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public ASTNode visitExprInt(COOLParser.ExprIntContext ctx) {
        int value = Integer.parseInt(ctx.INT().getText());
        return new IntLiteral(value,
                ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public ASTNode visitExprString(COOLParser.ExprStringContext ctx) {
        String text = ctx.STRING().getText();
        String value = text.substring(1, text.length() - 1);
        return new StringLiteral(value,
                ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public ASTNode visitExprTrue(COOLParser.ExprTrueContext ctx) {
        return new BoolLiteral(true,
                ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public ASTNode visitExprFalse(COOLParser.ExprFalseContext ctx) {
        return new BoolLiteral(false,
                ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }
}