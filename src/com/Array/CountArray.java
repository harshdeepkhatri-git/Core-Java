package com.Array;

import java.util.Scanner;

public class CountArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of an Array: ");
		 int size = sc.nextInt();
		 
		 int[]arr= new int[size];
		 
		 System.out.println("Enter the elements of an array: ");
		    for(int i = 0; i<arr.length; i++) {
		    	 arr[i]=sc.nextInt();
		    }
		    
		    int count = 0;
		    for(int i = 0 ; i<arr.length; i++) {
		          count++;	 
		    }	
		    	 System.out.println("number of elements : "+ count); 
		 

	}

}
