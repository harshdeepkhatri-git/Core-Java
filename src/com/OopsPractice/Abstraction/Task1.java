package com.OopsPractice.Abstraction;

 abstract class Shape{

     abstract double calculateArea();

     void displayMethod(){
         System.out.println("Calculating Shape Area ");
     }
 }

 class Circle extends Shape{
     double radius;
     Circle(double radius){
         this.radius = radius;
     }
     @Override
     double calculateArea(){
         return Math.PI*radius*radius;
     }
     @Override
     void displayMethod(){
         super.displayMethod();
         System.out.println("Area of Circle: "+ calculateArea());
     }
 }

public class Task1 {
    public static void main(String [] args){
         Circle c = new Circle (5);
         c.displayMethod();

    }
}
