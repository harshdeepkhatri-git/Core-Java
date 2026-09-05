package com.corejava.pattern;

public class HollowInvertedPyramid {

	public static void main(String[] args) {
		
		int n = 5;
		
		// Outer Loop And Starting Space 
		
		for(int i = 5; i>=1; i--) {
			//Starting Space
		for(int j = 1; j<=n-i; j++) {
			System.out.print(" ");
		}
		
	//Stars and middle space
		
		   for(int j = 1; j<=2*i-1; j++) {
			   
			   if(i ==n || j==1 || j==2*i-1) {
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
