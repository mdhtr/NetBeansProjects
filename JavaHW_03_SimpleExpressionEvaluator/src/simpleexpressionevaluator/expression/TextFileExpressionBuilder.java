/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleexpressionevaluator.expression;

import java.io.*;
import simpleexpressionevaluator.Operands;
import simpleexpressionevaluator.operator.*;

/**
 *
 * @author agi
 */
public class TextFileExpressionBuilder implements ExpressionBuilder {

    private Expression[] expressionArray;
    private int actualIndex;
    private int maxIndex;

    private Expression createExpression(String[] arguments, Operands operands) throws NoSuchOperatorException {
        OperatorFactory factory = new OperatorFactory();
        Operator operator = factory.createOperator(arguments[1]);
        Expression expression = new Expression(operator, operands);
        return expression;
    }

    private Operands createOperands(String[] arguments) throws NumberFormatException {
        Double o1 = Double.parseDouble(arguments[0]);
        Double o2 = Double.parseDouble(arguments[2]);
        Operands operands = new Operands(o1, o2);
        return operands;
    }

    public TextFileExpressionBuilder(InputStream stream) {
        try {
            String line;
            maxIndex = 0;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(stream));
            // have to use StreamReader instead of FileReader to be able to test it.
            expressionArray = new Expression[100];
            actualIndex = 0;

            while ((line = bufferedReader.readLine()) != null) {
                String[] arguments = line.split("\\ ");

                Operands operands = createOperands(arguments);
                expressionArray[maxIndex++] = createExpression(arguments, operands);
            }
        } catch (IOException | NoSuchOperatorException ex) {
            System.err.println(ex);
        }
    }

    @Override
    public boolean hasNext() {
        return actualIndex < maxIndex;
    }

    @Override
    public Expression getNext() {
        //System.out.println(actualIndex + " " + maxIndex); // to see what happens
        return expressionArray[actualIndex++];
    }

}
