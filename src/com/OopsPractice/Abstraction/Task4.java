package com.OopsPractice.Abstraction;

abstract class Employee{
    abstract double calculateSalary();

    abstract void displayRole();
}

class Developer extends Employee{
    @Override
    double calculateSalary() {
        return 50000;
    }

    @Override
    void displayRole(){
        System.out.println("Role: Java Developer");
    }
}



public class Task4 {
    public static void main(String [] args){
        Employee e = new Developer();
       System.out.println("Salary: "+ e.calculateSalary());
       e.displayRole();

    }
}
