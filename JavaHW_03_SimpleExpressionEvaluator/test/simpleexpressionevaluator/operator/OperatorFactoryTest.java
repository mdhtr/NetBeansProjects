/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleexpressionevaluator.operator;

import simpleexpressionevaluator.operator.NoSuchOperatorException;
import simpleexpressionevaluator.operator.Operator;
import simpleexpressionevaluator.operator.OperatorFactory;
import static org.hamcrest.CoreMatchers.is;
//import static org.hamcrest.CoreMatchers.nullValue; //for nullValue testing (deprecated)
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 *
 * @author agi
 */
public class OperatorFactoryTest {

    private final OperatorFactory factory; // after test refactoring

    public OperatorFactoryTest() {
        this.factory = new OperatorFactory(); // after test refactoring
    }

    @Test
    public void shouldCreateAddition() throws NoSuchOperatorException {
        //OperatorFactory factory = new OperatorFactory(); // before test refactoring
        Operator op = factory.createOperator("+");
        assertThat(op.getClass().getCanonicalName(), is("simpleexpressionevaluator.operator.Addition"));
    }

    @Test
    public void shouldCreateSubstraction() throws NoSuchOperatorException {
        //OperatorFactory factory = new OperatorFactory(); // before test refactoring
        Operator op = factory.createOperator("-");
        assertThat(op.getClass().getCanonicalName(), is("simpleexpressionevaluator.operator.Subtraction"));
    }

    @Test
    public void shouldCreateMultiplication() throws NoSuchOperatorException {
        //OperatorFactory factory = new OperatorFactory(); // before test refactoring
        Operator op = factory.createOperator("*");
        assertThat(op.getClass().getCanonicalName(), is("simpleexpressionevaluator.operator.Multiplication"));
    }

    @Test
    public void shouldCreateDivision() throws NoSuchOperatorException {
        //OperatorFactory factory = new OperatorFactory(); // before test refactoring
        Operator op = factory.createOperator("/");
        assertThat(op.getClass().getCanonicalName(), is("simpleexpressionevaluator.operator.Division"));
    }
    
    /* @Deprecated
    @Test
    public void shouldGetNullOnNotDefinedOperator() {
        Operator op = factory.createOperator("o");
        assertThat(op, is(nullValue()));
    }
    */
    
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void shouldGetExceptionOnUndefinedOperatorString() throws NoSuchOperatorException {
        exception.expect(NoSuchOperatorException.class);
        factory.createOperator("o");
    }

}
