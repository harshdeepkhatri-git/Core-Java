package com.Statements;

import java.util.Scanner;

public class SpaceMissionFinalSelection {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
     System.out.println("Enter the age: ");
     int age=sc.nextInt();
     
     System.out.println("Enter your height: ");
     int height=sc.nextInt();
     
     sc.nextLine();
     
     System.out.println("Enter your vision: (perfect/imperfect) ");
     String vision= sc.nextLine();
     
     System.out.println("Enter your experience in year: ");
     int experience = sc.nextInt();
     
     System.out.println("Enter your fitness score: ");
     int fitness = sc.nextInt();
     
     sc.nextLine();
     
     System.out.println("Enter psychological test: (passed/failed) ");
     String test = sc.nextLine();
     
     System.out.println("Enter Swimming test: (passed/failed)");
     String swimming = sc.nextLine();
     
     
     
     if(age<30 || age>42) {
    	 System.out.println("Age rejected");
     }
     else if(height<160 || height >185) {
    	 System.out.println("Height Rejected");
     }
     else if(vision.equals("imperfect")) {
    	 System.out.println("Vision Rejected");
     }
     else if(experience<8) {
    	 System.out.println("experience rejected");
     }
     else if(fitness<95) {
    	 System.out.println("Fitness Rejected");
     }
     else if(test.equals("failed")) {
    	 System.out.println("Psychological test rejected ");
     }
     else if(swimming.equals("failed")) {
    	 System.out.println("Swimming Rejected");
     }
     else {
    	  System.out.println("Mission Selected");
     }
    	 sc.close();
	}

}
