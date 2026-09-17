package com.corejava.pattern;

public class HollowSquareWithDiagonal {

	public static void main(String[] args) {
		int n=7;
		
		for(int i = 1; i<=n; i++) {
			
		
		 for(int j = 1; j<=13; j++) {
			  if(i==1|| i==7|| j==1|| j==13 || j==2*i-1 || j==15-2*i-1) {
				  System.out.print("1"
				  		+ "");
			  }
			  else {
				  System.out.print(" ");
			  }
	}
		 System.out.println();

 }
}
}

// output 
// *************
// * *      *  *
// *   *  *    *
// *    **     *
// *  *    *   *
// **        * *
// *************
