package com.datatype;

import java.util.Scanner;

public class SecondToHour {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value in second : ");
		int second = sc.nextInt();
		
		int Hour = (second/3600);
		int minutes = (second % 3600 )/ 60;
		int remainingsecond= (second % 60);
		
		System.out.println(Hour + "Hours " + minutes +"minutes " + remainingsecond + "second");
		
		sc.close();
		
	}

}
