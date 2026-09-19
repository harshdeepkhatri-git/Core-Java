package com.Array;

import java.util.Scanner;

public class ArrayOddPrinting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of an array: ");
		  int size = sc.nextInt();
		  
		  int []arr = new int [size];
		  
		  System.out.println("Enter the elements of an Array: ");
		   for(int i = 0; i < arr.length; i++) {
			   arr[i] = sc.nextInt();
		   }

		    System.out.print("odd elements: " );
		    for (int i = 0; i<arr.length; i++) {
		      if( arr[i] % 2 != 0) {
		    	  System.out.print(arr[i] + " ");
		    	  
		      }
	 }


  }
}