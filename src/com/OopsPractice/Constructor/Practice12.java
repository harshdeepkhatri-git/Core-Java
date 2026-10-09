package com.OopsPractice.Constructor;


class Person{
    String name;
    int age;

    Person(){
        this("Unknown", 0);
    }

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    void displayPerson(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Emplo extends Person{
    int employeeID;
    double salary;

    Emplo(){
        this("Unknown", 0, 0, 0.0);
    }

    Emplo(String name, int age, int employeeID, double salary){
        super(name, age);

        this.employeeID = employeeID;
        this.salary = salary;
    }

    void displayEmplo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("EmployeeID: " + employeeID);
        System.out.println("Salary: " + salary);
    }

}

public class Practice12 {
    public static void main(String [] args){
        Emplo e1 = new Emplo();
        e1.displayEmplo();
        System.out.println("===".repeat(7));

        Emplo e2 = new Emplo("Harsh", 21, 101, 35000.0);
        e2.displayEmplo();

    }
}
