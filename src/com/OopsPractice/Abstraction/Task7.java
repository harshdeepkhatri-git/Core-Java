package com.OopsPractice.Abstraction;

abstract class Employe{
    String name;
    double basicSalary;

    Employe (String name, double basicSalary){
        this.name = name;
        this.basicSalary = basicSalary;
    }

    abstract double calculateBonus();

    void displayDetails(){
        System.out.println("Employee Name: "+ name);
        System.out.println("Basic Salary: "+ basicSalary);
    }
}

class Manager extends Employe{
    Manager(String name, double basicSalary){
        super(name,basicSalary);
    }

    @Override
    double calculateBonus() {
        return   (basicSalary * 20) /100;


    }

    @Override
    void displayDetails(){
        System.out.println("Name: "+ name);
        System.out.println("Basic Salary: "+ basicSalary);
        System.out.println("Bonus: "+ calculateBonus());
        System.out.println("Final Salary: "+ (basicSalary + calculateBonus()));
    }
}

class Developeer extends Employe{
    Developeer(String name, double basocSalary){
        super(name,basocSalary);
    }
    @Override
    double calculateBonus() {

        return   (basicSalary * 10) /100;
    }
    @Override
    void displayDetails(){
        System.out.println("Name: "+ name);
        System.out.println("Basic Salary: "+ basicSalary);
        System.out.println("Bonus: "+ calculateBonus());
        System.out.println("Final Salary: "+ (basicSalary + calculateBonus()));
    }
}

public class Task7 {
    public static void main(String [] args){
        Employe emp = new Manager("Rahul", 50000);
        emp.displayDetails();

        System.out.println("====".repeat(5));

        Employe emp1 = new Developeer("Amit", 40000);
        emp1.displayDetails();

    }
}
