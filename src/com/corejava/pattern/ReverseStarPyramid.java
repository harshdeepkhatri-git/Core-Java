package com.corejava.pattern;

public class ReverseStarPyramid {

	public static void main(String[] args) {
		int n = 5;

		for (int i = 1; i <= n; i++) {

		    // spaces
		    for (int j = 1; j <= i - 1; j++) {
		        System.out.print(" ");
		    }

		    // stars
		    for (int j = 1; j <= 2 * n - 2 * i + 1; j++) {
		        System.out.print("*");
		    }

		    System.out.println();
		}
	}

}

// output
			// *********
			//  *******
			 //  *****
			  //  ***
			   //  *
