package com.OopsPractice.Methods;

import java.util.Scanner;

class NumberCheck{

    void checkNumber(int n){
        boolean even =   isEven(n);
        int square = square(n);

        if(even){
            System.out.println("The number "+ n + " is even number");
        }
        else {
            System.out.println("The number "+ n + " is not even number");
        }

        System.out.println("The number is "+square);
    }

    boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        else {
            return false;
        }

    }

    int square(int n){
        int Square = n*n;
        return Square;
    }

}

public class Practice18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        NumberCheck nc = new NumberCheck();
        nc.checkNumber(n);



    }
}
