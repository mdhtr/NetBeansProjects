/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahw_02;

/**
 *
 * @author agi
 */
class Evaluator {
    private final String operator;

    public Evaluator(String operator) {
        this.operator = operator;
    }

    int evaluate(Operands o) {
        if (operator.equals("+")){
            return o.getFirstOp() + o.getSecondOp();
        }
        if (operator.equals("-")){
            return o.getFirstOp() - o.getSecondOp();
        }
        if (operator.equals("*")){
            return o.getFirstOp() * o.getSecondOp();
        }
        if (operator.equals("/")){
            return o.getFirstOp() / o.getSecondOp();
        }
        return 0;
    }
    
}
