package com.datatype;

import java.util.Scanner;

public class HourToSecond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Value in Hour: ");
		 
		  int h= sc.nextInt();
		  
		  int s = (h * 3600);
		  
		  System.out.println("Second = " + s);
		  
		  sc.close();
		
	}

}
