package com.OopsPractice.Constructor;

//Q2 → Default/no-argument constructor ✅

class Employee{
    String name;
    int age;
    double salary;

    Employee(){
        this.name = "Harsh";
        this.age= 21;
        this.salary = 30000;
    }
}
public class Practice2 {
    public static void main(String[] args){

        Employee emp = new Employee();

        System.out.println("Name : "+ emp.name);
        System.out.println("Age: "+ emp.age);
        System.out.println("Salary: "+ emp.salary);

    }
}
