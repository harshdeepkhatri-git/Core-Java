package com.Statements;

import java.util.Scanner;

public class TrafficSignal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
  System.out.println("1.red");
  System.out.println("2.yellow: ");
  System.out.println("3.Green: ");
  
  System.out.println("Enter Signal: ");
    int signal = sc.nextInt();
    
    switch(signal) {
    case 1:
    	 System.out.println("Stop");
    	 break;
    	 
    case 2: 
    	System.out.println("Ready");
    	break;
    	
    case 3:
    	System.out.println("Go");
    	break;
    	
    default:
    	System.out.println("Invalid signal");
    	
    }
      sc.close();
	}

}
