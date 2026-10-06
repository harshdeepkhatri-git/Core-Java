package com.OopsPractice.Methods;

import java.util.Scanner;

class Calculatore{
    int add(int a, int b){

        return a+b;
    }

    int add(int a, int b, int c){

        return a+b+c;
    }

    double add (double a, double b){

        return a+b;
    }
}


public class Practice22 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the a number: ");
        int a = sc.nextInt();

        System.out.println("Enter a number: ");
        int b = sc.nextInt();

        System.out.println("Enter a number: ");
        int c = sc.nextInt();

        Calculatore cal = new Calculatore();
       int result1 =   cal.add(10, 20, 30);
        int result2 = cal.add(a,b,c);
       double result3 = cal.add(10.5, 20.5);

       System.out.println("add(10, 20) = "+ result1);
       System.out.println("add(10, 20, 30) = "+ result2);
      System.out.println("add(10, 20) = "+ result3);
        }
    }

