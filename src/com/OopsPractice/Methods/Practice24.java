package com.OopsPractice.Methods;

import java.util.Scanner;

class Calcut{

    int multiply(int a, int b){
        return a*b;
    }

    int multiply(int a, int b, int c){
        return a*b*c;
    }

    int multiply(int a, int b, int c, int d){
        return a*b*c*d;
    }
}

//Method overloading on different Parameters 22 and 24 questions both are on same topic.

public class Practice24 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int a = sc.nextInt();

        System.out.println("Enter Second number: ");
        int b = sc.nextInt();

        System.out.println("Enter third number: ");
        int c = sc.nextInt();

        System.out.println("Enter Fourth number: ");
        int d = sc.nextInt();

        Calcut cal = new Calcut();

        int multiply1 =  cal.multiply(a,b);
        int multiply2 = cal.multiply(a, b, c);
        int multiply3 = cal.multiply(a, b, c, d);

        System.out.println("Multiply (a, b) : " + multiply1);
        System.out.println("Multiply (a, b, c) : " + multiply2);
        System.out.println("Multiply (a, b, c, d) : " + multiply3);


    }
}
