package com.Array;

import java.util.Scanner;

public class RemovingAnElementsFromAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of an array: ");
		int size = sc.nextInt();
		
		int[]arr = new int[size];
		
		System.out.println("Enter the elements to remove from an array: ");
		int elements = sc.nextInt();
		
		System.out.println("Enter the elements of an array: ");
		 for(int i = 0; i<arr.length; i++) {
			 arr[i] = sc.nextInt();
		 }
		 
		 int count = 0; 
		 
		 for(int i = 0; i<arr.length; i++) {
			 if(arr[i]==elements) {
				 count++;
			 }
		 }
		 if(count==0) {
			 System.out.println("Elements not found");
		 }
		 else {
			 // create new Array
			 
			 int []newArr = new int[arr.length - count];
			 
			 int j =0;
			 
			 //copy elements except given elements
			 
			 for(int i =0; i<arr.length; i++) {
				 if(arr[i] != elements) {
					 newArr[j] = arr[i]; 
					 j++;
				 }
			 }
			 System.out.print("New Array: ");
			 for(int i =0; i<newArr.length; i++) {
				 System.out.print(newArr[i]+ " ");
			 }
 		 }

	}

}
