package p1;

import java.util.Scanner;

// till java 1.7 -> immutable -> avoid fragile base problem
// java 1.8 -> Mutable
interface Shape {
    void acceptData(Scanner sc);

    void calculateArea();

    // new method design
    default void calculatePerimeter() {
        System.out.println("Default::Perimeter");
    }

    default void calculateVolume() {
        System.out.println("Default::Volume");
    }

    // helper methods
    static void sort(Shape[] arr) {
        System.out.println("Sorting");
    }
}


class Circle implements Shape {
    int radius;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void acceptData(Scanner sc) {
        System.out.println("Circle::accept");
    }

    @Override
    public void calculateArea() {
        System.out.println("Circle::area");
    }
}

class Rectangle implements Shape {
    int length;
    int breadth;

    @Override
    public void acceptData(Scanner sc) {
        System.out.println("Rectangle::accept");
    }

    @Override
    public void calculateArea() {
        System.out.println("Rectangle::area");
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Rectangle::Perimeter");
    }

}

public class Program {
    public static void main(String[] args) {
        Shape sh;
        sh = new Circle();
        //sh = new Rectangle();

        sh.acceptData(null);
        sh.calculateArea();
        sh.calculatePerimeter();

        Shape[] arr = new Shape[3];
        arr[0] = new Circle(5);
        arr[1] = new Circle(7);
        arr[2] = new Circle(4);


    }
}
