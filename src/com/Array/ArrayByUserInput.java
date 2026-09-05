package com.Array;

import java.util.Scanner;

public class ArrayByUserInput {

	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter Array Size: ");
         int size= sc.nextInt();
         
         int []arr = new int[size];
         
        System.out.println("Enter the elements: ");  
        for(int i = 0; i<arr.length; i++) {
        	arr[i]=sc.nextInt();
        }
        System.out.println("Array Elements: ");
        for(int i= 0; i<arr.length; i++) {
        
        System.out.println(arr[i]);
	}
  }
}
