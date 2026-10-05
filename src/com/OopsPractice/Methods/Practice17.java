package com.OopsPractice.Methods;

import java.util.Scanner;

class Calculate1{

    void calculate(int a, int b){
       int sum = add(a ,b);
       int product = multiply(a,b);

      System.out.println("Sum : "+ sum );
      System.out.println("Product : "+ product );


    }

    int add(int a, int b){

        int sum = a+b;

        return sum;
    }

    int multiply(int a, int b){

        int product = a*b;
        return product;
    }
}

public class Practice17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = sc.nextInt();

        System.out.println("Enter Second number: ");
        int b = sc.nextInt();

        Calculate1 c = new Calculate1();
        c.calculate(a,b);

    }
}
