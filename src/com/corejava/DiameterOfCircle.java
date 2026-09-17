package com.corejava;

import java.util.Scanner;

public class DiameterOfCircle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter the radius: ");
	double r= sc.nextDouble();
	
	System.out.println("Diameter: "+ (2*r));
	System.out.println("Circumference: "+ (2*3.14*r) );
	System.out.println("Area: " + (3.14*(r*r )));
	
	sc.close();
	}

}
