package com.OopsPractice.RevisionTillInheritance;

class Employees{
    String name;
    double basicSalary;

    Employees(String name, double basicSalary){
        this.name = name;
        this.basicSalary = basicSalary;
    }

    double calculateSalary(){
        return basicSalary;
    }

    void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

class Managers extends Employees{
    int bonus;

    Managers(String name, double basicSalary, int bonus){
        super(name, basicSalary);
        this.bonus = bonus;
    }

    @Override
    double calculateSalary(){
        return bonus + basicSalary;
    }

    double calculateSalary(double extraBonus){
        return basicSalary + bonus + extraBonus;
    }

    @Override
    void displayDetails(){

        super.displayDetails();
        double salaryWithBonus = calculateSalary();
        double extraBonus = 2000;
        double salaryWithExtraBonus = calculateSalary(extraBonus);
        System.out.println("Bonus: " + bonus);
        System.out.println("Salary With Bonus: " + salaryWithBonus);
        System.out.println("Salary With Extra Bonus: " + salaryWithExtraBonus);

    }
}

public class Task15 {
    public static void main(String [] args){
        Managers ma = new Managers("Harsh", 40000, 8000);
        ma.displayDetails();

    }
}
