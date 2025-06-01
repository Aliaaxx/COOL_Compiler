/*
package main.java.compiler.semantics;

import main.generated.main.antlr.COOLParser;
import main.generated.main.antlr.COOLParserBaseListener;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class COOLBaseListener extends COOLParserBaseListener {
    private ParseTreeProperty<Object> values = new ParseTreeProperty<>();
    private SymbolTable symbolTable = new SymbolTable();

    // Helper methods remain the same
    protected void saveValue(ParseTree node, Object value) {
        values.put(node, value);
    }

    protected Object getValue(ParseTree node) {
        return values.get(node);
    }

    @Override
    public void enterClassDef(COOLParser.ClassDefContext ctx) {
        String className = ctx.TYPE_ID(0).getText();
        symbolTable.enterScope(className);

        if (ctx.INHERITS() != null) {
            String parentClass = ctx.TYPE_ID(1).getText();
            // Handle inheritance here
        }
    }

    @Override
    public void exitClassDef(COOLParser.ClassDefContext ctx) {
        symbolTable.exitScope();
    }


    /*
    public void enterFeature(COOLParser.FeatureContext ctx) {
        if (ctx.ID() != null && ctx.TYPE_ID() != null) {
            String name = ctx.ID().getText();
            String type = ctx.TYPE_ID().getText();

            if (!symbolTable.addSymbol(name, type)) {
                System.err.println("Error: Duplicate symbol " + name +
                        " at line " + ctx.ID().getSymbol().getLine());
            }
        }
    }*/
/*
    @Override
    public void enterFeature(COOLParser.FeatureContext ctx) {
        if (ctx instanceof COOLParser.MethodFeatureContext) {
            COOLParser.MethodFeatureContext methodCtx = (COOLParser.MethodFeatureContext) ctx;
            String name = methodCtx.ID().getText();
            String type = methodCtx.TYPE_ID().getText();

            if (!symbolTable.addSymbol(name, type)) {
                System.err.println("Error: Duplicate method " + name +
                        " at line " + methodCtx.ID().getSymbol().getLine());
            }
        }
        else if (ctx instanceof COOLParser.AttributeFeatureContext) {
            COOLParser.AttributeFeatureContext attrCtx = (COOLParser.AttributeFeatureContext) ctx;
            String name = attrCtx.ID().getText();
            String type = attrCtx.TYPE_ID().getText();

            if (!symbolTable.addSymbol(name, type)) {
                System.err.println("Error: Duplicate attribute " + name +
                        " at line " + attrCtx.ID().getSymbol().getLine());
            }
        }
    }
}
*/