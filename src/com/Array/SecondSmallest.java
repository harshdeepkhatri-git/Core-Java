package com.Array;

import java.util.Scanner;

public class SecondSmallest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of an array: ");
		 int size = sc.nextInt();
		 int []arr = new int [size];
		 
		 System.out.println("Enter the elements of an array: ");
		   for ( int i = 0; i< arr.length; i++) {
			   arr[i]=sc.nextInt();
		   }
		   
		     int smallest=arr[0];
		     int secondsmallest = Integer.MAX_VALUE;
		   
		   for(int i = 0; i<arr.length; i++) {
			    if(arr[i]<smallest) 
			    smallest= arr[i];
			    }
		   
		   
		   for(int i = 0; i<arr.length; i++) {
			   if(arr[i]>smallest && secondsmallest> arr[i]) {
				   secondsmallest= arr[i];
			   }
		   }
		   
		   System.out.println("Second Smallest: "+ secondsmallest);

	}

}
