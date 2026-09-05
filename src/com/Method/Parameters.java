package com.Method;

public class Parameters {

	public static void main(String[] args) {
		
		
		System.out.println("Sum : " + sumTwoNumber(7 , 9));
		System.out.println("Sum: "+ sumTwoNumber(9,12));
		System.out.println("Sum: "+ sumTwoNumber(12,12));
		
	}

	public static int sumTwoNumber(int firstnumber , int secondnumber) {
		System.out.println("First Number Received: " + firstnumber);
		System.out.println("Second Number Received: " + secondnumber);
		
		int sum = firstnumber + secondnumber;
		
		return sum;
		
	}
	
	
	
	
}
