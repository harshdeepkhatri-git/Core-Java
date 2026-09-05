package com.corejava.pattern;

//import java.util.Scanner;

public class NestedLoopQuestion {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
	//System.out.println("Enter the value of a ");
		//int a = sc.nextInt();
		
	//if (a==11)
      //     System.out.println("I am 11");
    //else
    	//System.out.println("I am not 11");
	//
	//sc.close();
    //}
	//}
		
		int n = 5;
		
		// upper part

for(int i = 1; i<=n; i++) {
	for (int j = 1; j<=i; j++) {
		System.out.print("*");
}
	System.out.println();                                    // Output
	                                                                    //*
                                                                        //**
	                                                                    //***
	                                                                    //****
	                                                                    //*****
	                                                                    //****
	                                                                    //***
	                                                                    //**
	                                                                    //*
	}
// lower part
        
   for(int i =4; i>=1; i--) {
	   for(int j = 1; j<=i; j++) {
		   System.out.print("*");
	   }
	   
	   System.out.println();
   }
	 
}
	
}
