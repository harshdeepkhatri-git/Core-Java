package com.OopsPractice.Constructor;


class BankAccount1{
    String holderName;
    long accountNumber;
    double balance;

    static String bankName = "SBI";

    BankAccount1(){
        this("Unknown");
    }

    BankAccount1(String holderName) {
        this(holderName, 0l);
    }

    BankAccount1(String holderName, long accountNumber){
        this(holderName, accountNumber, 0.0);
    }

    BankAccount1(String holderName, long accountNumber, double balance){
        this.holderName = holderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void printDetails(){
        System.out.println("Name: " + holderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Bank Name: "+ bankName);
    }

}



public class Practice11 {
    public static void main(String[] args){
        BankAccount1 ba = new BankAccount1();
        ba.printDetails();
        System.out.println("===".repeat(7));

        BankAccount1 ba1 = new BankAccount1("Harsh");
        ba1.printDetails();
        System.out.println("===".repeat(7));

        BankAccount1 ba2 = new BankAccount1("Rahul", 1234567898L, 50000);
        ba2.printDetails();
        System.out.println("===".repeat(7));




    }
}
