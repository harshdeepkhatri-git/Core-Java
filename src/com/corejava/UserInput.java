package com.corejava;

import java.util.Scanner;

public class UserInput{
	public static void main(String[] args) {
		   Scanner sc = new Scanner (System.in);
	 System.out.println("Enter your name: ");
	    String name= sc.nextLine();
	   
	  System.out.println("Enter you age: ");
	    int age = sc.nextInt();
	    
	    sc.nextLine();  // here it is used to ignore the buffer creted while converting from int to string , from string to int buffer doesn't occur.
	    
	   System.out.println("Enter your city: ");
	    String city= sc.nextLine();
	    
	    
	    System.out.println("Name: " + name);
	    System.out.println("Age: " + age);
	    System.out.println("City: " + city);
	    
	    sc.close();
	}
}