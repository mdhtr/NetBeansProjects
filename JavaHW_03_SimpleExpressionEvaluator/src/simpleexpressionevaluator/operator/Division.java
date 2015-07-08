/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleexpressionevaluator.operator;

import simpleexpressionevaluator.Operands;

/**
 *
 * @author agi
 */
public class Division implements Operator {

    @Override
    public Double opearte(Operands o) {
        return o.getFirstOperand() / o.getSecondOperand();
    }
    
}
