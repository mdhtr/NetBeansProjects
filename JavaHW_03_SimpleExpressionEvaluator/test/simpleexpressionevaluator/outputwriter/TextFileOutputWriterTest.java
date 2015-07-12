/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleexpressionevaluator.outputwriter;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author agi
 */
public class TextFileOutputWriterTest {
    
    @Test
    public void shouldWriteOutputIntoFile() {
        OutputStream stream = new ByteArrayOutputStream();
        TextFileOutputWriter writer = new TextFileOutputWriter(stream);
        writer.write(12.0);
        assertThat(stream.toString(), is("Result: 12.0\n"));
        writer.write(32.0);
        assertThat(stream.toString(), is("Result: 12.0\nResult: 32.0\n"));
    }
    
}
