package com.OopsPractice.Methods;

import java.util.Scanner;

class Student3{

    double calculateAverage(double marks, double marks2, double marks3){


      double  average =  (marks + marks2 + marks3) /3;

        return average;
    }

    String getResult(double average){

            if (average >= 40){
                return "pass";
            }
            else {
                return "fail";
            }


    }
}

public class Practice15 {
    public static void main(String[] args){
        Student3 stu = new Student3();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Marks in Physics: ");
        int physics = sc.nextInt();

        System.out.println("Enter Marks in Maths: ");
        int math = sc.nextInt();

        System.out.println("Enter Marks in Chemistry: ");
        int chemistry = sc.nextInt();

        double average = stu.calculateAverage(physics, math, chemistry);
        String result = stu.getResult(average);

        System.out.println("Average = "+ average);
        System.out.println("Result = "+ result);


    }
}
