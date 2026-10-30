package com.OopsPractice.Interface;

interface TransactionProcessor{
    void processTransaction(double amount);
    double getTransactionFee();
}

class UPITransaction implements TransactionProcessor{
    double amount;
    UPITransaction(double amount){
        this.amount = amount;
    }
    @Override
    public void processTransaction(double amount) {
        System.out.println("UPI Transaction : "+ amount);
    }

    @Override
    public double getTransactionFee() {
        if (this.amount >= 5000){
            return 0;
        }
        else{
            return ((amount *1)/100);
        }
    }
}

class CardTransaction implements TransactionProcessor{
    double amount;

    CardTransaction(double amount){
        this.amount = amount;
    }

    @Override
    public void processTransaction(double amount) {
        System.out.println("Card Transaction : "+ amount);
    }

    @Override
    public double getTransactionFee() {
        return ((amount *2)/100);
    }
}

public class Practice10 {
    public static void main(String [] args){
        TransactionProcessor transaction;
        transaction = new UPITransaction(4000);
        transaction.processTransaction(4000);
        System.out.println("Transaction Fee: " + transaction.getTransactionFee());
        System.out.println();

        transaction = new CardTransaction(8000);
        transaction.processTransaction(8000);
        System.out.println("Transaction Fee: " + transaction.getTransactionFee());
        System.out.println();

        transaction = new CardTransaction(8000);
        transaction.processTransaction(8000);
        System.out.println("Transaction Fee: " + transaction.getTransactionFee());
    }
}
