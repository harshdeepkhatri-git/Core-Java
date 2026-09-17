package com.Method;

import java.util.Scanner;

public class OccuranceArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Array Occurance.");
		int []numArr = ArrayUtility .inputArray();
		
		System.out.println("Enter the number you want to find in an array: ");
		 int num = sc.nextInt();
		 
		 int occurance = NoOfOccurance(numArr, num);
		 if (occurance>0)
		 System.out.println("Your Number found  " + occurance + " time in an Array");
		 else {
			 System.out.println("Your number does not exist in an Array");
		 }
	}

	public static int NoOfOccurance(int[] numArr, int num) {
		int occurance = 0;
		
		for(int i = 0; i<numArr.length; i++) {
			if(numArr[i] == num) {
				occurance++;
			}
		}
		
   		return occurance;
	}

}
