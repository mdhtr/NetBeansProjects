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
public class CommandLineExpressionBuilder implements ExpressionBuilder {

    private Expression expression;
    private boolean hasNext;

    CommandLineExpressionBuilder(String[] args) {
        try { // construction logic from main class of previous version moved here
            Double o1 = Double.parseDouble(args[0]);
            Double o2 = Double.parseDouble(args[2]);
            Operands operands = new Operands(o1, o2);

            OperatorFactory factory = new OperatorFactory();
            Operator operator
                    = factory.createOperator(args[1]);
            expression = new Expression(operator, operands);
            hasNext = true;

        } catch (NoSuchOperatorException ex) {
            System.err.println(ex);
            hasNext = false;
        }

    }

    @Override
    public boolean hasNext() {
        return hasNext;

    }

    @Override
    public Expression getNext() {
        if (hasNext == false) {
        		return null;
    	}
    	hasNext = false;
    	return expression;


    }
}
