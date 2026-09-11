package com.corejava.pattern;

public class ConcentricNumberPattern {

	public static void main(String[] args) {
		

		        for (int i = 1; i <= 7; i++) {

		            for (int j = 1; j <= 7; j++) {

		                int min = Math.min(
		                        Math.min(i, j),
		                        Math.min(8 - i, 8 - j)
		                );

		                System.out.print(5 - min + " ");
		            }

		            System.out.println();
		        }
		    }
		
	

}
