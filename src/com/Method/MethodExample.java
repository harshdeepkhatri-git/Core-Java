package com.Method;

public class MethodExample {

	public static void main(String[] args) {
		
		firstpattern();
		System.out.println(" ");
		
		secondpattern();
		System.out.println(" ");
		
		thirdpattern();
		System.out.println(" ");
		
		
	}
	
	public static void firstpattern() {
		
		
          int n = 7;
		
		//Outer Loop
		
		for(int i=1; i<=7; i++) {
		
		  // inner loop
		
	   for(int j = 1; j<=13; j++) {
		   //Star and middle Space
		   
		  if( j==14-(2*i-1)|| j==2*i-1) {
			  System.out.print("*");
		  }
		  else {
			  System.out.print(" ");
		  }
	       }
	   System.out.println();
	  }
	}	
		
		public static void secondpattern() {
			
          int n = 5;
          	
          	for (int i = 1; i<=n; i++) {
          		
          		for (int j = 1; j<=n; j++) {
          			System.out.print("*");
          		}
               System.out.println();
          	   }      
		}
	
		
		
		public static void thirdpattern() {
			int n =5;
			
			for(int i = 1; i<=n; i++) {
				for(int j=1; j<=2*i-1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			

			    System.out.println();
			}
		}
		
  


