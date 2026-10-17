package com.OopsPractice.RevisionTillInheritance;

class BankAccountQ7{
    String accountHolder;
    double balance;

    BankAccountQ7(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void displayDetails(){
        System.out.println("Name: "+ accountHolder);
        System.out.println("Balance: "+ balance);
    }
}

class SavingAccountQ7 extends BankAccountQ7{
    double interestRate;
    SavingAccountQ7(String accountHolder, double balance, double interestRate){
        super(accountHolder, balance);
        this.interestRate = interestRate;
    }

    @Override
    void displayDetails(){
        System.out.println("Name: "+ accountHolder);
        System.out.println("Balance: "+ balance);
        System.out.println("Interest Rate: "+ interestRate);
        System.out.println("Calculated Interest: "+ calculateInterest());
    }

    double calculateInterest(){
        return  (balance * interestRate/100);
    }
}

public class Task7 {
    public static void main(String [] args){
              SavingAccountQ7 sv = new SavingAccountQ7("Harsh", 20000, 5.0);
              sv.displayDetails();
    }
}
