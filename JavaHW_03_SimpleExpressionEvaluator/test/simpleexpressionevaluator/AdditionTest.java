/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleexpressionevaluator;

import simpleexpressionevaluator.Operands;
import simpleexpressionevaluator.Addition;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author agi
 */
public class AdditionTest {
    
    @Test
    public void shouldAdd() {
        
        Addition a = new Addition();
    	Operands o = new Operands(23.0, 9.0);
    	assertThat(a.opearte(o), is(32.0));

    }
    
}
