package com.corejava;

import java.util.Scanner;

public class MinimumUsingTernary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter temperature 1 value: ");
		  float temp1 = sc.nextFloat();
		  
		System.out.println("Enter temperature 2 value: ");
		 float temp2 = sc.nextFloat();
		 
	float minimum= temp1 < temp2 ? temp1: temp2;
	
	System.out.println("Minimun Temp = " + minimum);
	} 

}
