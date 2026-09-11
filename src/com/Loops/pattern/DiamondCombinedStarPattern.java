package com.corejava.pattern;

public class DiamondCombinedStarPattern {

	public static void main(String[] args) {
int n = 5;
		
for (int i =1; i<=n; i++) {
	// space 
	for(int j = 1; j<=i-1; j++) {
		System.out.print(" ");
	}
	
	for(int j = i; j<=n; j++) {
		System.out.print("* ");
	}
	
			System.out.println();
		}

									//  Output
									//      * 
								//         * * 
								//        * * * 
								  //     * * * * 
								//      * * * * * 

// Inverted one for  Above

for(int i = 1; i<=5; i++) {
	
	// Spaces
	for(int j = 1; j<=n-i; j++) {
		System.out.print(" ");
		}
	
		for (int j = 1; j<=i; j++) {
		System.out.print("* ");
	}
    	
    	System.out.println();
    	
    }

	}

}

//Output
		//	        * * * * * 
		//			 * * * * 
	//				  * * * 
		//			   * * 
	//				    * 
		//			    * 
		//			   * * 
	//				  * * * 
	//				 * * * * 
		//			* * * * * 





