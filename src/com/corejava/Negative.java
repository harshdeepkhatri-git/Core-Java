package com.corejava;

import java.util.Scanner;

public class Negative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the A value: ");
		 int a = sc.nextInt();
		 
		 System.out.println("Enter the value B : ");
		 int b = sc.nextInt();
		
		if(a>0 && b>0) { 
		     if(a==b) {
		    	 System.out.println("product: "+ a*b);
		     }
		     else if(a!= b) {
		    	 System.out.println("Sum: "+ (a+b));
		     }
		}
		else {
			System.out.println("Wrong Input");
		}
			
			 }
	}


