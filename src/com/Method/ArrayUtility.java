package com.Method;

import java.util.Scanner;

public class ArrayUtility {

	public static int[] inputArray() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of an elements : ");
		int size =sc.nextInt();
		
		int[] num = new int[size];
	
         for( int i = 0; i<size; i++) {
        	 System.out.println("Please Enter the Elements " + (i+1) + " = " + "" );
        	 num [i]=sc.nextInt();
         }
         return num;
	}

}
