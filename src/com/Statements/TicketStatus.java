package com.Statements;

import java.util.Scanner;

public class TicketStatus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
          
		System.out.print("Enter the Number of Seats Available: ");
		int availableseat = sc.nextInt();
		
		System.out.print("Enter Number of Current Waiting List: ");
		int waiting= sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("RAC Availability: (yes/no) ");
		String rac = sc.nextLine();
		
		System.out.print("Senior citizen: (yes/no) ");
		String senior = sc.nextLine();
		
		
		if(availableseat > 0 && senior .equals("yes")) {
			System.out.println("Booking Status: Confirmed , Lower Birth Prefered Due to Senior Citizen");
		  }
		
		else if (availableseat >0 && senior.equals("no")) {
			System.out.println("Booking Status : Confirmed , Upper berth alloted");
		}
		
		if(availableseat==0) {
			if(waiting<=20) {
				System.out.println("Booking Status: Waiting list");
			}
			else if (waiting >20 && rac .equals("yes")) {
				System.out.println("Book Status : Reservation against cancellation (RAC)");
			}
			else {
				System.out.println("Booking Status: Rejected");
			}
		}
	    sc.close();	
	}

}
