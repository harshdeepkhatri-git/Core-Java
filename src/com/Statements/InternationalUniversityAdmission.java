package com.Statements;

import java.util.Scanner;

public class InternationalUniversityAdmission {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ielts score: ");
		double ielts = sc.nextDouble();
		
		System.out.println("Enter your gre score: ");
		int gre = sc.nextInt();
		
		System.out.println("Enter your CGPA: ");
		double cgpa = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.println("Is there any backlog : (yes/no)");
		String backlog = sc.nextLine();
		
		System.out.println("SOP Status: (approved/rejected)");
		String sop= sc.nextLine();
		
		if(ielts>=7.0) {
			if(gre>=315) {
				if(cgpa>=8.5) {
					if(backlog.equals("no")) {
						if(sop.equals("approved")) {
							if(cgpa>=9.5 && gre>=330) {
								System.out.println("Admission Granted with 100% Scholarship");
							}
							else if(cgpa>=9.0 && gre >=325 ) {
								System.out.println("Admission Granted with 75% Scholarship");
							}
							else if(cgpa>=8.7 && gre>=320) {
								System.out.println("Admission granted with 50% scholarship");
							}
							else {
								System.out.println("Admission Granted");
							}				
						}
					}
				}
			}
		}
		else {
			System.out.println("Admission Rejected");
		}
		sc.close();
	}
}
