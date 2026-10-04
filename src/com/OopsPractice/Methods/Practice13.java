package com.OopsPractice.Methods;

import java.util.Scanner;

class Calculate{
    int add(int a, int b){
        int sum = a+b;
        return sum;
    }

    int subtract(int a, int b){
        int difference = a-b;
        return difference;
    }

}

public class Practice13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Calculate cal = new Calculate();
        System.out.println("Enter First number: ");
        int a = sc.nextInt();

        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        int sum =  cal.add(a,b);
       int difference =  cal.subtract(a, b);

       System.out.println(" Sum is : " + sum);
       System.out.println("Difference is : " + difference);


    }
}
