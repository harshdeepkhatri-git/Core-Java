package com.Loops.pattern;

public class HollowXPattern {

	public static void main(String[] args) {
		int n = 7;
		
		//Outer Loop
		
		for(int i=1; i<=7; i++) {
		
		  // inner loop
		
	   for(int j = 1; j<=13; j++) {
		   //Star and middle Space
		   
		  if( j==14-(2*i-1)|| j==2*i-1) {
			  System.out.print("*");
		  }
		  else {
			  System.out.print(" ");
		  }
	       }
	   System.out.println();
     }
   }
		

}
