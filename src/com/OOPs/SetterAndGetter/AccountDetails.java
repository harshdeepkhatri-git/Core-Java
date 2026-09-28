package com.OOPs.SetterAndGetter;

class account{
    private long accountnumber;
    private String name;
    private double salary;

    // to get getter and setter syntax shortcut = (alt + insert)

    public long getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(long accountnumber) {
        this.accountnumber = accountnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class AccountDetails {
    public static void main(String[]args){
        account acc = new account();

        acc.setAccountnumber(1234434l);
        acc.setSalary(5000000);
        acc.setName("Harsh");

        System.out.println ("Name = "+ acc.getName());
        System.out.println("Salary = " + acc.getSalary());
        System.out.println("Account number = " + acc.getAccountnumber());

    }
}
