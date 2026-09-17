package com.Loops;

import java.util.Scanner;

public class FindingGCDOfTwoNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

     System.out.print("Enter the value of a: ");
		int a = sc.nextInt();
		
		System.out.print("Enter the value of b: ");
		int b = sc.nextInt();
		
		while(b!=0) {
			int temp = b;
			 b = a%b ;
			 a = temp;
		}
		System.out.print("GCD : "+ a);
   }
}