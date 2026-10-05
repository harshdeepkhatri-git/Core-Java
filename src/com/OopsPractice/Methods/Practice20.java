package com.OopsPractice.Methods;

import java.util.Scanner;

class NumberDetector{
    void analyze(int n){
        boolean divisible = isDivisibleBy5(n);
        int square = square(n);

        if(divisible){
            System.out.println("Number is divisible by 5");
        }
        else {
            System.out.println("Number is not divisible by 5");
        }

        System.out.println("The square number is "+square);


    }

    boolean isDivisibleBy5(int n){
        if(n%5==0){
            return true;
        }
        else {
            return false;
        }
    }

    int square(int n){

        int square = n*n;

        return square;
    }
}

public class Practice20 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        NumberDetector nd = new NumberDetector();
        nd.analyze(n);

    }
}
