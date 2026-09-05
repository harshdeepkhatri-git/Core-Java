package com.Method;

import java.util.Scanner;

public class PrintMultiplicationTable {

	public static void main(String[] args) {
		
		multiplicationTable();
		
	}

	public static void multiplicationTable() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of n : ");
		 int n = sc.nextInt();
		  
		
		  
		 for(int i = 1; i<=10; i++) {
			 
			 System.out.println(n + "x" + i + " = " + (n*i));
			 
			 
		 }
		 
		 
	}
	
	
	
}
