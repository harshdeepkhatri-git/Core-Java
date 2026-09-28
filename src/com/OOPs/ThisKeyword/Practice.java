package com.OOPs.ThisKeyword;


class Employee{
    int eid;
    String name;
    double salary;

    void setdata(int eid, String name , double salary){
        this.eid = eid;
        this.name = name;
        this.salary = salary;
    }

    // This keyword >> The data member of the class and method parameters(local variable) are with
    // the same name then to differentiate the data members of the class from local variable
    // we can use "this" keyword.

    // this keyword always refers to the current object of the class.



    void displaydata(){
        System.out.println("Employee ID = " + this.eid);
        System.out.println("Emplyoee name = "+ this.name);
        System.out.println("Salary = " + this.salary);
    }
}

public class Practice {
    public static void main(String[] args) {
        Employee e1 = new Employee();

        e1.setdata(232, "Harsh", 200000);
        e1.displaydata();

        System.out.println("====".repeat(10));

        Employee e2 = new Employee();
        e2.setdata(3214, "Radhe", 430980);
        e2.displaydata();
        System.out.println("====".repeat(10));
    }
}
