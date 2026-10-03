package com.OopsPractice.Obj;

class Employee{
    String name;
    int id;
    double salary;
}

public class Object {
     public static void main(String[] args) {
       Employee emp = new Employee();
         emp.id = 101;
         emp.salary = 25000L;
         emp.name = "Harsh";

         Employee emp1 = new Employee();
         emp1.name= "Rahul";
         emp1.salary = 30000;
         emp1.id = 102;


         System.out.println("Employee 1 details");

         System.out.println("Employee name = "+ emp.name);
         System.out.println("Employee Salary = "+ emp.salary);
         System.out.println("Employee Id = "+ emp.id);

         System.out.println("=====".repeat(5));

         System.out.println("Employee 2 Details");
         System.out.println("Employee Id = " + emp1.id);
         System.out.println("Employee name = "+ emp1.name);
         System.out.println("Employee salary = " + emp1.salary);
    }
}
