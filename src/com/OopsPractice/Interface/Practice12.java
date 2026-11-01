package com.OopsPractice.Interface;

interface DeliveryService{

    void deliverProduct();
    double calculateDeliveryCharge(double orderAmount);

    default void deliveryPolicy(){
        System.out.println("Delivery available across India");
    }

     static void companyInfo(){
         System.out.println("Welcome to QuickDelivery Services");
     }
}

class StandardDelivery implements DeliveryService{
    @Override
    public void deliverProduct() {
        System.out.println("Product delivered through Standard Delivery");
    }
    @Override
    public double calculateDeliveryCharge(double orderAmount) {
        return orderAmount * 5 / 100;
    }
}

class ExpressDelivery implements DeliveryService{
    @Override
    public void deliverProduct() {
        System.out.println("Product delivered through ExpressDelivery");
    }
    @Override
    public double calculateDeliveryCharge(double orderAmount) {
        return orderAmount * 10 / 100;
    }

}



public class Practice12 {
    public static void main(String [] args){
        DeliveryService.companyInfo();
        System.out.println();

        DeliveryService ds;
        ds = new StandardDelivery();
        ds.deliverProduct();
        ds.deliveryPolicy();
        System.out.println("Standard Delivery Charge: " + ds.calculateDeliveryCharge(2000));
        System.out.println("=======". repeat(8));

        ds = new ExpressDelivery();
        ds.deliverProduct();
        ds.deliveryPolicy();

    }
}
