package com.datatype;

import java.util.Scanner;

public class EmiCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Principle Amount : ");
		   int pa = sc.nextInt();
		   
		System.out.println("Enter rate of Interest per year (%) : ");
		   double ri = sc.nextInt();
		   
		System.out.println("Enter the tenure in year: ");
		    int Y = sc.nextInt();
		    
		 double R = ri/12/100;
		 
		 double M = Y*12;
		 
		 double temp = Math.pow(1+R , M);
		 
         double temp2 = (pa *R * temp) /(temp-1); 
         
         System.out.println(temp2 + " Result");
          
         sc.close();
	}
          
}
