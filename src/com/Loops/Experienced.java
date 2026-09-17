package com.Loops;

import java.util.Scanner;

public class Experienced {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a character");
		String var = sc.next();

		switch (var) {
		case "Adult":
			System.out.println("You are going to become an Adult");
			break;
			
		case "harsh":
		   System.out.println("You are going to join job");
		   break;
		case "Radhe":
			   System.out.println("You are going to get retired");
			   break;
		default :
			   System.out.println("Enjoy your life dude");

		}
		       System.out.println("Thanks for using java");
			 
	    }
}

/*	if (age>56) {
			System.out.println("You are experienced");
		}
		else if(age>46) {
			System.out.println("You are semi-experienced");
		}
		else if(age>36) {
			System.out.println("You are semi semi experienced");
		}
		else 
			System.out.println("You are not experienced");
	}
   }
*/
