/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleexpressionevaluator;

import simpleexpressionevaluator.Subtraction;
import simpleexpressionevaluator.Operands;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author agi
 */
public class SubtractionTest {
   

    /**
     * Test of opearte method, of class Subtraction.
     */
    @Test
    public void shouldSubtract() {
        Subtraction s = new Subtraction();
    	Operands o = new Operands(23.0, 9.0);
    	assertThat(s.opearte(o), is(14.0));
    }
    
}
