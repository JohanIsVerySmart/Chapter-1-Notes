package com.hillcrest.chapter2;

import java.awt.*;

/**
 * Class the will build rectngles
 */
public class RectangleApp {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = r1;
        r1.setSize(10,20);
        System.out.println("The width of the rectangle is: " + r2.getWidth());
        Rectangle r3 = new Rectangle(10,20,100,5);
        r3.translate(5,10);
        System.out.println(r3.getWidth());
        System.out.println(r3.getX());
        Rectangle r4 = new Rectangle();
        r1 = r3;
        r2 = r4;
        r2 = null;
        System.out.println(r2.getWidth());
    }
}
