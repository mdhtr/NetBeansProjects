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
public class Triangle implements Shape {

    private Point v1;
    private Point v2;
    private Point v3;
    
    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new Point(x1, y1);
        this.v2 = new Point(x2, y2);
        this.v3 = new Point(x3, y3);        
    }

    public Triangle(Point v1, Point v2, Point v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "Triangle Points: " + v1 + " " + v2 + " " + v3
                + " Perimeter: " + getPerimeter() + " Area: " + getArea();
    }

    @Override
    public double getArea() {
        // https://en.wikipedia.org/wiki/Triangle#Using_coordinates
        // Miki szerint itt elegánsabb lenne a három oldalhosszal számolni,
        // amennyiben az oldalhossz osztályszintű változó.
        return Math.abs((v1.getX() - v3.getX()) * (v2.getY() - v1.getY())
                - (v1.getX() - v2.getX()) * (v3.getY() - v1.getY())) * 0.5;
    }

    @Override
    public double getPerimeter() {
        /*
         * Kipróbáltuk Mikivel, hogy hogyan lehet innen kiemelni osztályszintű
         * változóvá a három oldalvonalat, de nem éri meg, mert az itteni 
         * 3 sor kódot 9 sor kód váltja ki, és ráadásul redundánsan, mert minden
         * oldal tartalmazza a három sarokpontot.
         * Egyébként sem lehetett a konstruktoron kívül megadni, hogy melyik Line
         * melyik két Point-ból álljon, ezt a kostruktorokban kellett megadni, 
         * ettől vált sokszorosan redundánssá.
         */
        Line l1 = new Line(v1, v2);
        Line l2 = new Line(v2, v3);
        Line l3 = new Line(v3, v1);
        return l1.getLenght() + l2.getLenght() + l3.getLenght();
    }

}
