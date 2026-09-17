package com.Method;

import java.util.Scanner;

public class ReturnExample {

	public static void main(String[] args) {
		   greet();
		   
		   int firstnumber = readnumber();
		   int secondnumber = readnumber();
		   int thirdnumber = readnumber();
		   
		   int sum = firstnumber + secondnumber + thirdnumber;
		   
		   System.out.println("Sum of given number : "+ sum);
           
	}
	
	public static int readnumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		
	    return number ;
	 }
	 
	
	public static void greet() {
		System.out.println("Welcome!!");
	}

	
  }


