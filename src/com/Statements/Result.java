package com.Statements;

import java.util.Scanner;

public class Result {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Maths Marks:  ");
		  int math=sc.nextInt();
		  
		  System.out.println("Enter the Physics Marks: ");
		  int physics=sc.nextInt();
		  
		  System.out.println("Enter Chemistry Marks: ");
		  int chemistry = sc.nextInt();
		  
		  int total = 0;
		  double average = 0;
		  
		  total = math + physics + chemistry;
		  
		  average = total /3.0;
		  
		  System.out.println("Total: "+ total);
		  System.out.println("Average : "+ average);
		  
		  
		  
		   if (math >= 35 &&  physics>=35 && chemistry>=35) {
			   
		       if(average>=60)
		       System.out.println("Result : First Class");
		  
		  else if(average>=50)
		    System.out.println(" Result : Second Class");
		    
		    else if(average >= 35)
		    	 System.out.println(" Result : Pass");
		 
		    
		   }
         	else {
		 
		   System.out.println("Result: fail");
		 }
		   sc.close();
	}
}
		   
		
	


