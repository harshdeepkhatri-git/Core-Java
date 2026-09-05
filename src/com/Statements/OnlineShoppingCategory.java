package com.Statements;

import java.util.Scanner;

public class OnlineShoppingCategory {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.Electronics");
		System.out.println("2.Fashion");
		System.out.println("3.Grocery");
		System.out.println("4.Furniture");
		System.out.println("5.Sports");
		
		System.out.println("Enter your choice : (1 to 5): ");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1: System.out.println("Welcome to Electronics");
		break;
		
		case 2: System.out.println("Welcome to Fashion");
		break;
		
		case 3: System.out.println("Welcome to Grocery");
		break;
		
		case 4: System.out.println("Welcome to Furniture");
		break;
		
		case 5: 
			System.out.println("Welcome to Sports");
			break;
			
			default :
				System.out.println("Invalid Choice");
		}
		sc.close();
	}

}
