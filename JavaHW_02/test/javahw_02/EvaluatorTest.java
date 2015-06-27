/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahw_02;

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
public class EvaluatorTest {
    // this happens in the init phase
    private Operands o; // = new Operands("2", "3"); // moved to ctor phase
    
    public EvaluatorTest() {
        // this happens in constructor phase
        this.o = new Operands("2", "3");
    }
    
    @BeforeClass
    public static void setUpClass() {
        // this happens after ctor and before any of the test functions (@Test)
    }
    
    @AfterClass
    public static void tearDownClass() {
        // this happens after every test function but before the test class finalizes itelf
    }
    
    @Before
    public void setUp() {
        // this happens before every test function (annotated with @Test)
    }
    
    @After
    public void tearDown() {
        // this happens after every test function (annotated with @Test)
    }

    /**
     * Test of evaluate method, of class Evaluator.
     */
    @Test
    public void shouldEvaluateAddition() {
        // System.out.println("evaluate");
        // Operands o = new Operands("2", "3");
        Evaluator instance = new Evaluator("+");
        // int expResult = 0;
        // int result = instance.evaluate(o);
        // assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
        assertThat(instance.evaluate(o), is(5.0));
    }
    
    @Test
    public void shouldEvaluateSubtraction() {
        Evaluator instance = new Evaluator("-");
        assertThat(instance.evaluate(o), is(-1.0));
    }
    
    @Test
    public void shouldEvaluateMultiplication() {
        Evaluator instance = new Evaluator("*");
        assertThat(instance.evaluate(o), is(6.0));
    }
    @Test
    public void shouldEvaluateDivision() {
        Evaluator instance = new Evaluator("/");
        // assertThat(instance.evaluate(o), is(closeTo(0.66, 0,01)));
        assertEquals(0.66, instance.evaluate(o), 0.01);
    }
    
}
