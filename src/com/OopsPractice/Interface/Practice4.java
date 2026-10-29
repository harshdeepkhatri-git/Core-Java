package com.OopsPractice.Interface;

//Question 4 — Online Payment System

interface PaymentMethod{
    void pay(double amount);
}

class UPIPayment implements PaymentMethod{
    @Override
    public void pay(double amount){
        System.out.println("Payment of " + amount + " completed using UPI");
    }
}

class CardPayment implements PaymentMethod{
    @Override
    public void pay(double amount){
        System.out.println("Payment of " + amount + " completed using Card");
    }
}


public class Practice4 {
    public static void main (String [] args){
             PaymentMethod pay ;

             pay = new UPIPayment();
             pay.pay(500);

             pay= new CardPayment();
             pay.pay(1000);
    }
}
