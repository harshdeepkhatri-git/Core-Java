package com.Array;

import java.util.Scanner;

public class CountEvenAndOddNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of an array: ");
		  int size=sc.nextInt();
		  int []arr= new int [size];
		  
		  System.out.println("Enter the elements of an array: ");
		   for(int i = 0; i<arr.length; i++) {
			  arr[i]= sc.nextInt();
		  }
		   
		   int even =0;
		   int odd =0;
		   
		   for( int i = 0; i<arr.length; i++) {
			    if ( arr[i]%2==0) {
			    	even++ ;
			    }
			    else {
			    	odd++;       // yaha pe else use krne ke place pe hum if bhi use kr skte h 
			    	             // if arr[i] != 0 then odd++ this is also correct statement.
			    }
		   }
		   
		   System.out.println("Even Numbers : "+ even);
		    System.out.println("Odd Numbers: "+ odd);
	}

}
