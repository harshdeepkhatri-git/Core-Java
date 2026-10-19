package com.OopsPractice.Abstraction;

abstract class Payment{
    abstract void pay(double amount);

    void paymentMessage(){
        System.out.println("Processing payment...");
    }
}

class UPIPayment extends Payment{
    @Override
    void pay(double amount){
        System.out.println("Paid " + amount + " using UPI");
    }
}

class CardPayment extends Payment{
    @Override
    void pay(double amount){
        System.out.println("Paid " + amount + " using Card");
    }
}

public class Task5 {
    public static void main(String [] args){
        UPIPayment upi = new UPIPayment();
        CardPayment card = new CardPayment();
        upi.paymentMessage();
        upi.pay(1500);

        System.out.println("====".repeat(8));

        card.paymentMessage();
        card.pay(2500);
    }
}
