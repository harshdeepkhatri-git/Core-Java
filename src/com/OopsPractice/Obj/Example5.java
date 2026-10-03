package com.OopsPractice.Obj;

class Mobile{
    String brand;
    String model;
    double price;
    int storage;
}

public class Example5 {
    public static void main(String [] args){
        Mobile m1 = new Mobile();
        m1.brand = "Samsung";
        m1.model = "S24";
        m1.price = 70000;
        m1.storage = 256;

        Mobile m2 = new Mobile();
        m2.brand = "Apple";
        m2.model = "iphone 15 ";
        m2.price = 65000;
        m2.storage = 128;

        Mobile m3 = new Mobile();
        m3.brand="OnePlus";
        m3.model="13";
        m3.price = 60000;
        m3.storage = 256;

        System.out.println("Mobile 1 Details");
        System.out.println(m1.brand);
        System.out.println(m1.model);
        System.out.println(m1.price);
        System.out.println(m1.storage);

        System.out.println("====".repeat(5));
        System.out.println(m2.brand);
        System.out.println(m2.model);
        System.out.println(m2.price);
        System.out.println(m2.storage);
        System.out.println("====".repeat(5));
        System.out.println(m3.brand);
        System.out.println(m3.model);
        System.out.println(m3.price);
        System.out.println(m3.storage);


        double AveragePrice = (m1.price + m2.price + m3.price)/3;
        System.out.printf("Average = %.2f%n", AveragePrice);

        int TotalStorage = m1.storage + m2.storage + m3.storage;
        System.out.printf("Total = " +  TotalStorage + "GB");

    }
}
