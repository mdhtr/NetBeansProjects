/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahw_02;

/**
 *
 * @author agi
 */
public class JavaHW_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operands o = new Operands(args[0], args[2]);
        Evaluator e = new Evaluator(args[1]);
        
        int result = e.evaluate(o);
        System.out.println("Result: " + result);
    }
    
}
