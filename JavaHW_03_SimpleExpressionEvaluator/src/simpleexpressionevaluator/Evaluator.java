/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleexpressionevaluator;

/**
 *
 * @author agi
 */
public class Evaluator {

    private final ExpressionBuilder expressionBuilder;
    private final OutputWriter outputWriter;

    public Evaluator(ExpressionBuilder expressionBuilder,
            OutputWriter outputWriter) {
        this.expressionBuilder = expressionBuilder;
        this.outputWriter = outputWriter;
    }

    public void evaluate() {
        while (expressionBuilder.hasNext()) {
            Expression expression
                    = expressionBuilder.getNext();
            final Operator operator = expression.getOperator();
            final Double result
                    = operator.opearte(
                            expression.getOperands());
            outputWriter.write(result);
        }

    }

}
