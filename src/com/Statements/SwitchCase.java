package com.Statements;

import java.util.Scanner;

public class SwitchCase {

	 public static void main(String[] args) {
	      Scanner sc = new Scanner (System.in);
	      
	      System.out.print("Enter value a: ");
	        int a = sc.nextInt();
	      System.out.print("Enter value b: ");
	        int b = sc.nextInt();
	        
	        System.out.println("1. ADDITION");
	        System.out.println("2.SUBTRACTION");
	        System.out.println("3.MULTIPLICATION");
	        System.out.println("4.DIVISION");
	        
	        System.out.print("Choose your Choice: ");
	         int arithmetic= sc.nextInt();
	       
	        switch(arithmetic) {
	        
	        case 1: 
	        	System.out.println("Sum : " + (a+b));
	        	break;
	        	
	        case 2:
	        	System.out.println("Subtract: "+ (a-b));
	            break;
	            
	        case 3: 
	        	System.out.println("Multiplication: "+ a*b);
	        	break;
	        	
	        case 4:
	        	System.out.println("Division: "+ a/b);
	        	break;
	        	
	         default :
	        	 System.out.println("Invalid Input");
	        	 
	        }
	        sc.close();
	      }
	        
	    } 
	

		    
	