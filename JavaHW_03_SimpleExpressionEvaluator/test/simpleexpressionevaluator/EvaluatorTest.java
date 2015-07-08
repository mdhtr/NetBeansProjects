/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleexpressionevaluator;

import simpleexpressionevaluator.testhelpers.MockWriter;
import simpleexpressionevaluator.expression.ExpressionBuilder;
import simpleexpressionevaluator.expression.Expression;
import simpleexpressionevaluator.operator.Addition;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;

/**
 *
 * @author agi
 */
public class EvaluatorTest {

    @Test
    public void shouldEvaluate() {
        ExpressionBuilder mockBuilder
                = Mockito.mock(ExpressionBuilder.class);
        Mockito.when(mockBuilder.hasNext())
                .thenReturn(Boolean.TRUE)
                .thenReturn(Boolean.FALSE);
        Mockito.when(mockBuilder.getNext())
                .thenReturn(
                        new Expression(
                                new Addition(),
                                new Operands(12.0, 9.0)));

        final MockWriter mockWriter = new MockWriter();
        Evaluator evaluator = new Evaluator(mockBuilder, mockWriter);
        evaluator.evaluate();

        assertThat(mockWriter.writtenValue, is(21.0));

    }

}
