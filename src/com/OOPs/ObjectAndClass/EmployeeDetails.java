package com.OOPs.ObjectAndClass;

class BankAccount{
    long AccountNumber;
    double balance;

    void deposit(double amount){
        if (amount > 0)
        balance = balance + amount;
        else
            System.out.println(" Deposit failed. Invalid Amount!!");
    }

    void withdraw(double amount){
        if(amount>0 && amount <= balance)
            balance = balance - amount;
            else
                System.out.println(" Withdrwa failed. Invalid Amount!!");

    }
    double getBalance(){
        return balance;
    }
}

public class EmployeeDetails {
    public static void main(String[] args){
        BankAccount account = new BankAccount();
        account.AccountNumber = 3008001234L;
        account.balance = 1000.0;

        account.deposit(5999);
        account.withdraw( 2899);

        System.out.println("Account Balance: " + account.getBalance());
        System.out.println("Account Number: " + account.AccountNumber);



    }
}
