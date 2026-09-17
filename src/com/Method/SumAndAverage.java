package com.Method;

public class SumAndAverage {

	public static void main(String[] args) {
		int[]numArray = ArrayUtility. inputArray();
		
		double sum = sum(numArray);
        double average = average(numArray);
        
        System.out.println("Sum of Numbers: "+ sum);
        System.out.println("Average of the number: "+ average);
	}

	private static double average(int [] numArray) {
		double sum = sum(numArray);
		return (int)(sum/numArray.length);
	}

	private static double sum(int[] numArray) {
		long sum = 0;
		for(int i = 0; i<numArray.length; i++) {
			sum +=numArray[i];
			 i++;
		}
		return sum;
	}

}
