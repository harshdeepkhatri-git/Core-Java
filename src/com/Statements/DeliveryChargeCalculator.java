package com.Statements;

import java.util.Scanner;

public class DeliveryChargeCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		
		System.out.println("Enter distance in km: ");
		  int Distance = scan.nextInt();
		  
		  int deliveryCharge ;
		  
		if(Distance <= 3) {
		  System.out.println("Free Delivery");
	}
		  else if (Distance<=6) {
		   deliveryCharge = (Distance - 3)*12;
		   System.out.println("Delivery Charge : " + deliveryCharge);
		  }
		   else     {
			   deliveryCharge= (3*12)+ (Distance-6) *16;
			   System.out.println("Delivery Charge : " + deliveryCharge);  
		   }
	scan.close();
		
	   }				  
	
   }
