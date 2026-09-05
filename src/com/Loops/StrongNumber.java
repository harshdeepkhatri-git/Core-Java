package com.Loops;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		
		int temp = n;
		int digits =0;
		
		int sum =0;
		
		while(temp> 0) {
		digits= temp % 10;	  
       
		int fact = 1;
		
	 while(digits > 0) {
	    fact = fact *digits ;
	    digits--;
	   }
	   sum = sum + fact;
	   
	     temp = temp/10;
		}
	     if(sum == n ) {
	    	 System.out.println("The NUmber is Strong Number");
	     }
	     else {
	    	 System.out.println("Number is not a Strong Number");
	     }
	 
	}

}
