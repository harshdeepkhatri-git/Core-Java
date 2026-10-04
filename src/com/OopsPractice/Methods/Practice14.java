package com.OopsPractice.Methods;

import java.util.Scanner;

class Rectangles{
    double calculateArea(double length, double width){

        return length*width;
    }

    double calculatePerimeter(double length, double width){

        return 2*(length+width);
    }

}
public class Practice14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Rectangles rect = new Rectangles();

        System.out.println("Enter the length: ");
        double length = sc.nextDouble();

        System.out.println("Enter the width: ");
        double width = sc.nextDouble();

        double Area =   rect.calculateArea(length, width);
        double Perimeter =  rect.calculatePerimeter(length, width);

       System.out.println("Area: " + Area);
       System.out.println("Perimeter: "+ Perimeter);



    }
}
