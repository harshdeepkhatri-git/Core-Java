package com.Array;

import java.util.Scanner;

public class SecondLargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of an array: ");
		 int size=sc.nextInt();
		 int []arr = new int [size];
		 
		 System.out.println("Enter the elements of an arry: ");
		 for(int i =0; i<arr.length; i++) {
		  arr[i]=sc.nextInt();
		 }
		 
		 int max =  arr [0];
		 int secondlargest=arr[0];
		 
		for(int i =0; i<arr.length; i++) {
			if(arr[i] > max) {
			  max = arr[i] ;
			}
			}
		for(int i =0; i<arr.length; i++) {
			 if(arr[i]<max && arr[i]> secondlargest) {
				 secondlargest = arr[i];
				 
				 
			 }
			 
			
		}
		
		
		 System.out.println("secondlargest" + secondlargest);
	}

}
