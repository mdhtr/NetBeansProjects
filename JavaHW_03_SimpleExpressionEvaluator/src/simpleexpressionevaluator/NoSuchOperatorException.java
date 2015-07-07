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
class NoSuchOperatorException extends Exception {
    public NoSuchOperatorException(final String msg) {
        super(msg);
    }
    
}
