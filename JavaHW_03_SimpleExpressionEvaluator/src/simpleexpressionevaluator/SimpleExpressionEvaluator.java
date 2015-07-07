/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleexpressionevaluator;

/** Acceptance Specification
 * This program should 
 * Given a simple mathematical expression from the command line
 *    >> java SimpleExpression 12 + 8
 * When executed, Then return the result to the command line
 *    20
 */

/**
 * This version goes as far as to apply a Factory design pattern.
 */

/**
 *
 * @author agi
 */
public class SimpleExpressionEvaluator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Double o1 = Double.parseDouble(args[0]);
    	Double o2 = Double.parseDouble(args[2]);
                
        Operands operands = new Operands(o1, o2);
        
        OperatorFactory factory = new OperatorFactory();
    	try {
        		Operator operator =
			factory.createOperator(args[1]);

        		System.out.println(o1 + " " + args[1] + " " + o2
			+ " = " + operator.opearte(operands));

    	} catch (NoSuchOperatorException ex) {
        		System.err.println(ex);
    	}

    }
    
}
