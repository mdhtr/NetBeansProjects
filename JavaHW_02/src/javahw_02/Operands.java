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
class Operands {

    private final double firstOp;
    private final double secondOp;

    public Operands(String firstOp, String secondOp) {
        this.firstOp = Double.parseDouble(firstOp);
        this.secondOp = Double.parseDouble(secondOp);
    }

    /**
     * @return the firstOp
     */
    public double getFirstOp() {
        return firstOp;
    }

    /**
     * @return the secondOp
     */
    public double getSecondOp() {
        return secondOp;
    }

}
