package com.OopsPractice.Inheritance;


class Person{
    String name;
    int age;

    void displayPerson(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

class Student extends Person{
    int rollNumber;

    void displayStudent(){
        System.out.println("Roll Number: "+rollNumber);
    }
}

public class Practice2 {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Harsh";
        s1.age = 21;
        s1.rollNumber = 101;
        s1.displayPerson();
        s1.displayStudent();
    }
}
