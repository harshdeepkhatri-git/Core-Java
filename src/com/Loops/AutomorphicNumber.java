package com.Loops;

import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        int square = n*n;

        int lasttwodigit = n%100;
        int squarelasttwodigit = square%100;

        if(lasttwodigit == squarelasttwodigit){
            System.out.println("It is a automorphic number");
        }
        else{
            System.out.println("It is not a automorphic number");
        }


    }
}