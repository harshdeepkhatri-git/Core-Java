package com.Array;

import java.util.Scanner;

public class PositiveAndNegativeElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of an array: ");
		  int size= sc.nextInt();
		  
		  int []arr= new int [size];
		  
		  System.out.println("Enter the elements of an array: ");
		   for(int i = 0; i<arr.length; i++) {
			   arr[i]=sc.nextInt();
		   }
		   
		   int positive = 0;
		   int negative =0;
		   
		   for( int i = 0; i <arr.length; i++) {
			   if ( arr[i]>0) {
				   positive ++;
			   }
			   
			   if (arr[i]<0) {
				   negative ++ ;
			   }
		   }
		   
		   System.out.println("Positive elements : "+ positive);
		   System.out.println("Negative elements : "+ negative);
		   
		   

	}

}
