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
public class Line {

    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double getLenght() {
        return Math.sqrt(
                (p1.getX() - p2.getX()) * (p1.getX() - p2.getX())
                + (p1.getY() - p2.getY()) * (p1.getY() - p2.getY())
        );
    }

    @Override
    public String toString() {
        return "Line Points: " + p1 + " " + p2 
                + " Lenght: " + getLenght();
    }
}
