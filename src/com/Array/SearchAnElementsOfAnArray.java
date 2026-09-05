package com.Array;

import java.util.Scanner;

public class SearchAnElementsOfAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		 int size= sc.nextInt();
		 int []arr = new int [size];
		 
		 
		 System.out.println("Enter the elements of an array:  ");
		   for ( int i = 0; i<arr.length; i++) {
			   arr[i]=sc.nextInt();
		   }
		   
		   System.out.println("Enter the elements to search: ");
		     int search= sc.nextInt();
		     
		     boolean found = false;
		
		     for( int i = 0; i <arr.length;i++) {
		    	 if( arr[i] == search) {
		    		 found = true;
		    		 break;
		    	 }
		      }
		     
		     if(found) {
		    	 System.out.println("Elements found");
		     }
		     else {
		    		 System.out.println("Elements not found");
		    	 }
		  
	}


}
