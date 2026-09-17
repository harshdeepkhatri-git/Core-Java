package com.Statements;

import java.util.Scanner;

public class MenuBasedATM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int balance = 10000;
		
		
	System.out.println("1. Check balance ");
	System.out.println("2. Withdraw ");
	System.out.println("3. deposit "); 
	System.out.println("4. Exit");
	
	System.out.print("Enter your Choice: ");
	    int Query= sc.nextInt();
		
	
	   switch(Query) {
	      case 1: 
	    	  System.out.println("Balance : " + balance);
	    	  break;
	    	  
	      case 2: 
	    	  System.out.print("Enter Amount to withdraw: ");
	    	    int withdraw = sc.nextInt();
	    	  System.out.println("Please Collect Your Cash");
	    	  System.out.print("Total Balance: "+ (balance - withdraw));
	    	  
	    	  break;
	    	  
	      case 3 :
	    	  System.out.print("Enter Amount to Deposit: ");
	    	     int deposite = sc.nextInt();
	    	  System.out.println("Money Deposited Successfully");
	    	  System.out.print("Total Balance: " + (balance + deposite));
	    	  
	    	  break;
	    	  
	      case 4:
	    	  System.out.println("Thankyou for using ATM");
	    	  break;
	    	  
	      case 5:
	    	  System.out.println("Invalid Choice");
	   
	   }
     sc.close();
	} 

} 
