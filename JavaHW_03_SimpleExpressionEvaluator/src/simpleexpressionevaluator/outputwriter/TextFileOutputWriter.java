/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleexpressionevaluator.outputwriter;

import java.io.*;

/**
 *
 * @author agi
 */
public class TextFileOutputWriter implements OutputWriter {

    private final BufferedWriter writer;

    public TextFileOutputWriter(OutputStream stream) {
        writer = new BufferedWriter(new OutputStreamWriter(stream));
        // have to use StreamWriter instead of FileWriter to be able to test it.
    }

    @Override
    public void write(Double result) {
        try {
            writer.append("Result: ");
            writer.append(result.toString());
            writer.newLine();
            writer.flush();
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

}
