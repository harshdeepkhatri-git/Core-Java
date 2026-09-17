package com.corejava;

import java.util.Scanner;

public class VoteEligibleUsingTernary {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter your age : ");
		 int age = sc.nextInt();
		 
		 String age1 = (age>= 18 ) ? "eligible" : "not eligible";
		 
		 System.out.println("age = " + age1);
		 
		 
	 
		
	}

}
