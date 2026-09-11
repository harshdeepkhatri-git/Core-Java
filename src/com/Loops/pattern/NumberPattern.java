package com.corejava.pattern;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();
		
		//outer loop
		
		
		for(int i = 1; i<=n; i++) {
			
			//Starting space 
			
			for  (int s = 1; s<=(n-i)*2; s++){
				System.out.print(" ");	
			}
			// stars
			for(int j = i; j>=1; j--) {
				System.out.print(j + " " );
			}
			
			System.out.println();
	 }
		
			
  }
}
