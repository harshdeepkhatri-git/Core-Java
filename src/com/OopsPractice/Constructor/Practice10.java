package com.OopsPractice.Constructor;

class Employeee{
    String name;
    int id;
    double salary;
    String department;

    Employeee(){
        this("Unknown");
    }
    Employeee(String name){
        this(name, 0);
    }

    Employeee(String name, int id){
        this(name, id , 0.0, "Not Assigned");
    }

    Employeee(String name, int id, double salary, String department){
         this.name = name;
         this.id = id;
         this.salary = salary;
         this.department = department;
    }

    void printDetails(){
        System.out.println("Name: "+ name);
        System.out.println("Id: "+ id);
        System.out.println("Salary: "+ salary);
        System.out.println("Department: "+ department);
    }
}

public class Practice10 {
    public static void main(String [] args){
        Employeee e1 = new Employeee();
        Employeee e2 = new Employeee("Harsh");
        Employeee e3 = new Employeee("Rahul", 101);
        Employeee e4 = new Employeee("Amit", 102, 45000, "IT");



        e1.printDetails();
        System.out.println("===".repeat(7));

        e2.printDetails();
        System.out.println("===".repeat(7));

        e3.printDetails();
        System.out.println("===".repeat(7));

        e4.printDetails();
        System.out.println("===".repeat(7));

    }
}
