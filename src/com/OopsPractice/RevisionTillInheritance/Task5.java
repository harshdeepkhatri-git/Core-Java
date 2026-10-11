//Question 5 — Online Shopping Order

package com.OopsPractice.RevisionTillInheritance;

class ShoppingOrder{
    String customerName;
    double price;

    ShoppingOrder(String customerName, double price){
        this.customerName = customerName;
        this.price = price;

    }

    double calculateFinalPrice(){

        return price;
    }
}

class PremiumOrder extends ShoppingOrder{

    PremiumOrder(String customerName, double price){
        super(customerName, price);
    }

    @Override
    double calculateFinalPrice(){
        return price - (price*10) / 100;
    }

    void displayOrder(){
        System.out.println("Customer name: "+ customerName);
        System.out.println("Final price: "+  calculateFinalPrice());
    }
}

public class Task5 {
    public static void main(String [] args){
        PremiumOrder pre = new PremiumOrder("Harsh", 2000);
        pre.displayOrder();


    }
}
