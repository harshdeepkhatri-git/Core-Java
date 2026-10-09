package com.OopsPractice.Constructor;


class Employ{
    String name;
    int id;
    double salary;


    Employ(){

        this.name = "Unknown";
    }

    Employ(String name){
        this();
        this.name = name;

    }

    Employ(String name, int id, double salary ){
        this(name);// by using args constructor call skip the name.
        // else if simple no args this() call then do (this.name = name);

//        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void printDetails(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

public class Practice8 {
    public static void main(String [] args){
        Employ emp = new Employ();
        emp.printDetails();

        Employ e1 = new Employ("Harsh");
        e1.printDetails();

        Employ e2 = new Employ("Rahul", 101, 50000);
        e2.printDetails();

    }
}
