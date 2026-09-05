package com.datatype;

import java.util.Scanner;

public class MinutesToHours {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter values in minutes: ");
		
		int minutes = sc.nextInt();
		
		int m = minutes/60;
		int remainingminutes = minutes % 60;
		
		System.out.println(m + " Hours " + remainingminutes + " minutes ");
		
		
		sc.close();
	}

}
