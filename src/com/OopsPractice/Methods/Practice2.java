package com.OopsPractice.Methods;


import java.util.Scanner;

class Calculator1 {
    Scanner sc = new Scanner(System.in);
    void add(){

        System.out.println("Enter 1st number");
        int n = sc.nextInt();
        System.out.println("Enter 2nd number");
        int m = sc.nextInt();

        int sum = n+ m;
        System.out.println("Sum = " + sum);
    }

    void subtract(){

        System.out.println("Enter 1st number");
        int n = sc.nextInt();

        System.out.println("Enter 2nd number");
        int m = sc.nextInt();

        int subtract = n-m;
        System.out.println("Subtraction = " + subtract);

    }

}
public class Practice2 {
    public static void main(String[] args) {
         Calculator1 c1 = new Calculator1();
         c1.add();
         c1.subtract();
    }
}
