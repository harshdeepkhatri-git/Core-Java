package com.OopsPractice.Abstraction;

abstract class Shapes{
    abstract double calculateArea();

    abstract double calculatePerimeter();

}

class Rectangle extends Shapes{
    double length;
    double width;

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;

    }

    @Override
    double calculateArea(){
         return length * width;
    }

    @Override
    double calculatePerimeter(){
        return 2 * (length + width);
    }
}

class Circles extends Shapes{
    double radius;

    Circles(double radius){
        this.radius = radius;
    }

    @Override
    double calculateArea(){
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }
}
public class Task8 {
    public static void main(String [] args){
        Shapes shape = new Rectangle(10,5);
        System.out.println("Rectangle Area: " + shape.calculateArea());
        System.out.println("Rectangle Perimeter: " + shape.calculatePerimeter());

        System.out.println("====".repeat(5));

        Shapes sh = new Circles(7);
        System.out.println("Circle Area: " + String.format("%.2f", sh.calculateArea()));
        System.out.println("Circle Perimeter: " + String.format("%.2f", sh.calculatePerimeter()));


    }
}
