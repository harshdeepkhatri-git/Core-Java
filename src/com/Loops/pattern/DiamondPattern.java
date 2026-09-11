package com.corejava.pattern;

public class DiamondPattern {

	public static void main(String[] args) {
		 int n = 5;
		 
		 // upper part
		 
		 for ( int i = 1; i<=n; i++) {
			 //for space
			 
			 for ( int j = 1; j<=(n-i); j++) {
				 System.out.print("  ");
			 }
			 for(int j = 1; j<=2*i-1; j++) {
			 System.out.print("*"+ " ");
			
		 }
			 
			 System.out.println();

	}
		 
		 //lower part
		 
		 for (int i =1; i<=n-1; i++) {
			 // for space
			 
			 for (int j = 1; j<=2*i; j++) {
				 System.out.print(" ");
			 }
			 for(int j = 1; j<=2*(n-i)-1; j++) {
				 System.out.print("*"+ " ");
			 }
			 System.out.println(); 
		 }
		 
}
}