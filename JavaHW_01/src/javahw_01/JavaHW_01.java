/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahw_01;

/**
 *
 * @author agi
 */
public class JavaHW_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle c = new Circle(new Point(2, 3), 4);
        System.out.println(c);
        
        Triangle t = new Triangle(1, 2, 3, 4, 1, 6);
        System.out.println(t);
        
        Line l = new Line(new Point(1, 1), new Point(2, 2));
        System.out.println(l);
        
        /**
         * Lehet class-on kívül változót létrehozni? x = 'a' ? NEM.
         */
        
    }
    
}
