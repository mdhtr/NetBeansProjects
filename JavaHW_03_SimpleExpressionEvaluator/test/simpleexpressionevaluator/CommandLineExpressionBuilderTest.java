/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleexpressionevaluator;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author agi
 */
public class CommandLineExpressionBuilderTest {

    @Test
    public void shouldBuildExpressionFromCommandLine() {
        CommandLineExpressionBuilder builder
		= new CommandLineExpressionBuilder(
			new String[]{"12", "+", "14"});

    	assertThat(builder.hasNext(), is(true));
    	assertThat(builder.getNext(), is(not(nullValue())));

    	assertThat(builder.hasNext(), is(false));
    	assertThat(builder.getNext(), is(nullValue()));

    }

}
