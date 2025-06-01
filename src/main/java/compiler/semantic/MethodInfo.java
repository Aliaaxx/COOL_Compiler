package main.java.compiler.semantic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MethodInfo extends Symbol {
    public final String returnType;
    public final List<VariableSymbol> formals = new ArrayList<>();
    public final Map<String, VariableSymbol> locals = new HashMap<>();

    public MethodInfo(String name, String returnType, int line, int column) {
        super(name, line, column);
        this.returnType = returnType;
    }
}