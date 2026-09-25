package com.Loops;

import java.util.Scanner;

public class LCMOfTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter the Second Number: ");
		int b = sc.nextInt();
		
		int max = (a>b)? a: b;
		
		while(true) {

			if(max % a ==0 && max %b ==0) {
				System.out.println("LCM: "+ max);
				break;
			}
			max++;
		}

	}

}
