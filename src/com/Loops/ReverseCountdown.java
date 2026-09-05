package com.Loops;

import java.util.Scanner;

public class ReverseCountdown {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
     
		System.out.println("Enter the statrting timer: ");
		int start = sc.nextInt();
		
		
		
		while(start > 0) {
			System.out.println(start + " ");
			start--;
		}
		sc.close();
	}

}
