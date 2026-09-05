package com.Statements;

import java.util.Scanner;

public class BankingFraudDetection {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Transaction Amount: ");
		 int amount = sc.nextInt();
		 
		 sc.nextLine();
		 
		 System.out.println("Location Of Transaction(same/different) : ");
		 String city = sc.nextLine();
		 
		 System.out.println("Enter Number of Transaction last 1 Hour: ");
		 int transaction = sc.nextInt();
		 
		 if(amount>100000 && city .equals("different")) {
			 System.out.println("High Risk !! Block Transaction");
		 }
		 else if(transaction > 5) {
			 System.out.println("Medium Risk !! Manual Verification");
		 }
		 else {
			 System.out.println("Low Risk !! Allow Transaction");
		 }
		 
		 sc.close();
				 
	}

}
