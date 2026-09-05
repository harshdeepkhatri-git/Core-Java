package com.Array;

import java.util.Scanner;

public class ToCheckPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      
		System.out.println("Enter the size of an array: ");
		int size= sc.nextInt();
		
		int[]arr = new int[size];
		
		System.out.println("Enter the elements of an array: ");
		  for(int i =0; i<arr.length; i++) {
			  arr[i] = sc.nextInt();
		  }
		  
		  boolean palindrome = true;
		  
		  for(int i =0,  j= size-1; i<j ; i++, j--) {
			  if(arr[i] != arr[j]) {
				  palindrome = false;
				  break;
			  }
		  }
		  if(palindrome) {
			  System.out.println("Array is Palindrome");
		  }
		  else {
			  System.out.println("Array is not a palindrome");
		  }

	}

}
