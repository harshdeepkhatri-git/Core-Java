package com.Statements;

import java.util.Scanner;

public class SmartHospitalEmergencyTriage {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter heart rate: ");
		   int heart = sc.nextInt();
		   
		   System.out.println("Enter Oxygen Level: ");
		    double oxygen= sc.nextDouble();
		    
		    System.out.println("Weather Consciousness (Yes/No): ");
		    String Consciousness = sc.next();
		    
		   
		    
		    System.out.println("Weather bleeding (yes/no): ");
		    String bleeding=sc.next();
		    
		    
		    if( Consciousness .equals("no") || oxygen<85) {
		    	System.out.println("Condition is Critical");
		    }
		    else if( bleeding .equals("yes") && oxygen<92) {
		    	System.out.println("Condition is at High Priority");
		    }
		    else if ( heart<60) {
		    	System.out.println("Patient is at medium Priority");
		    	
		    }
		    
		    else {
		    	System.out.println("Patient is Stable");
		    }
		    
		sc.close();

	}

}
