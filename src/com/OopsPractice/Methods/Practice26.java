package com.OopsPractice.Methods;

import java.util.Scanner;

class Calculator3{
    int calculate(int a, int b){
        return a+b;
    }

    double calculate(double a, double b){
        return a+b;
    }

    int calculate(int a, int b, int c){
        return a+b+c;
    }


}

public class Practice26 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter integer 1: ");
        int i1 = sc.nextInt();

        System.out.println("Enter integer 2: ");
        int i2 = sc.nextInt();

        System.out.println("Enter double 1: ");
        double d1 = sc.nextDouble();

        System.out.println("Enter double 2: ");
        double d2 = sc.nextDouble();

        System.out.println("Enter integer 3: ");
        int i3 = sc.nextInt();

        Calculator3 cal = new Calculator3();

       int result = cal.calculate(i1, i2);
       double result2=  cal.calculate(d1, d2);
        int result3 = cal.calculate(i1, i2, i3);

        System.out.println("Sum of two integer: "+ result);
        System.out.println("Sum of two double : "+ result2);
        System.out.println("Sum of three integer : "+ result3);


    }
}
