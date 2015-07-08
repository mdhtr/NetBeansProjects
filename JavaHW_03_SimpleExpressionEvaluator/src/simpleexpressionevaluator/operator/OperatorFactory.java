/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleexpressionevaluator.operator;

/**
 *
 * @author agi
 */

/* Design Pattern: Factory Method / Virtual Constructor: 
 Define an interface for creating an object, 
 but let subclasses decide which class to instantiate.
 */
public class OperatorFactory {

    public Operator createOperator(final String operatorStr) throws NoSuchOperatorException {
        if (operatorStr.equals("+")) {
            return new Addition();
        }
        if (operatorStr.equals("-")) {
            return new Subtraction();
        }
        if (operatorStr.equals("*")) {
            return new Multiplication();
        }
        if (operatorStr.equals("/")) {
            return new Division();
        }
        // return null; // this is not a good practice. Throw exception instead!
        throw new NoSuchOperatorException("No factory rule defined for: '" + operatorStr + "'");
    }

}
