package com.OopsPractice.Methods;

import java.util.Scanner;

class Printer{
    void printData(int number){

    }

    void printData(String text){

    }

    void printData(double number){

    }
}

public class Practice23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Printer print = new Printer();

        print.printData(sc.nextInt(10));
        sc.nextLine();
        print.printData(sc.next("Hello"));
        print.printData(sc.nextDouble());


    }
}
