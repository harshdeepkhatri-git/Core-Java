package com.corejava.pattern;

public class DownwardRightAngledStarPattern {

	public static void main(String[] args) {
		
		int n = 5;
		
            //for(int i =1 ; i<=n; i++) {
			
			//for(int j = 1; j<=i; j++) {
			  // if(i ==n || j ==1 || j==i){
			    // System.out.print("*");
			    //}
			     //else{
			       //  System.out.print(" ");
			     //}
			    
			//}
			  //System.out.println();
            //}
		
		for(int i =n; i>=1; i--) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
			     
		

	


