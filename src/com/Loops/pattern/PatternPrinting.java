package com.corejava.pattern;

import java.util.Scanner;

public class PatternPrinting {

	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		
	//	System.out.println("Enter the value on N : ");
      //    	int N= sc.nextInt();
	
	       // outer loop
	  
          	 //  for (int i = 1; i<=N; i++) {
          		   
          		   // inner loop
	
            	//for (int j = 1; j<=N-i+1; j++) {
	
	              //  System.out.print("*");
            //	}
          	
		
		int n = 5;
          	
          	for (int i = 1; i<=n; i++) {
          		
          		for (int j = 1; j<=n; j++) {
          			System.out.print("*");
          		}
          		
          		       	

      System.out.println();
          	   }      
      
	}
}
