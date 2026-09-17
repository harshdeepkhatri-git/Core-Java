package com.Loops;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of n: ");
      int n = sc.nextInt();
      
      int decimal = 0;
      int power = 1;
      
	while(n>0) {
		int digit = n%10;
		decimal = decimal + digit *power;
		power = power *2;
		n =n/10;
		
		}
	System.out.println("Decimal : "+ decimal);
	}

}
