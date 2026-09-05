package com.Statements;

import java.util.Scanner;

public class Greatest{
public static void main(String[]args){
  Scanner sc = new Scanner (System.in);
     System.out.print("Enter first number: ");
       int num1 = sc.nextInt();
     System.out.print("Enter second number: ");
       int num2 = sc.nextInt();
     System.out.print("Enter third number: ");
       int num3 = sc.nextInt();
     System.out.print("Enter fourth number: ");
        int num4 = sc.nextInt();
     int result ; 
if(num1>num2 && num1>num3 && num1>num4){
   result=num1;
}else if(num2>num1 && num2>num3 && num2>num4){
   result=num2;
}else if(num3>num1 && num3>num2 && num3>num4){
   result=num3;
}else{
   result=num4; 
    }
 System.out.println(result + " is the greatest");
 sc.close();
  }
}
