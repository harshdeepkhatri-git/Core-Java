package com.corejava;

import java.util.Scanner;

public class TernayPractise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value a: ");
		int a = sc.nextInt();
		
		System.out.println("Enter value b: ");
		int b = sc.nextInt();
		
		int max= a>b ? a : b;
		
		System.out.println("greater = " + max);

	}

}
