package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      
		System.out.println("Enter size of 1st Array: ");
		int size = sc.nextInt();
		int [] arr = new int[size];
		
		System.out.println("Enter the elements of an array: ");
		 for(int i =0; i<arr.length; i++) {
			 arr[i] = sc.nextInt();
		 }

			System.out.println("Enter size of 2nd Array: ");
			int size2 = sc.nextInt();
			int [] Arr = new int[size2];
			
			System.out.println("Enter the elements of an array: ");
			 for(int j =0; j<arr.length; j++) {
				 Arr[j] = sc.nextInt();
			 }
			 
			    
			  int length = arr.length + Arr.length;
			  int [] newArr = new int[length];
			  
			  int i =0;
			  int j =0;
			  int k =0;
			  
			  
			 while(i<arr.length && j<Arr.length) {
				 if(arr[i]<=Arr[j]) {
					 newArr[k] = arr[i];
					 i++;
				 }else {
					 newArr[k] = Arr[j];
					 j++;
				 }
				k++;
				
				while(i<arr.length) {
					newArr[k] = arr[i];
					i++;
					k++;
				}
				while(j<Arr.length) {
					newArr[k] = Arr[j];
					j++;
					k++;
				}
			  }	 
			   System.out.println("new array : "+ Arrays.toString(newArr));
			   sc.close();
       }
	}
