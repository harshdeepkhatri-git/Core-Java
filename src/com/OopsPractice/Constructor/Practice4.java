package com.OopsPractice.Constructor;

//Constructor with Multiple Instance Variables

class Product{

    String name;
    int productId;
    double price;
    int quantity;
    String category;

    Product(String name, int productId, double price, int quantity, String category){
        this.name = name;
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    double calculateTotal(){

        return price * quantity;
    }
}


public class Practice4 {
    public static void main(String[] args){

        Product pd = new Product("Laptop", 101, 50000, 2, "Electronics");

          double total = pd.calculateTotal();

          System.out.println("Product name : "+ pd.name);
          System.out.println("Product Id : "+ pd.productId);
          System.out.println("Product price: "+ pd.price);
          System.out.println("Product quantity: "+ pd.quantity);
          System.out.println("Product category: "+ pd.category);
          System.out.println("Total price : "+ total);
    }
}
