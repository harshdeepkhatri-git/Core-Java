package com.OopsPractice.Methods;

import java.util.Scanner;

class NumAnalyze{
    void analyze(int n ){

        int cube = cube(n);
        boolean multiple = isMultipleBy3(n);
        if(multiple){
            System.out.println("Number is multiple by 3");
        }
        else {
            System.out.println("Number is not multiple by 3");
        }

        System.out.println("Cube = "+ cube);
    }

    boolean isMultipleBy3 (int n){
        if (n%3 == 0){
            return true;
        }
        else {
            return false;
        }

    }

    int cube(int n){
         int cube = n*n*n;
         return cube;
    }
}

public class Practice21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        NumAnalyze na = new NumAnalyze();
          na.analyze(n);


    }
}
