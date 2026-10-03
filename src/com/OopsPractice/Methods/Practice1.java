package com.OopsPractice.Methods;

import java.util.Scanner;

class Calculator{

    void add(){
        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();
        System.out.println("Enter 1st number");
        int n = sc.nextInt();

        System.out.println("Enter 2nd number");
        int m = sc.nextInt();

        int sum = n + m;
        System.out.println("Sum = " + sum);
    }

}
public class Practice1 {
    public static void main(String [] args){
      Calculator c = new Calculator();
       c.add();




    }
}
