package com.Array;

import java.util.Scanner;

public class LargestOfAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of an Array: ");
		  int size=sc.nextInt();
		  int []arr = new int[size];
		  
		  
		  System.out.println("Enter the elements of an array: ");
		    for(int i =0; i<arr.length; i++ ) {
		    	arr[i] = sc.nextInt();
		    }
		    int max =arr[0];
		    
		    for(int i =0; i<arr.length; i++) {
		    	if(arr[i]> max) {
		    		max = arr[i];
		    	}
		    	
		    	
		    }
	    	System.out.println("Maximum value : "+ max);

	}

}
