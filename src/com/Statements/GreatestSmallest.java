package com.Statements;

import java.util.Scanner;

public class GreatestSmallest{
public static void main(String[]args){
 Scanner sc = new Scanner (System.in);
   System.out.print("Enter First Number: ");
     int num1 = sc.nextInt();
   System.out.print("Enter Second Number: ");
     int num2 = sc.nextInt();
   System.out.print("Enter Third Number: ");
     int num3 = sc.nextInt();
  System.out.print("Enter Fourth Number: ");
     int num4 = sc.nextInt();
     int greatest;
     int smallest;

if(num1>num2 && num1>num3 && num1>num4){
   greatest=num1;
}else if(num2>num1 && num2>num3 && num2>num4){
   greatest=num2;
}else if(num3>num1 && num3>num2 && num3>num4){
   greatest=num3;
}else{
   greatest=num4;   
}

if(num1<num2 && num1<num3 && num1<num4){
    smallest=num1;
}else if(num2<num1 && num2<num3 && num2<num4){
    smallest=num2;
}else if(num3<num1 && num3<num2 && num3<num4){
    smallest=num3;
}else{
    smallest=num4;
 }

System.out.println(greatest + " is the greatest ");
System.out.println(smallest + " is the smallest ");

sc.close();
  }

}