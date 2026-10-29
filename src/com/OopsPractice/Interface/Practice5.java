package com.OopsPractice.Interface;

interface ShapeCalculator{
    double calculateArea();
}

class CircleShape implements ShapeCalculator{

    double radius;

    CircleShape(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return 3.14 * radius * radius;
    }
}

class RectangleShape implements ShapeCalculator{
    double length;
    double width;
    RectangleShape(double length,double width){
        this.length = length;
        this.width = width;
    }
    @Override
    public double calculateArea(){
        return length * width;
    }
}

class SquareShape implements ShapeCalculator{
    double side;
    SquareShape(double side){
        this.side = side;
    }
    @Override
    public double calculateArea(){
        return side * side;
    }
}

public class Practice5 {
    public static void main(String [] args){
        ShapeCalculator shape;

        shape = new CircleShape(5);
        System.out.println("Circle Area: " + shape.calculateArea());

        shape = new RectangleShape(4, 6);
        System.out.println("Rectangle Area: "+ shape.calculateArea());

        shape = new SquareShape(4);
        System.out.println("Square Area: "+ shape.calculateArea());
    }
}
