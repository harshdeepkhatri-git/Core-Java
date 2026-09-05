package com.Statements;

import java.util.Scanner;

public class EmployeeTaxCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Annual Income: ");
		int income = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Are you Female: (yes/no) ");
		String female = sc.nextLine();
		
		System.out.println("Senior citizen: (yes/no)");
		String senior = sc.nextLine();
		
		if(income <= 500000)
			System.out.println("No Tax");
		
		  if(income>500000 && income<1000000 && female.equals("yes") && senior.equals("yes") ) {
			int tax1 = ((income * 10)/100);
			 int tax2 = ((tax1*2)/100);
			 int tax3 = ((tax1*5)/100);
			 
			 System.out.println("Total Tax : " + (tax1 - tax2 - tax3 ));
		  }
		  else if(income> 500000 && income<1000000 && female.equals("yes") && senior.equals("no") ) {
			  int tax1 = ((income*10)/100);
			   int tax2 = ((tax1 * 2)/100);
			   System.out.println("Total tax : "+ (tax1 - tax2));
		  }
		  else if(income>500000 && income<1000000 && female.equals("no") && senior.equals("yes") ) {
			int tax = ((income * 10)/100);
			  int tax2 = ((tax*5)/100);
				 
		      System.out.println("Total Tax : " + (tax - tax2));
			  
		  }
		  else if(income >= 1000000 && income< 2000000 && female.equals("yes") && senior.equals("yes")) {
			 int tax1 = ((income*20)/100);
			  int tax2 = ((tax1 * 2)/100);
			  int tax3 = ((tax1*5)/100);
		  System.out.println("Total tax : "+ (tax1 - tax2- tax3));
			  
		  }
		  else if(income >= 1000001 && income< 2000000 && female.equals("yes") && senior.equals("no")) {
			 int tax1 = ((income*20)/100);
			  int tax2 = ((tax1 * 2)/100);
		  System.out.println("Total tax : "+ (tax1 - tax2));
		  }
		  
		  else if(income >= 1000001 && income< 2000000 && female.equals("no") && senior.equals("yes")) {
			  int tax1 = ((income*20)/100);
			 int tax2 = ((tax1*5)/100);
		  System.out.println("Total tax : "+ (tax1 - tax2));
		  }
		  else if(income >= 2000000 && female.equals("yes") && senior.equals("yes")) {
			 int tax1 = ((income*30)/100);
			 int tax2 = ((tax1 * 2)/100);
			  int tax3 = ((tax1*5)/100);
		  System.out.println("Total tax : "+ (tax1 - tax2 - tax3));
			  
		  }
		  else if(income >= 2000000 && female.equals("yes") && senior.equals("no")) {
			  int tax1 = ((income*30)/100);
			 int  tax2 = ((tax1 * 2)/100);
		  System.out.println("Total tax : "+ (tax1 - tax2));
		  }
		  else if(income > 2000000 && female.equals("no") && senior.equals("yes")) {
			  int tax1 = ((income*30)/100);
			  int tax2 = ((tax1*5)/100);
		  System.out.println("Total tax : "+ (tax1 - tax2));
		  }
	       sc.close();
		}

	}


