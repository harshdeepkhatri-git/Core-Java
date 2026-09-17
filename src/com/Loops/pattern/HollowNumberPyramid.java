package com.Loops.pattern;

public class HollowNumberPyramid{

    public static void main(String[] args) {

    	

    	        int n = 5;

    	        for (int i = 1; i <= n; i++) {

    	            // Starting spaces
    	            for (int j = 1; j <= 2 * (n - i); j++) {
    	                System.out.print(" ");
    	            }

    	            // Numbers and middle spaces
    	            for (int j = 1; j <= 2 * i - 1; j++) {

    	                if (i == n || j == 1 || j == 2 * i - 1) {
    	                    System.out.print("1");
    	                } else {
    	                    System.out.print(" ");
    	                }
    	            }

    	            System.out.println();
    	        }
    	    }
    	}

//output
//1
//1 1
//1   1
//1     1
//111111111

