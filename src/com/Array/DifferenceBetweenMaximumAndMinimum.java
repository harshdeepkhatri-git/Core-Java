package com.Array;

import java.util.Scanner;

public class DifferenceBetweenMaximumAndMinimum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of an array: ");
		  int size = sc.nextInt();
		  int []arr= new int[size];
		  
		  System.out.println("Enter the elements of an array: ");
		   for( int i =0; i<arr.length; i++) {
		   arr[i] = sc.nextInt();
		   }
		    
		   int max =arr[0];
		   int min=arr[0]; 
		   
		   int difference =0;
		   
		   for(int i = 0; i<arr.length; i++) {
			   if (arr[i]>max) {
				   max= arr[i];
			   }
			  if( arr[i]<min) {
				  min = arr[i];
			   }	   
		   }
		   
		  difference = max- min;
		  
		  System.out.println("Difference : "+ difference);
		   	   
	}

}
