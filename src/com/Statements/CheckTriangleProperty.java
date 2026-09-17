package com.Statements;
import java.util.Scanner;

public class CheckTriangleProperty {

	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		
	 System.out.println("Enter side a: ");
	  int a= sc.nextInt();
	  
	  System.out.println("Enter side b: ");
        int b = sc.nextInt();
        
      System.out.println("Enter side c: ");
       int c = sc.nextInt();
       
       if(a+b > c && b + c > a && c + a > b )
        {
         if(a == b &&  b == c ) {
        	 System.out.println("The Triangle is equilateral triangle.");
         }
         
         else if(a==b || b == c || a==c) {
        	 System.out.println("The Triangle is isoceles Triangle.");
         }
         else if ( a != b && b!=c && c!=a) {
        	 System.out.println("The Triangle is Scaler Triangle.");
         }
          
         } 	 
       else {
      	 System.out.println("Not a valid Triangle."); 
         }
       sc.close();
	}

}

