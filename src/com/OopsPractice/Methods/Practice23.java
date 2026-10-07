package com.OopsPractice.Methods;

import java.util.Scanner;

class Printer{
    void printData(int number){
           System.out.println("Integer: " + number);
    }

    void printData(String text){
        System.out.println("String: " + text);
    }

    void printData(double number){
        System.out.println("Double: " + number);
    }
}
// Question on different parameters types.

public class Practice23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter a String: ");
        String str = sc.nextLine();

        System.out.println("Enter a Double number:");
        double number = sc.nextDouble();

          Printer print = new Printer();
                print.printData(n);
                print.printData(str);
                print.printData(number);


    }
}
