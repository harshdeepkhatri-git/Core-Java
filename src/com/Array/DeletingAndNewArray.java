package com.Array;

import java.util.Scanner;

public class DeletingAndNewArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Size of an Elements: ");
		int size = sc.nextInt();
		
		int[]arr = new int [size];
		
		System.out.println("Enter the elements to delete: ");
		   int elements = sc.nextInt();
		   
		
		System.out.println("Enter the elements of an array: ");
		   for(int i =0; i<arr.length; i++) {
			   arr[i] = sc.nextInt();	 
		   }
		   
		   //find first occurance
		   
		   int index = -1;
		   
		   for(int i =0; i<arr.length; i++) {
			   if(arr[i] == elements) {
			    index  = i;
			    break;
		   }
		}	   
                 if(index == -1) {
                	 System.out.println("Elements not found");
                 }
                 
                 else {

                	 //new Array
                	 
                	int [] newArr = new int[arr.length -1];
                	
                	// copy elements
                	
                	for(int i = 0, j=0; i<arr.length; i++) {
                		if(i != index ) {
                			newArr[j] = arr[i];
                			j++;
                		}
                	}
                	
                	System.out.print("New Array: ");
                	for(int i =0; i<newArr.length; i++) {
                		System.out.print( newArr[i] + " ");
                	}
                	
                	
                	
                	
                 }
                	
	}

}
