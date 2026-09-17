package com.Loops;

import java.util.Scanner;


public class WebsiteUrl {
	

   public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Website : ");
		
		String Website = sc.next();
		
		if (Website .endsWith(".com")) {
			System.out.println("This is a commercial website ");
		}
		
		else if (Website .endsWith(".org")) {
			System.out.println("This is organizational Website ");
		}
		
		else if (Website .endsWith(".in")) {
			
		  System.out.println("This is an indian Website ");
		}  
		    sc.close();
   }
}
