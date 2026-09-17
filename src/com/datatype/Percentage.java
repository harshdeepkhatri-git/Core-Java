package com.datatype;

import java.util.Scanner;

public class Percentage{

public static void main(String[]args){

Scanner scan= new Scanner(System.in);
  System.out.println("Enter maths marks: ");
     int maths = scan.nextInt();
  System.out.println("Enter physics marks: ");
     int physics = scan.nextInt();
  System.out.println("Enter biology marks: ");
     int biology = scan.nextInt();
  System.out.println("Enter chemistry marks: ");
     int chemistry = scan.nextInt();
  System.out.println("Enter computer marks: ");
     int computer = scan.nextInt();

  float percentage = ((maths + physics + biology + chemistry + computer)/500.0f)*100;

System.out.println("percentage: " + percentage);




}



}
