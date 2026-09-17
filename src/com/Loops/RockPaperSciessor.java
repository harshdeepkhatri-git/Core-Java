package com.Loops;

import java.util.Scanner;
import java.util.Random;

public class RockPaperSciessor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("Enter Your choice : ");
		
		System.out.println("1. Rock ");
		System.out.println("2. Paper ");
		System.out.println("3.Sciessor ");
		
		int userchoice =sc.nextInt();
		
		if (userchoice < 1 || userchoice > 3 ) {
			System.out.println("Invalid Choice");
			sc.close();
			return;
		}
		
		int computerchoice = random.nextInt(3)+ 1; 
		
		System.out.println("ComputerChoice:  " + computerchoice);
		if (userchoice == computerchoice) {
			System.out.println(" Match Draw ");
		}
		else if ((userchoice == 1 && computerchoice == 3)|| (userchoice == 2 && computerchoice ==1 )|| (userchoice == 3 && computerchoice == 2)) {
			System.out.println("You win ! ");
			
		
			}
		else {
			System.out.println(" Computer Wins ! ");
			
		   {
				System.out.println( " Invalid Number ");
			}
		}
		  sc.close();
	}

}
