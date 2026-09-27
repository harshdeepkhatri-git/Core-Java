package com.OOPs.Encapsulation;

class BankAccount{
    private long accountNumber;
    private String name;
    private double balance;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Invalid amount");
        }
        else {
            this.balance = balance;
        }
    }

    void  deposit(double amount) {
        if (amount > 0) {
            System.out.println("Desposit is initiated");
            this.balance += amount;
            System.out.println("Deposited Successfull)!!");
            System.out.println("Balance is: " + this.balance);
        }
        else {
            System.out.println("Invalid amount");
        }
    }

    void  withdraw(double amount) {
        if (amount <= this.balance) {
            System.out.println("Withdraw is initiated");
            this.balance -= amount;
            System.out.println("Withdraw Successfull)!!");
            System.out.println("Balance is: " + this.balance);
        }
    }

    void displayData() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}

public class BankManagement {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        // Setting the data

        bankAccount.setAccountNumber(564538238l);
        bankAccount.setName("Sekhar");
        bankAccount.setBalance(500000.0);

        bankAccount.displayData();
        System.out.println("====".repeat(5));

        bankAccount.deposit(10000);
        System.out.println("======".repeat(5));

        bankAccount.withdraw(10000);
        System.out.println("======".repeat(5));

        bankAccount.displayData();

    }
}



//output

//                Account Number: 564538238
//                Name: Sekhar
//                Balance: 500000.0
//                        ====================
//                Desposit is initiated
//                Deposited Successfull)!!
//                Balance is: 510000.0
//                        ==============================
//                Withdraw is initiated
//                Withdraw Successfull)!!
//                Balance is: 500000.0
//                        ==============================
//                Account Number: 564538238
//                Name: Sekhar
//                Balance: 500000.0