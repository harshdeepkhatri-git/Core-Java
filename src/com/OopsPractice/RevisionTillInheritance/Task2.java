package com.OopsPractice.RevisionTillInheritance;

class BankAccount{
    String accountHolder;
    private double balance;

    BankAccount(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    void displayBalance(){
        System.out.println("Account Holder name: "+ accountHolder);
        System.out.println("Current balance: "+ getBalance());
    }
}

class SavingsAccount  extends BankAccount{

    SavingsAccount(String accountHolder, double balance){
        super(accountHolder, balance);


    }

    double addInterest(){
        return 5 * getBalance() / 100;
    }

}

public class Task2 {
    public static void main(String [] args){
        SavingsAccount sa = new SavingsAccount("Rahul", 10000);

        sa.displayBalance();
      System.out.println("Interest: "+ sa.addInterest() )  ;
    }
}
