package com.corejava;
import java.util.Scanner;
public class RabbitHen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of head: ");
		  int head = sc.nextInt();
		  
		System.out.println("Enter number of legs: ");
		  int leg = sc.nextInt();
		 
	    // rabbit leg 4  
	   int rabbit = (leg -2*head)/2;
	   
	   int hen = (head - rabbit); 
	   System.out.println("Rabbit = "+ rabbit);
	   System.out.println("Hens = "+ hen);
	   
	   
	 
	}
}