/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleexpressionevaluator;

import simpleexpressionevaluator.Operands;
import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author agi
 */

/*
This is a Bean Class, there is no need to test it.
This is testing Java itself and not really out program.
*/
public class OperandsTest {
    
    @Test
    public void shouldHoldTwoOperands() {
        Operands o = new Operands(12.0, 8.0);
    	assertThat(o.getFirstOperand(), is(12.0));
    	assertThat(o.getSecondOperand(), is(8.0));

    }
    
}
