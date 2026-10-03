package com.OopsPractice.Obj;

class BankAccount{
    String accountHolder;
    long accountNumber;
    double balance;
}

public class Class {
    public static void main(String[] args){
        BankAccount acc = new BankAccount();

        acc.accountHolder= "Harsh";
        acc.accountNumber = 123456789L;
        acc.balance = 15000;

        BankAccount acc1 = new BankAccount();
          acc1.accountHolder = "Rahul";
          acc1.accountNumber = 987654321L;
          acc1.balance = 25000;

          System.out.println("Account 1 Details:");
          System.out.println(acc.accountHolder);
          System.out.println(acc.accountNumber);
          System.out.println(acc.balance);

          System.out.println("====".repeat(5));

          System.out.println("Account 2 details; ");
          System.out.println(acc1.accountHolder);
          System.out.println(acc1.accountNumber);
          System.out.println(acc1.balance);

          double totalbalance = acc.balance + acc1.balance;

          System.out.println("Total balance : "+ totalbalance);


    }
}
