package com.OopsPractice.Constructor;
//Parameterized Constructor with User Input


import java.util.Scanner;

class BankAccount{
    String accountHolder;
    long accountNumber;
    double balance;

    BankAccount(String accountHolder, long accountNumber, double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;

    }
}

public class Practice3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account holder: ");
        String name = sc.nextLine();

        System.out.println("Enter account number: ");
        long number = sc.nextLong();

        System.out.println("Enter the balance: ");
        double balance = sc.nextDouble();

        BankAccount acc = new BankAccount(name , number, balance);

        System.out.println("Account Holder name : "+ acc.accountHolder);
        System.out.println("Account number: "+ acc.accountNumber);
        System.out.println("Account balance: "+ acc.balance);

    }
}
