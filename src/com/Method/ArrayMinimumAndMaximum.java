package com.Method;

public class ArrayMinimumAndMaximum {

	public static void main(String[] args) {
		
		System.out.println("Welcom to max and min");
		
		
		int [] arr = ArrayUtility.inputArray();
		
		int max=0;
		int min=arr[0];
		
		
		for(int i =0; i<arr.length; i++) {
			
			if (arr[i] > max) 
				max = arr[i];
		
		    if(arr[i]<min) 
			   min= arr[i]; 
		     
		}
		   System.out.println("Maximum Number : "+ max);
		   System.out.println("Minimum Number : "+ min);
     }
 }
		

	


