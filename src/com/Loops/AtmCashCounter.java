package com.Loops;

import java.util.Scanner;

public class AtmCashCounter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
     
		System.out.println("Enter the number of 100 notes in ATM: ");
		int n = sc.nextInt();
		 
		int count = 1;
		
		while(n>0) {
		
		System.out.println("Withdraw : "+ count);
		  count++;
		  n--;
		}
    }

}
