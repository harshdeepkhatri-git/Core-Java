package com.Array;

import java.util.Scanner;

public class ReverseAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of an array: ");
		int size= sc.nextInt();
		
		int[]arr=new int [size];
		
		System.out.println("Enter the elements of an array: ");
		for(int i =0; i <arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int i = 0;
		int j =arr.length-1;
		int temp = 0;
		
		while(i<j) {
			  temp = arr[i];
			  arr[i] = arr[j];
			  arr[j] = temp;
			  i++;
			  j--;
		}
		System.out.println("Reversed Array: ");
		    for(int r =0; r<arr.length; r++) {
		    	System.out.println(arr[r]+ " ");
		    }
		    sc.close();
	   }
	}

