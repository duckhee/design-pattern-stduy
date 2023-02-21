package kr.co.won.designpatternstudy._15_interpreter._02_after;

import java.util.Map;

// x,y,z가 해당된는 것 -> Terminal Expression
public class VariableExpression implements PostfixExpression {

    private Character variable;

    public VariableExpression(Character variable) {
        this.variable = variable;
    }

    @Override
    public int interpret(Map<Character, Integer> context) {
        return context.get(variable);
    }
}
