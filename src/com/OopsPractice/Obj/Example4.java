package com.OopsPractice.Obj;

class car{
    String brand;
    String model;
    double price;
}

public class Example4 {
    public static void main(String[]args){
        car c = new car();
         c.brand = "Toyota";
         c.model = "Fortuner";
         c.price = 3500000;


         car c1 = new car();
         c1.brand="Hyundai";
         c1.model = "Creta";
         c1.price = 1800000;

         car c2 = new car();
         c2.brand = "tata";
         c2.model = "Nexon";
         c2.price = 1200000;


         // Average price
        System.out.println("Car 1 Details");
        System.out.println(c.brand);
        System.out.println(c.model);
        System.out.println(c.price);

        System.out.println("====".repeat(5));

        System.out.println("Car 2 Details");
        System.out.println(c1.brand);
        System.out.println(c1.model);
        System.out.println(c1.price);

        System.out.println("====".repeat(5));

        System.out.println("Car 3 Details");
        System.out.println(c2.brand);
        System.out.println(c2.model);
        System.out.println(c2.price);

        System.out.println("====".repeat(5));

        double Average = (c.price + c1.price + c2.price) / 3;

        System.out.printf("Average = %.20f", Average);
    }
}
