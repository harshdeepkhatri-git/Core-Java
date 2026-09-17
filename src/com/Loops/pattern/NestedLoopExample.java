package com.Loops.pattern;

import java.util.*;
public class NestedLoopExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the value of N: ");
		 int n = sc.nextInt();
		 
		 System.out.println("Enter the value of m: ");
		 int m = sc.nextInt();
		 
	 for(int i=1; i<=n; i++) {
		 
		 for (int j=1; j<=m; j++) {
			 System.out.print("*");
		 }
		 System.out.println();
	 }
		 
	 
	 sc.close();
	}

}
