package com.Loops.pattern;

import java.util.Scanner;

public class ZPattern {

 public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value: ");
		 int n = sc.nextInt();

		 //Outer loop to print row
		  for(int i = 1; i<=n; i++) {

			  //inner loop to print column
			  for(int j = 1; j<=n; j++) {

				  //to print star
				  if(  i==1 || i==n || i+j == n+1) {
					  System.out.print("*" + " ");
				  }

				  // to print space
				  else {
					  System.out.print("  ");
				  }
			  }

			  //to move cursor to next line
			  System.out.println();
		  }
			 
     
   }
 
    
 }

//output
//* * * * * 
  //    *   
  //  *     
 // *       
//* * * * *
