package com.Array;

import java.util.Scanner;

public class PrintEveninArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		System.out.println("Enter size of an array: ");
		   int size = sc.nextInt();
		   
		   int []arr= new int [size];
		   
		   System.out.println("Enter the elements of an array: ");
		     for(int i = 0; i<arr.length; i++) {
		    	 arr[i]= sc.nextInt(); 	
		     }
		     System.out.print("Even: ");
		     
		     for(int i = 0; i<arr.length; i++) {
		    	 
		     if( arr[i]%2==0) {
	    		  System.out.print( arr[i] + " ");
		    	  }
		     }
		     System.out.println();        
		     System.out.print("Odd: ");
		     
           for(int i = 0; i<arr.length; i++) {		     
		        if(arr[i] %2 != 0) {
		    	 System.out.print(arr[i] + " ");
		     }        
          }  
       }
	}
//to move the cursore to next line , because after 
// printing even it is in the even line only and prints odd 
// in same line like even : 2 4 6 odd : 1 3 5, but after using 
// println or just \n like ("\nOdd: ") it moves the cursore to the next line.

	
	


