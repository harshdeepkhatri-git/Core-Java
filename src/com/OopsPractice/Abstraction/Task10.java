package com.OopsPractice.Abstraction;

abstract class Course{
    String courseName;
    double fee;

    Course(String courseName, double fee){
        this.courseName = courseName;
        this.fee = fee;
    }

    abstract double calculateDiscount();

    void displayCourse(){
        System.out.println("Course Name: " + courseName);
        System.out.println("Original Fee: " + fee);
    }
}

class JavaCourse extends Course{
    JavaCourse(String courseName, double fee){
        super(courseName, fee);
    }

    @Override
    double calculateDiscount(){
        return  (fee * 15)/100;
    }

    @Override
    void displayCourse(){
        super.displayCourse();
        System.out.println("Discount = " + calculateDiscount());
        System.out.println("Final Fee: "+ (fee - calculateDiscount()));
    }
}

class PythonCourse extends Course{
    PythonCourse(String courseName, double fee){
        super(courseName, fee);
    }

    @Override
    double calculateDiscount(){
        return  (fee * 10)/100;
    }

    @Override
    void displayCourse(){
        super.displayCourse();
        System.out.println("Discount = " + calculateDiscount());
        System.out.println("Final Fee: "+ (fee - calculateDiscount()));
    }
}


public class Task10 {
    public static void main(String [] args){
             Course c = new JavaCourse("Java", 10000);
             c.displayCourse();
        System.out.println("====".repeat(5));

         c = new PythonCourse("Python", 8000);
         c.displayCourse();
    }
}
