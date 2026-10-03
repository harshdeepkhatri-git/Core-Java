package com.OopsPractice.Methods;

import java.util.Scanner;

class Product{
    Scanner sc = new Scanner(System.in);
    String productName;
    double price;
    int quantity;

    void takeDetails(){
        System.out.println("Enter the Product Name: ");
        productName = sc.nextLine();

        System.out.println("Enter the product price: ");
        price = sc.nextDouble();

        System.out.println("Enter the Quantity: ");
        quantity = sc.nextInt();
    }
    void calculateTotal(){
         System.out.println("The productName is = "+ productName);
         System.out.println("The product price is = "+ price);
         System.out.println("The quantity is = "+  quantity);

         System.out.println("Total price is = " + price * quantity);
    }
}

public class Practice7 {
    public static void main(String[] args){
        Product p1 = new Product();
        p1.takeDetails();
        p1.calculateTotal();

    }
}
