package com.OopsPractice.Constructor;


class Bank{
    String accountHolder;
    double balance;

    Bank(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount){
        System.out.println("Deposited: "+ amount);
        this.balance = this.balance+amount;

    }

    void withdraw(double amount){
        if(amount<= this.balance){
            System.out.println("Withdrawn: "+ amount );
            this.balance -= amount;
        }

    }

    void displaybalance(){
        System.out.println("Current balance: "+ this.balance);
    }

}

public class Practice6{
    public static void main(String[] args){
        Bank bank = new Bank("Harsh", 50000);
        System.out.println("Account Holder: "+ bank.accountHolder);
        System.out.println("Initial Balance: "+ bank.balance);

        bank.deposit(50000);
        bank.withdraw(25000);
        bank.displaybalance();

    }
}
