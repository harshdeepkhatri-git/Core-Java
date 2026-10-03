package com.OopsPractice.Methods;


import java.util.Scanner;

class Rectangle{
    Scanner sc = new Scanner(System.in);
    double length;
    double width;

    void setDimensions(){
        System.out.println("Enter the length");
        length = sc.nextInt();

        System.out.println("Enter the width");
        width = sc.nextInt();
    }

    void calculateArea(){
        double Area = length*width;

        System.out.println("The area of the rectangle is = " + Area);

    }
}
public class Practice4 {
    public static void main(String[]args){
        Rectangle r1 = new Rectangle();
        r1.setDimensions();
        r1.calculateArea();

    }
}
