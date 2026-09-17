package com.corejava;

import java.util.Scanner;

public class PrimeNumber {
    public static void main (String [ ] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        long n = sc.nextLong();

        if(n%2==0){
            System.out.println("The number is not prime number");
        }
        else {
            System.out.println("The number is a prime number");
        }
        sc.close();
    }
}
