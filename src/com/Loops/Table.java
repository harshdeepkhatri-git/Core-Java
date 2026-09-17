package com.Loops;

import java.util.Scanner;

public class Table{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number: ");
int n = sc.nextInt();

for(int i = 1; i<11; i++){
	System.out.print(n);
	System.out.print(  " x" + " ");
	System.out.print(i + " = ");
   System.out.println(n*i);

}

}

}

//output
//     Enter the number: 5
//      5*1=5
//      5*2=10
//      5*3=15
//      5*4=20
//      5*5=25
//      5*6=30
//      5*7=35
//      5*8=40
//      5*9=45
//      5*10=50
