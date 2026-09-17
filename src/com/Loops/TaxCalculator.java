package com.Loops;

  import java.util.Scanner;

public class TaxCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double income , tax ;
		
		System.out.println("Enter youor income : ");
		 income = sc.nextDouble();
		 
	 if (income <= 250000){
	    tax = 0;
	 }
	    
	    else if (income <= 500000) {
	     tax = (income * 5 / 100 );
	    }
	     
	    else if (income <= 1000000) {
	     tax = (income * 20 / 100);
	    } 
	     
	    else  {
	    	tax = (income * 30 / 100);
	      }
	 System.out.println("Income = " + income);
	 
	 System.out.println("Tax = " + tax);
	 
	     sc.close();
	    }

	}


