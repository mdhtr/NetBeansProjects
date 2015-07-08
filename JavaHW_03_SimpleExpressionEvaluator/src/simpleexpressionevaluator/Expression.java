/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleexpressionevaluator;

/**
 *
 * @author agi
 */
/**
 * Couples the elements of the expression together.
 */
public class Expression {

    private final Operator operator;
    private final Operands operands;

    public Expression(Operator operator, Operands operands) {
        this.operator = operator;
        this.operands = operands;
    }

    public Operands getOperands() {
        return operands;
    }

    public Operator getOperator() {
        return operator;
    }

}
