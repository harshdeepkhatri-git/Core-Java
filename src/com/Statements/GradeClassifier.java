package com.Statements;

import java.util.Scanner;

public class GradeClassifier {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your grade: ");
		char grade = sc.next().charAt(0);
		
		
		
		if(grade == 'A' ) {
			System.out.println("Excellent");
		}
		else if(grade == 'B') {
			System.out.println("Good");
		}
		else if(grade =='C') {
			System.out.println("Fair");
		}
		else if(grade == 'D') {
			System.out.println("Poor");
		}
		else if(grade=='F') {
			System.out.println("Failing");
		}
		else {
			System.out.println("Invalid Grade");
		}
		sc.close();

	}

}
