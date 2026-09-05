package com.Statements;

import java.util.Scanner;

public class OnlineExaminationAccess {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    
		System.out.println("Application Status (registered/ not registered) : ");
		 String application = sc.nextLine();
		 
		 System.out.println("College ID Status(valid/ invalid) : ");
		 String id = sc.nextLine();
		 
		 System.out.println("Internet Speed (Mbps): ");
		  int internet = sc.nextInt();
		  
		  if(application.equals("registered")) {
			  if(id .equals("valid")) {
				  if(internet >= 10) {
					  System.out.println("Exam Acess Granted");
				  }
				  else if(internet >=5 && internet <=9) {
					  System.out.println("Exam Acess Granted with Low Bandwidth Mode");
				  }
				  else {
					  System.out.println("Access denied");
				  }
			  }
			  else {
				  System.out.println("Access denied due to invalid College ID");
			  }
			  
		  }
		  else {
			  System.out.println("Access denied due to Applicant not registered");
		  }
		  sc.close();
	}

}
