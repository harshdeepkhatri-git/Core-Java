package com.Statements;

import java.util.Scanner;

public class EmployeeEligibilityCheck {

	public static void main(String[] args) {
     
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Age: ");
		  int age=sc.nextInt();
		  
		  System.out.println("Enter your Salery: ");
		   double salery= sc.nextDouble();
		   
		   System.out.println("Enter your performance Score: ");
		    int performance = sc.nextInt();
		    
		 if(age>=21) {
			 if(salery>=25000) {
				 if(performance >=700) {
					 System.out.println("Congratulation!! you are eligible .");
				 }
				 else { 
					 System.out.println(" poor performance !! not eligible.");
				    }
	  			 
				 }
			 else {
				 System.out.println("Low salery !! not eligible.");
			 }	 
		 }
		 else {
			 System.out.println("under age !! not eligible");
		 }
	sc.close();
	}
}
