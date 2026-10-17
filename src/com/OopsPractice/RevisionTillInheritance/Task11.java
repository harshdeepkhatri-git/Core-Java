
package com.OopsPractice.RevisionTillInheritance;

interface PaymentQ10 {
    void processPayment(double amount);
}

class CreditCardQ10 implements PaymentQ10 {

    @Override
    public void processPayment(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid payment amount.");
            return;
        }

        System.out.println("Processing Credit Card payment: ₹" + amount);
        System.out.println("Credit Card payment successful.");
    }
}

class UPIQ10 implements PaymentQ10 {

    @Override
    public void processPayment(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid payment amount.");
            return;
        }

        System.out.println("Processing UPI payment: ₹" + amount);
        System.out.println("UPI payment successful.");
    }
}

class PayPalQ10 implements PaymentQ10 {

    @Override
    public void processPayment(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid payment amount.");
            return;
        }

        System.out.println("Processing PayPal payment: ₹" + amount);
        System.out.println("PayPal payment successful.");
    }
}

class PaymentProcessorQ10 {

    void pay(PaymentQ10 payment, double amount) {
        payment.processPayment(amount);
        System.out.println();
    }
}

public class Task11 {

    public static void main(String[] args) {

        PaymentProcessorQ10 processor = new PaymentProcessorQ10();

        PaymentQ10 creditCard = new CreditCardQ10();
        PaymentQ10 upi = new UPIQ10();
        PaymentQ10 paypal = new PayPalQ10();

        processor.pay(creditCard, 1500);
        processor.pay(upi, 750);
        processor.pay(paypal, 2000);

        // Test invalid payment
        processor.pay(upi, -500);
    }
}
