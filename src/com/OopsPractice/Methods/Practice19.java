package com.OopsPractice.Methods;

import java.util.Scanner;

class NumberAnalyzer{
    void analyze(int n){

        boolean isPositive =  ispositive(n);

        int cube = cube(n);


             if (isPositive){
             System.out.println("The number is positive");
             }
             else{
             System.out.println("The number is not positive");
             }

             System.out.println("The number is "+cube);
         }

    boolean ispositive(int n) {
        if (n >= 0) {
            return true;
        } else {
            return false;
        }
    }

    int cube(int n){
        int cube = n*n*n;
        return cube;
      }
}

public class Practice19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        NumberAnalyzer na = new NumberAnalyzer();
             na.analyze(n);




    }
}
