package com.Loops;

import java.util.Scanner;

public class DigitCounter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your bank account number: ");
		int account = sc.nextInt();
		
		int count = 0;
		
		while(account>0) {
			account = account /10;	
			count ++;
		}
		System.out.println(count);
		sc.close();

	}

}
