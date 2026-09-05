package com.corejava;

import java.util.Scanner;

public class ArithmeticUserInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter Value of a : ");
	   int a= sc.nextInt();
	   
	  System.out.println("Enter the value of b : ");
		int b = sc.nextInt();
		
	System.out.println("Sum = " +( a + b));
	
	
	
	System.out.println("Difference = " + (a-b));
	
	System.out.println("product = " + (a*b));
	
	System.out.println("Quotient = "+ (a/b) + " , reminder = " + ( a % b));
    sc.close();
	}

}

// output
//Sum = 20
//Difference = 0
//product = 1
//Quotient = 1 , reminder = 0