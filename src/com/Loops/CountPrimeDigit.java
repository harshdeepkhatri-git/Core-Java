package com.Loops;

import java.util.Scanner;

public class CountPrimeDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the product ID: ");
        int product = sc.nextInt();

        int count = 0;

        while(product!=0){
            int digit = product % 10;

            if(digit==2 || digit==3 || digit==5 || digit==7){
                count++;
            }
            product/=10;
        }
        System.out.println("Total Prime Digits = " + count);
    }
}
