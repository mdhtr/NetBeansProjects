/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleexpressionevaluator;

import java.io.*;
import simpleexpressionevaluator.expression.*;
import simpleexpressionevaluator.operator.*;
import simpleexpressionevaluator.outputwriter.*;

/**
 * Acceptance Specification This program should Given a simple mathematical
 * expression from the command line >> java SimpleExpression 12 + 8 When
 * executed, Then return the result to the command line Result: 20
 */
/**
 * This version goes as far as to apply a Factory design pattern, and a Builder
 * design pattern for reading from CL.
 */
/**
 *
 * @author agi
 */
public class SimpleExpressionEvaluator {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     * @throws simpleexpressionevaluator.operator.NoSuchOperatorException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, NoSuchOperatorException {
        //CommandLineExpressionBuilder builder = new CommandLineExpressionBuilder(args);
        //ConsoleOutputWriter writer = new ConsoleOutputWriter();
        //Evaluator evaluator = new Evaluator(builder, writer);
        //evaluator.evaluate();
        
        String line;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("results.txt"));
                    
        while ((line = bufferedReader.readLine()) != null) {
            String[] arguments = line.split("\\ ");

            Double o1 = Double.parseDouble(arguments[0]);
            Double o2 = Double.parseDouble(arguments[2]);
            Operands operands = new Operands(o1, o2);

            OperatorFactory factory = new OperatorFactory();
            Operator operator = factory.createOperator(arguments[1]);
            Expression expression = new Expression(operator, operands);
            
            Operator getoperator = expression.getOperator();
            Double result = getoperator.opearte(expression.getOperands());
            
            bufferedWriter.write("Result: " + result);
            bufferedWriter.newLine();
        }
       bufferedReader.close(); 
       bufferedWriter.close();
    }
}
