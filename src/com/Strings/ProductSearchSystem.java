package com.Strings;

import java.util.Scanner;

          // by using .equalIgnoreCase() method.

public class ProductSearchSystem {
    public static void main(String[] args) {
        String originalProduct = "mobiles";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product name: ");
        String productName = sc.nextLine();

        if(productName.equalsIgnoreCase(originalProduct)){
            System.out.println("Product is found");
        }
        else{
            System.out.println("Product is not found");
        }
        sc.close();
    }
}
