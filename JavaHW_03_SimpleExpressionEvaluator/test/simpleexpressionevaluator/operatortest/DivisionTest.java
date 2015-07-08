/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleexpressionevaluator.operatortest;

import simpleexpressionevaluator.operator.Division;
import simpleexpressionevaluator.Operands;
import org.junit.Assert;
import org.junit.Test;
import simpleexpressionevaluator.Operands;
import static org.junit.Assert.*;

/**
 *
 * @author agi
 */
public class DivisionTest {

    /**
     * Test of opearte method, of class Division.
     */
    @Test
    public void shouldDivide() {
        Division d = new Division();
        Operands o = new Operands(21.0, 9.0);
        Assert.assertEquals(2.333, d.opearte(o), 0.001); // tests floating point number with the given precision

    }

}
