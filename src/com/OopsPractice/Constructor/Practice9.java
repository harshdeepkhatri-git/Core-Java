package com.OopsPractice.Constructor;


class Product1{
    String name;
    double price;
    int quantity;

    Product1(){
       this(null);

    }

    Product1(String name){
       this(name,0.0);
    }

    Product1(String name,double price){
        this(name,price,0);
        System.out.println("third constructor");
    }

    Product1(String name, double price, int quantity ) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }

    void printDetails(){
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("===".repeat(5));
    }
}

public class Practice9 {
     static void main(String[] ignoredArgs){
        Product1 product = new Product1();
        System.out.println("Product 1: ");
        product.printDetails();

        Product1 pro = new Product1("Laptop" );
        System.out.println("Product 2: ");
        pro.printDetails();

        Product1 prod = new Product1("Ipad",1500.0 );
        System.out.println("Product 3: ");
        prod.printDetails();



        Product1 pr = new Product1("Phone", 20000, 2);
        System.out.println("Product 4: ");
        pr.printDetails();


    }
}
