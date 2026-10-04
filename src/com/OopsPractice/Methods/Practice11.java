package com.OopsPractice.Methods;

import java.util.Scanner;

class Calci{
    void add(int a, int b){
        int sum = a+b;

        System.out.println("Sum is : " + sum);
    }

    void multiply(int a, int b){
        int Product = a*b;

        System.out.println("Product : "+ Product);
    }
}

public class Practice11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int a = sc.nextInt();

        System.out.println("Enter a number: ");
        int b = sc.nextInt();

        Calci c = new Calci();
         c.add(a,b);
         c.multiply(a,b);


        sc.close();

    }
}
