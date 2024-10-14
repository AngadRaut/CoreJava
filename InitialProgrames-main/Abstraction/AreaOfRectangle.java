package Abstraction;

import java.util.Scanner;

class Area {

    Scanner aa = new Scanner(System.in);

    int length = aa.nextInt();
    int width = aa.nextInt();

    void findArea() {
        double area = length * width;
        System.out.println("Arrea of rectangle is " + area);

    }
}

abstract class Perimeter extends Area {
    void findPerimeter() {
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter is =" + perimeter);
    }

    abstract void find();

}

public class AreaOfRectangle {
    public static void main(String[] args) {
        System.out.println("Enter length and width of Rectangle");
        Area r = new Area();
        r.findArea();

       // Perimeter x = new Perimeter();

    }
}