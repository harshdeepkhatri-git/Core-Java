package com.Array;

import java.util.Scanner;

public class PrintingArrayElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of an array: ");
		  int size = sc.nextInt();
		 int [] arr = new int[size];
		 
		 System.out.println("Enter the elements of an array: ");
		   for(int i = 0; i<arr.length; i++) {   
			   arr[i]=sc.nextInt();
		   }  
			  for(int i = 0; i<arr.length; i++) {
				
				  System.out.print(arr[i] + " " );
			  }
			  sc.close();
		   }

	}


