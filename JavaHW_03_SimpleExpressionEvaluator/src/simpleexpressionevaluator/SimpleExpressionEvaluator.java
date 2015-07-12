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
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //CommandLineExpressionBuilder builder = new CommandLineExpressionBuilder(args);
        //ConsoleOutputWriter writer = new ConsoleOutputWriter();

        final FileInputStream fileInputStream = new FileInputStream(new File(args[0]));
        final FileOutputStream fileOutputStream = new FileOutputStream("results.txt");

        TextFileExpressionBuilder builder = new TextFileExpressionBuilder(fileInputStream);
        TextFileOutputWriter writer = new TextFileOutputWriter(fileOutputStream);

        Evaluator evaluator = new Evaluator(builder, writer);
        evaluator.evaluate();

        fileInputStream.close();
        fileOutputStream.close();
    }
}
