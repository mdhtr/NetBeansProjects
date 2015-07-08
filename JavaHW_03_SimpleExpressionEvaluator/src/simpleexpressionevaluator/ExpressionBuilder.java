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

/* Design Pattern: Builder 
Separate the construction of a complex object from its representation so that
the same construction process can create different representations.
*/
public interface ExpressionBuilder {

    public boolean hasNext();

    public Expression getNext();

}
