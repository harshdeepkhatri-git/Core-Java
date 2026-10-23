package com.OopsPractice.Abstraction;

abstract class FoodOrder{
    String itemName;
    double price;

    FoodOrder(String itemName, double price){
        this.itemName = itemName;
        this.price = price;
    }

    abstract double calculateFinalPrice();

    abstract void prepareOrder();

    void displayOrder(){
        System.out.println("Item Name: "+ itemName);
        System.out.println("Price: "+ price);
    }
}

class DineInOrder extends FoodOrder{
    DineInOrder(String itemName, double price){
        super(itemName, price);
    }

    @Override
    double calculateFinalPrice(){
        return price + (price * 5)/100;
    }

    @Override
    void prepareOrder(){
        System.out.println("Preparing dine-in order !!");

    }
}

class TakeawayOrder extends FoodOrder{
    TakeawayOrder(String itemName, double price){
        super(itemName, price);
    }

    @Override
    double calculateFinalPrice(){
        return price + 30;
    }

    @Override
       void prepareOrder(){
        System.out.println("Preparing takeaway order !!");
    }
}



public class Task12 {
    public static void main (String [] args){
         FoodOrder food = new DineInOrder("Pizza", 500);
         food.displayOrder();
         food.prepareOrder();
        System.out.println("Final Price : "+ food.calculateFinalPrice());

        System.out.println("====".repeat(5));

        food = new TakeawayOrder("Burger", 200);
        food.displayOrder();
        food.prepareOrder();
        System.out.println("Final Price : "+ food.calculateFinalPrice());
    }
}
