package com.OopsPractice.Methods;

import java.util.Scanner;

class Calculator2{
    int calculate(int a, int b){
        return a+b;
    }

    double calculate(double a , double b){
        return a+b;
    }

     double calculate(double a, double b, double c){
        return (a+b+c)/3;
    }

}

//Method Overloading on different Parameter types.

public class Practice25 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first integer:");
        int int1 = sc.nextInt();

        System.out.println("Enter second integer:");
        int int2 = sc.nextInt();

        System.out.println("Enter first double: ");
        double d1 = sc.nextDouble();

        System.out.println("Enter second double: ");
        double d2 = sc.nextDouble();

        System.out.println("Enter a integer:");
        int a = sc.nextInt();


        Calculator2 cal = new Calculator2();

        int result1 = cal.calculate(int1, int2);
        double result = cal.calculate(d1, d2);
        double average = cal.calculate(int1, int2, a);

        System.out.println("Integer sum : " + result1);
        System.out.println("Double sum : "+ result);
        System.out.println("Integer Average: "+ average);

    }
}
