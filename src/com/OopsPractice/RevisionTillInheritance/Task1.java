package com.OopsPractice.RevisionTillInheritance;

import java.util.Scanner;

class Employee{
    String name;
    double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }


    void displayDetails(){
        System.out.println("Name: "+ name);
        System.out.println("Salary: "+ salary);

        }

        double calculateBonus(){
            return   10 * salary /100;


        }

}


public class Task1 {
    public static void main(String [] args){
//        Employee e = new Employee("Rahul", 50000.0);
//        e.displayDetails();
//      System.out.println ("Bonus : "+ e.calculateBonus(50000) );

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your salary: ");
        double salary = sc.nextDouble();

        Employee e = new Employee(name, salary);
        e.displayDetails();
       System.out.println("Bonus: "+ e.calculateBonus()) ;


    }

}
