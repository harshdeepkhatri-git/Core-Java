package com.Statements;

import java.util.Scanner;

public class OnlineShoppingDiscountEngine {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Purchased Amount: ");
		int purchase = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("MemberShip Type (Premium or Regular): ");
		 String membership = sc.nextLine();
		 
		 if(purchase>=50000 && membership .equals("premium")) {
			 purchase = purchase - ((25*purchase)/100);
			 System.out.println("Total Payable Amount : "+ purchase);
		 }
		 else if (purchase>=50000 && membership .equals("regular")) {
			 purchase = purchase - ((15*purchase)/100);
			 
			 System.out.println("Total Payable Amount : "+ purchase);
		 }
		 else if(purchase>=20000 && purchase<=49999 && membership .equals("premium")) {
			 purchase = purchase - ((15*purchase)/100);
			 System.out.println("Total Payable Amount : "+ purchase);
		 }
		 else if(purchase>=20000 && purchase<=49999 && membership .equals("regular")) {
			 purchase = purchase - ((10*purchase)/100);
			 System.out.println("Total Payable Amount: "+ purchase);
		 }
		 else if(purchase<20000 && membership.equals("premium")) {
			 purchase = purchase - ((5*purchase)/100);
			 System.out.println("Total Payable Amount : "+ purchase);
		 }
		 else if(purchase<20000 && membership.equals("regular")) {
			 
			  System.out.println("Total Amount Payable: "+ purchase);
		 }
		 
		 else {
			   System.out.println("Invalid Output");
	     
	      }
		 sc.close();
	}
}

