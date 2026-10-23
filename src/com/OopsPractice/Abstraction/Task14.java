package com.OopsPractice.Abstraction;


abstract class Employees{
    String name;
    double basicSalary;

    Employees(String name, double basicSalary){
        this.name = name;
        this.basicSalary = basicSalary;
    }

    abstract double calculateBonus();

    abstract void displayRole();

    abstract void salary();


    void displayDetails(){
        System.out.println("Name: "+ name);
        System.out.println("Basic Salary: "+ basicSalary);
    }
}

class Managers extends Employees{
    Managers(String name, double basicSalary){
        super(name, basicSalary);
    }

    @Override
    double calculateBonus(){
        return basicSalary * 20 /100;
    }

    @Override
    void displayRole(){
        System.out.println("Role: Manager ");

    }

    @Override
    void salary(){
        System.out.println("Bonus : "+ calculateBonus());
        System.out.println("Total Salary: "+ (basicSalary + calculateBonus()));
    }
}

class Developers extends Employees{
    Developers(String name, double basicSalary){
        super(name, basicSalary);
    }

    @Override
    double calculateBonus(){
        return basicSalary * 10 /100;
    }

    @Override
    void displayRole(){
        System.out.println("Role: Developer");

    }
    @Override
    void salary(){
        System.out.println("Bonus : "+ calculateBonus());
        System.out.println("Total Salary: "+ (basicSalary + calculateBonus()));
    }
}

public class Task14 {
    public static void main(String [] args){
         Employees emp = new Managers("Harsh", 50000);
         emp.displayDetails();
         emp.displayRole();
         emp.salary();

        System.out.println("====".repeat(5));

        emp = new Developers("Amit", 40000);
        emp.displayDetails();
        emp.displayRole();
        emp.salary();



    }
}
