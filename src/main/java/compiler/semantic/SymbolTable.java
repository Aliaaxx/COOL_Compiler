package main.java.compiler.semantic;

import main.java.compiler.ast.*;

import java.util.*;

public class SymbolTable {
    private final Stack<Scope> scopes = new Stack<>();
    private ClassInfo currentClass;
    private MethodInfo currentMethod;

    private final Map<String, ClassDef> classAstNodes = new HashMap<>();

    public void addClassAstNode(String className, ClassDef astNode) {
        classAstNodes.put(className, astNode);
    }

    public ClassDef getClassAstNode(String className) {
        return classAstNodes.get(className);
    }
    public void enterScope() {
        scopes.push(new Scope());
    }

    public void exitScope() {
        scopes.pop();
    }

    public void addSymbol(String name, Symbol symbol) {
        scopes.peek().put(name, symbol);
    }

    public Symbol lookup(String name) {
        for (int i = scopes.size() - 1; i >= 0; i--) {
            if (scopes.get(i).containsKey(name)) {
                return scopes.get(i).get(name);
            }
        }
        return null;
    }

    public void setCurrentClass(ClassInfo classInfo) {
        this.currentClass = classInfo;
    }

    public ClassInfo getCurrentClass() {
        return currentClass;
    }

    public void setCurrentMethod(MethodInfo methodInfo) {
        this.currentMethod = methodInfo;
    }

    public MethodInfo getCurrentMethod() {
        return currentMethod;
    }

    private static class Scope extends HashMap<String, Symbol> {}
}







