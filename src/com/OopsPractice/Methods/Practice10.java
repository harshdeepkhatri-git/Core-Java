package com.OopsPractice.Methods;

import java.util.Scanner;

class Mobile{
    Scanner sc = new Scanner(System.in);
     String brand;
     double price;
     int storage;

     void takeDetails(){
         System.out.println("Enter Brand Name: ");
         brand = sc.nextLine();

         System.out.println("Enter price : ");
         price = sc.nextDouble();

         System.out.println("Enter the storage: ");
         storage = sc.nextInt();
     }

     void checkStorage(){
         System.out.println("Brand : "+ brand);
         System.out.println("Price : "+ price);
         System.out.println("Storage : "+ storage);
         if(storage >= 128){
             System.out.println("Good Storage");
         }
         else{
             System.out.println("Low Storage");
         }
     }
}

public class Practice10 {
    public static void main(String[] args){
      Mobile mob = new Mobile();
      mob.takeDetails();
      mob.checkStorage();

    }
}
