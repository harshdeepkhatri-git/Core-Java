package com.OOPs.DataHiding;

class Account{
    long accountnumber = 7463758639346l;
    String accountname = "Harsh";
    double balance = 600000;

    void getdata(){
        System.out.println("Account ID = " + this.accountnumber);
        System.out.println("Account holder name = " + this.accountname);
        System.out.println("Account balance = " + this.balance);
    }

}

public class ThisKeyWord {
    public static void main(String[] args) {
           Account acc = new Account();
           acc.getdata();

           acc.balance= -9808;
           acc.getdata();

           // baance is the data member of a class which is trying to modify from outside the  class
        // that modification can reflect in that class , here the issue is "security".
        // to protect the data of the class we can use data hiding.

        // her use private before data type for protecting the data (private double balance = 600000);
    }
}
