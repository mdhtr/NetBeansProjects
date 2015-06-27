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

    private final int firstOp;
    private final int secondOp;

    public Operands(String firstOp, String secondOp) {
        this.firstOp = Integer.parseInt(firstOp);
        this.secondOp = Integer.parseInt(secondOp);
    }

    /**
     * @return the firstOp
     */
    public int getFirstOp() {
        return firstOp;
    }

    /**
     * @return the secondOp
     */
    public int getSecondOp() {
        return secondOp;
    }

}
