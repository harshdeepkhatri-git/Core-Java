package com.datatype;

import java.util.Scanner;

public class SumOfEven {

	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = sc.nextInt();
		int sum = 0;

		while(num > 0){
		  int temp = num%10;
		    if(temp%2 ==0){
		      sum = sum + temp;
		      } 
		   num = num/10;
		}
		  System.out.println(sum);
		}

}
