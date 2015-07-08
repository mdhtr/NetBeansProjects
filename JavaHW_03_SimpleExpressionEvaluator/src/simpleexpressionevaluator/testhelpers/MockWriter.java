/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleexpressionevaluator.testhelpers;

import simpleexpressionevaluator.outputwriter.OutputWriter;

/**
 *
 * @author agi
 */
public class MockWriter implements OutputWriter{
    public Double writtenValue = 0.0;
    
    	@Override
    	public void write(final Double result) {
       		writtenValue = result;
    	}

}
