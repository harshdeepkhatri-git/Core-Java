package com.Loops;

import java.util.Scanner;

public class ContinuousSumOfDigit {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the ISBN Code: ");
        long n = sc.nextLong();

        long lastdigit = 0;


     while(n>9){
         long sum =0;
         while(n!=0){
             sum = sum + (n%10);

             n= n/10;
         }
         n=sum;
        }
        System.out.println("The sum is "+n);
    }
}
