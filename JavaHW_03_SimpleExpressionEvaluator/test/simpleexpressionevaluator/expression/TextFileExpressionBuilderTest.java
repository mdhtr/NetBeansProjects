/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleexpressionevaluator.expression;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author agi
 */
public class TextFileExpressionBuilderTest {
    
    @Test
    public void shouldBuildExpressionFromTextFile() {
        String content = ""
                + "3 + 2\n"
                + "4 - 6";
        InputStream stream = new ByteArrayInputStream(content.getBytes());
        
        TextFileExpressionBuilder builder
		= new TextFileExpressionBuilder(stream);

    	assertThat(builder.hasNext(), is(true));
    	assertThat(builder.getNext(), is(not(nullValue())));

        assertThat(builder.hasNext(), is(true));
    	assertThat(builder.getNext(), is(not(nullValue())));
        
    	assertThat(builder.hasNext(), is(false));
    	assertThat(builder.getNext(), is(nullValue()));

    }
    
}
