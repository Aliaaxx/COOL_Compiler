package main.java.compiler.ir;

import java.util.ArrayList;
import java.util.List;

public class TACFunction {
    public String name;
    public List<TACInstruction> instructions = new ArrayList<>();
    public int tempCounter = 0;

    public String newTemp() {
        return "t" + tempCounter++;
    }

    public void add(TACInstruction instr) {
        instructions.add(instr);
    }
}