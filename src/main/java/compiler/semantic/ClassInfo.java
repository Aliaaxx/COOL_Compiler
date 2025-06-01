package main.java.compiler.semantic;

import java.util.HashMap;
import java.util.Map;


public class ClassInfo extends Symbol {

    public final String parent;
    public final Map<String, VariableSymbol> attributes = new HashMap<>();
    public final Map<String, MethodInfo> methods = new HashMap<>();

    public ClassInfo(String name, String parent, int line, int column) {
        super(name, line, column);
        this.parent = parent;
    }
}
