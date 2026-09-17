package com.corejava;

import java.util.Scanner;

public class LargestInThreeNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
	System.out.println("Enter number a : ");
	   int a = sc.nextInt();
	   
	   System.out.println("Enter number b: ");
	     int b = sc.nextInt();
	     
	    System.out.println("Enter number c: ");
	     int c = sc.nextInt();
	     
	   int largest = ( a>b)? a:b; 
	   largest = (largest > c)? largest:c;
	   
	   System.out.println("Largest : "+ largest);
	   
	   
			   
	   
	}

}
