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
public class Operands {
    private final double FirstOperand;
    private final double SecondOperand;

    public Operands(double o1, double o2) {
        this.FirstOperand = o1;
        this.SecondOperand = o2;
    }

    /**
     * @return the FirstOperand
     */
    public double getFirstOperand() {
        return FirstOperand;
    }

    /**
     * @return the SecondOperand
     */
    public double getSecondOperand() {
        return SecondOperand;
    }
    
}
