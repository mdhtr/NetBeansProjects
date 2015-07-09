/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleexpressionevaluator.operator;

import simpleexpressionevaluator.Operands;
import simpleexpressionevaluator.operator.Multiplication;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import simpleexpressionevaluator.Operands;
import static org.junit.Assert.*;

/**
 *
 * @author agi
 */
public class MultiplicationTest {

    /**
     * Test of opearte method, of class Multiplication.
     */
    @Test
    public void shouldMultiplacate() {
        Multiplication m = new Multiplication();
        Operands o = new Operands(16.0, 2.0);
        assertThat(m.opearte(o), is(32.0));

    }

}
