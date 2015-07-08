/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleexpressionevaluator.outputwriter;

import simpleexpressionevaluator.outputwriter.OutputWriter;

/**
 *
 * @author agi
 */
public class ConsoleOutputWriter implements OutputWriter{

    @Override
    public void write(Double result) {
        System.out.println("Result: " + result);
    }
    
}
