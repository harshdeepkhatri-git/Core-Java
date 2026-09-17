package com.Array;

import java.util.Scanner;

public class Averageofanarray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the size of an Array: ");
		  int size = sc.nextInt();
		  int[]arr= new int [size];
		  
			System.out.println("Enter the elememnts of an Array: ");
			  for(int i = 0; i<arr.length; i++) {
				   arr[i] = sc.nextInt();
			  }
			  
			 int sum = 0 ;
			 double average = 0;
			 
			 for(int i = 0; i<arr.length; i++) {
				 sum = sum +arr[i];
				 
			 }
			 
			 average = sum/arr.length;
			 
           System.out.println("Sum : "+ sum);
           System.out.println("Average: "+ average);
	}

}
