package com.datatype;

import java.util.Scanner;

public class FirstExample{
public static void main(String[]args){
  Scanner sc = new Scanner (System.in);
  System.out.print("Enter your name: ");
  String name = sc.nextLine();
System.out.println(name);

System.out.print("Enter your age: ");
 int number=sc.nextInt();
System.out.println(number);

System.out.print("Place Of birth: ");
String place= sc.nextLine();
System.out.println(place);
}
}