package com.OOPs.Methods;

class Student{
    String name;
    int roll;
    int marks;
    char grade;

//    void getdata(){
//        System.out.println("Name is: " + name);
//        System.out.println("Roll is: " + roll);
//        System.out.println("Marks is: " + marks);
//    }

    // not work because here is no getter and setter in this code.

//
//    void display(){
//        System.out.println("Name = " + name );
//        System.out.println("Roll = " + roll);
//        System.out.println("Marks = " + marks);
//        System.out.println("Grade = " + grade);
//    }
}

public class Main {
    public static void main(String[] args){
        Student s1 = new Student ();
        s1.name = "Harsh";
        s1.roll = 101;
        s1.marks = 78;
        s1.grade = 'B';

        Student s2 = new Student();

        s2.name = "Ravi";
        s2.roll = 102;
        s2.marks = 45;
        s2.grade = 'c';

    }
}
