package com.Loops.pattern;

public class Pyramid180DegreeShift {

	public static void main(String[] args) {
		int n = 5;
		
		for (int i =1; i<=n; i++) {
			for(int j =1; j<=n-i; j++) {
				System.out.print(" ");
			}
			
			// Inner loop for star print
			
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}

//Output *****               if in inner loop star print j <=n is replaced by j<=i then output is:
	  //*****                                               *
														//  **
														//	***
														//	****
														//	*****
	 //*****
	//*****
	//*****