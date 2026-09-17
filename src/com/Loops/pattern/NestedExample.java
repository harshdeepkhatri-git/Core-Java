package com.Loops.pattern;

public class NestedExample {

	public static void main(String[] args) {
	 
		int n = 5;
		
		// Upper Part
		
	for(int i = 5; i>=1; i--) {
	  //Inner Loop
	for(int j = 1; j<=i; j++) {
         System.out.print("*");				
	   }
	      System.out.println();	   
	   }
	//Lower part
	     for(int i = 1; i<=n; i++) {
	    	 for(int j =1; j<=i; j++) {
	    		 System.out.print("*");
	    	 }
	    	 System.out.println();
	     }
	 }
	}

