package com.OopsPractice.Constructor;

class Employe{
    String name;
    int id;
    double salary;

    Employe(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void printDetails(){
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Salary: " + salary);


    }

     static double average(double salary1, double salary2, double salary3){
        return (salary1 + salary2 + salary3) / 3;
    }


}

public class Practice5 {
    public static void main(String[] args){

        Employe emp = new Employe("Harsh", 101, 30000);
        System.out.println("Employee 1: ");
         emp.printDetails();
         System.out.println("====".repeat(5));
         System.out.println();



        Employe emp1 = new Employe("Rahul", 102, 35000);
        System.out.println("Employee 2: ");
        emp1.printDetails();
        System.out.println("====".repeat(5));
        System.out.println();

        Employe emp2 = new Employe("Amit", 103, 40000);
        System.out.println("Employee 3: ");
        emp2.printDetails();

        System.out.println("====".repeat(5));

        double average =  Employe.average(emp.salary, emp1.salary, emp2.salary);

      System.out.println("Average salary: " + average);
    }
}
