package com.OopsPractice.Methods;


import java.util.Scanner;

class Employee{
    Scanner sc = new Scanner(System.in);
    String name;
    double salary;

    void setDetails(){
        System.out.println("Enter the name of Employee: ");
        name = sc.nextLine();

        System.out.println("Enter the Salary: ");
        salary = sc.nextDouble();
    }

    void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
}

public class practice5 {
    public static void main(String[]args){
        Employee e1 = new Employee();
        e1.setDetails();
        e1.displayDetails();


    }
}
