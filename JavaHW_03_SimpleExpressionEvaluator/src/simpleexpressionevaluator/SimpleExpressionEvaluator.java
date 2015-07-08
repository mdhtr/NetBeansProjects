/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleexpressionevaluator;

import simpleexpressionevaluator.expression.CommandLineExpressionBuilder;
import simpleexpressionevaluator.outputwriter.ConsoleOutputWriter;

/** Acceptance Specification
 * This program should 
 * Given a simple mathematical expression from the command line
 *    >> java SimpleExpression 12 + 8
 * When executed, Then return the result to the command line
 *    Result: 20
 */

/**
 * This version goes as far as to apply a Factory design pattern,
 * and a Builder design pattern for reading from CL.
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
        CommandLineExpressionBuilder builder = new CommandLineExpressionBuilder(args);
    	ConsoleOutputWriter writer = new ConsoleOutputWriter();

    	Evaluator evaluator = new Evaluator(builder, writer);
    	evaluator.evaluate();
    } 
}
