package com.corejava.pattern;

public class OddTriangle {

	public static void main(String[] args) {
		int n =5;
		
		for(int i = 1; i<=n; i++) {
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

		    System.out.println();
		}

	}


/*Output 
*
***
*****
*******
********* */