package com.Statements;

import java.util.Scanner;

public class AirlineBoardingDecision {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Check the ticket : (Valid/Invalid) ");
		String ticket = sc.nextLine();
		
		System.out.println("Check your id ");
		String id = sc.nextLine();
		
	
		System.out.println("Enter luggage weight: ");
		 int luggage = sc.nextInt();
		 
		 if(ticket .equals("valid") && id  .equals("valid") && luggage <=20) {
			 System.out.println("Boarding is allowed !!");			 
		 }
		 else if(ticket .equals("valid") && id .equals ("valid") && luggage >20 && luggage<30){
		  System.out.println("Boarding is allowed with Extra luggage fee");
		 }
		 else {
			System.out.println("boarding is not allowed"); 
		 }
		 
		sc.close();	  
	}

}
