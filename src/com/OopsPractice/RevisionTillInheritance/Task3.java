package com.OopsPractice.RevisionTillInheritance;

class Emoployee{
    String name;
    double salary;

    Emoployee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    double calculateSalary(){
        return salary;
    }

}

class Manager extends Emoployee{

    Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateSalary(){

        return salary + 10000;
    }

    void displayDetails(){
        System.out.println("Manager name: "+ name);

    }
}

public class Task3 {
    public static void main(String[] args){
      Manager m = new Manager("Rahul", 50000);
       m.displayDetails();
     System.out.println("Calculated Salary: " + m.calculateSalary());

    }
}
