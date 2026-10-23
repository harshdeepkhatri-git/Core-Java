package com.OopsPractice.Abstraction;

abstract class Payments {
    String transactionId;
    double amount;

    Payments(String transactionId, double amount){
        this.transactionId = transactionId;
        this.amount = amount;
    }

    abstract void processPayment();
    abstract double calculateFee();

    void displayTransaction(){
        System.out.println("Transaction Id: " + transactionId);
        System.out.println("Amount: "+ amount);
    }
}

class UPIPayments extends Payments{
    UPIPayments(String transactionId, double amount){
        super(transactionId, amount);
    }

    @Override
    void processPayment(){
        System.out.println("UPI Payment is Successful !!");
    }

    @Override
    double calculateFee(){
        return amount * 1 /100;
    }

}

class CardPayments extends Payments{
    CardPayments(String transactionId, double amount){
        super(transactionId, amount);
    }

    @Override
    void processPayment(){
        System.out.println("Card Payment is Successful !!");
    }

    @Override
    double calculateFee(){
        return amount * 2 /100;
    }
}




public class Task15 {
    public static void main(String [] args){
        Payments pay = new UPIPayments("TXN101",1000);
        pay.displayTransaction();
        pay.processPayment();
        System.out.println("Payment Fee: " + pay.calculateFee());
        System.out.println("Total Amount : "+ (pay.amount + pay.calculateFee()));

        System.out.println("====".repeat(5));

        pay = new CardPayments("TXN102",2000);
        pay.displayTransaction();
        pay.processPayment();
        System.out.println("Payment Fee: "+ pay.calculateFee());
        System.out.println("Total Amount: "+ (pay.amount + pay.calculateFee()));
    }
}
