package com.Array;

import java.util.Scanner;

public class CheckArrayIsSorted {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the size pof an Array: ");
		int size = sc.nextInt();
		
		int[]arr = new int[size];
		
		System.out.println("Enter the elements of an array: ");
		for(int i =0 ; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
				
			boolean sorted = true;

		for(int i =0; i<arr.length-1; i++) {
			
			if(arr[i] > arr[i+1]) {
				sorted = false;
				break;
			}
		  }
			if(sorted) {
			System.out.println("Your Array is Sorted");
		}
		else {
			System.out.println("Your array is not sorted");
		}
			sc.close();

	}

}
