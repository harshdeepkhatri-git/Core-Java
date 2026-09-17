package com.Loops;

import java.util.Scanner;

public class
FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of n : ");
         int n = sc.nextInt();
         
    int a = 0;
    int b = 1;
    
    System.out.print(a + " ");
    System.out.print(b + " ");
         
         for( int i = 1; i<n-1; i++) {
        	int sum = a+b;
        	System.out.print(sum + " ");
        	 a =b;
        	 b=sum; 
         }
        
	}

}
