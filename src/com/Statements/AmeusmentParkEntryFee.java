package com.Statements;

import java.util.Scanner;

public class AmeusmentParkEntryFee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    System.out.println("Enter your age: ");
     int age = sc.nextInt();
     
     sc.nextLine();
     
    System.out.println("1. Weekdays");
    System.out.println("2. Weekends ");
    
    System.out.println("Enter your choice : ");
      String choice = sc.nextLine();
      
    switch(choice) {
    
    case "1" : 
    	if (age <12) {
    		int fee = 100;
    		System.out.println("fee : "+ fee);
    	}
    	if(age >=12 && age<=60) {
    		int fee = 200;
    		System.out.println("fee : "+ fee);
    	}
    	
    	if(age>60) {
    		int fee = 120;
    		System.out.println("fee : "+ fee);
    	}
    	
    	break;
    	
    case "2" :
    	
    	if (age <12) {
    		int fee = 100;
    		System.out.println("fee : "+ (fee +50));
    	}
    	if(age >=12 && age<=60) {
    		int fee = 200;
    		System.out.println("fee : "+ (fee+ 50));
    	}
    	
    	if(age>60) {
    		int fee = 120;
    		System.out.println("fee : "+ (fee+50));
    	}
    	
    	 break;
    
    default: 
  	  System.out.println("Invalid Choice");
    
    }
      
     sc.close();
     
     
	}
}
