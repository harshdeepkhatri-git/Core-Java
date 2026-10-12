// >> Employee Salary System

package com.OopsPractice.RevisionTillInheritance;

class EmployeeQ6{
    String name;
    double salary;

    EmployeeQ6(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Salary: "+ salary);
    }
}

class ManagerQ6 extends EmployeeQ6{
    double bonus;

    ManagerQ6(String name, double salary, double bonus){
        super(name, salary);
        this.bonus = bonus;
    }
    double calculateTotalSalary(){
        return salary + bonus;
    }
    @Override
    void displayDetails(){
      System.out.println("Name: "+ name);
      System.out.println("Salary: "+ salary);
      System.out.println("Bonus: "+ bonus);
      System.out.println("Total Salary: "+ calculateTotalSalary());
    }
}


public class Task6 {
      public static void main(String[] args){
          ManagerQ6 manager = new ManagerQ6("Harsh", 50000, 10000);
          manager.displayDetails();
      }
}
