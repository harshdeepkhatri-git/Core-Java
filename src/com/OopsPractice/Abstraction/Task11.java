package com.OopsPractice.Abstraction;



abstract class BankAccount{
    String accountHolder;
    double balance;

    BankAccount(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    abstract void deposit(double amount);

    abstract void withdraw(double amount);

    abstract double calculateInterest();

    void displayBalance(){
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Initial Balance: " + balance);
    }
}

class SavingAccount extends BankAccount{
    SavingAccount(String accountHolder, double balance){
        super(accountHolder, balance);
    }

    @Override
    void deposit(double amount){
        if(amount > 0 ){
            balance = balance + amount;
//            System.out.println("Money Deposited Successfully");
            System.out.println("Deposited: " + amount);
            System.out.println("Current Balance: " + balance);
        }
        else{
            System.out.println("Invalid Amount !! Please Enter Correct Amount");
        }
    }

    @Override
    void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance = balance - amount;
//            System.out.println("Money Withdraw Successfully");
            System.out.println("Withdrawn : "+ amount);
            System.out.println("Current balance: " + balance);
        }
        else {
            System.out.println("Insufficiant balance !! Please Enter Correct Amount");
        }
    }

    @Override
    double calculateInterest(){
        return (balance * 5)/100;
    }

    @Override
    void displayBalance() {
       super.displayBalance();

    }
}

class CurrentAccount extends BankAccount{
    CurrentAccount(String accountHolder, double balance){
        super(accountHolder, balance);
    }

    @Override
    void deposit(double amount){
        if(amount > 0){
            balance = balance + amount;
//            System.out.println("Money Deposited Successfully");
            System.out.println("Deposited: "+ amount);
            System.out.println("Current Balance: " + balance);
        }
        else{
            System.out.println("Invalid Amount !! Please Enter Correct Amount");
        }
    }

    @Override
    void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance = balance - amount;
//            System.out.println("Money withdrawn Successfully");
            System.out.println("Withdrawn: "+ amount);
            System.out.println("Current balance: " + balance);

        }
        else {
            System.out.println("Insufficiant balance !! Please Enter Correct Amount");
        }
    }

    @Override
    double calculateInterest(){
        return 0;
    }

    @Override
    void displayBalance() {
        super.displayBalance();

    }
}


public class Task11 {
    public static void main(String [] args){
        BankAccount account = new SavingAccount("Harsh", 10000);
        account.displayBalance();
        account.deposit(2000);
        account.withdraw(1000);
//        account.displayBalance();
        System.out.println("Interest: "+ account.calculateInterest());

        System.out.println("===".repeat(5));

        account = new  CurrentAccount("Amit", 20000);
        account.displayBalance();
        account.deposit(2000);
        account.withdraw(1000);
        System.out.println("Interest: "+ account.calculateInterest());


//        account.calculateInterest();

    }
}
