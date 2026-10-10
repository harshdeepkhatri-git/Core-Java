package com.OopsPractice.Inheritance;


class Employee{
    String name;
    double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    void  displayEmployee(){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
}

class Manager extends Employee{
    String department;

    Manager(String name, double salary, String department){
        super(name, salary);
        this.department = department;
    }

    void displayManager(){
        System.out.println("Department: "+department);
    }
}

public class Practice4 {
    public static void main(String[] args){
        Manager emp = new Manager("Harsh", 50000.0, "IT");
        emp.displayEmployee();
        emp.displayManager();

    }
}
