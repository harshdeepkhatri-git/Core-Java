package com.OopsPractice.RevisionTillInheritance;

class Product{
    String productName;
    int price;

    Product(String productName, int price){
        this.productName = productName;
        this.price = price;
    }

     double calculatePrice(int quantity){
        return quantity * price;
    }
}

class Electronics extends Product{
    int warrantyYears ;
    Electronics(String productName, int price, int warrantyYears){
        super(productName, price);
        this.warrantyYears = warrantyYears;
    }

    @Override
     double calculatePrice(int quantity){
//        super.calculatePrice(quantity);
      double total =  super.calculatePrice(quantity);
        if(total >= 10000){
           total = total - (total*10)/100;
        }
        return total;
    }

    void displayDetails(int quantity){
        double originalTotal = super.calculatePrice(quantity);
        double finalTotal = calculatePrice(quantity);
        double discount = originalTotal - finalTotal;


        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + price);
        System.out.println("Warranty Years: " + warrantyYears);
        System.out.println("Quantity : "+ quantity);
        System.out.println("Original Price : "+ originalTotal);
        System.out.println("Discount : "+ discount);
        System.out.println("Final price: "+ finalTotal);
    }
}

public class Task13 {
    public static void main(String [] args){
        Electronics e = new Electronics("Laptop", 60000, 2);
        e.displayDetails(1);
    }
}
