package com.OopsPractice.Methods;

import java.util.Scanner;

class BankAccount{
    Scanner sc = new Scanner(System.in);
    String accountHolder;
    double balance;
    
    void displayBalance(){

        System.out.println("The Account Holder Name is = "+ accountHolder);
        System.out.println("Total Balance = "+ balance);
    }

    void deposit(){
        System.out.println("Enter AccountHolder Name = ");
        accountHolder = sc.nextLine();

        System.out.println("Enter initial Balance: ");
         balance = sc.nextInt();

        System.out.println("Enter the Amount to Deposit: ");
        int deposite = sc.nextInt();

        balance += deposite;


    }

}

public class Practice6 {
    public static void main(String[] args) {
        BankAccount BA = new BankAccount();
        BA.deposit();
        BA.displayBalance();


    }
}
