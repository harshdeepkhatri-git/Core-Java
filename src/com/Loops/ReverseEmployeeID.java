package com.Loops;

import java.util.Scanner;

public class ReverseEmployeeID {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       
		System.out.println("Enter your Employee id: ");
		int id = sc.nextInt();
		
	    int lastdigit = 0;
	    int reverse = 0;
	    
	    while(id>0) {
	     lastdigit = id%10;
	     reverse = reverse*10+ lastdigit;
	      id  = id/10;
	     
	    }
	    System.out.println(reverse);
	   
	}

}
