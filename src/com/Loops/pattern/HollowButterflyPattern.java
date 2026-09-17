package com.Loops.pattern;

public class HollowButterflyPattern {

	public static void main(String[] args) {
		int n = 5;
		//OuterLoop
		for(int i=1; i<=9; i++) {
			//innerLoop
			
		for(int j= 1; j<=9; j++) {
			//Star and middle space
			
			if( j==1|| j==9|| j==i || j==10-i  ) {
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
