package com.Loops;

 import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		  System.out.print("Enter Physics Marks : ");
		     float Physics = sc.nextFloat();
		     
		     
		     System.out.print("Enter Chemistry Marks : ");
	               float Chemistry = sc.nextFloat();
	                
	         System.out.print("Enter Maths Number : ");
	               float Maths = sc.nextFloat();
	               
	        float total = Physics + Chemistry + Maths ;
	        
	        float percentage = (total /300)*100;
	        
	    System.out.println("percentage = " + percentage + "% ");
	    
	   if (percentage >=40 && Physics >= 33 && Chemistry >= 33 && Maths >= 33) {
		   System.out.println("Pass");
		    
	   } 
	       else {
			    System.out.println("Fail");
		   }
		        sc.close();  
	   
	   }
	        
	}


