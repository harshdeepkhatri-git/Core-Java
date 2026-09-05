package com.datatype;

import java.util.Scanner;

public class SumOfNaturalNumber{
public static void main(String[]args){
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter Value: ");
 int n = sc.nextInt();
 int p = 0;
 for(int i = 0; i<=n; i++){
        p = p+i; 
      
    }
     System.out.println(p); 
  }

}