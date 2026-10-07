package com.OopsPractice.Constructor;

// Basic of Constructor  >>
// 1. Constructor basics — create object and initialize fields
// 2. Default constructor
// 3. Parameterized constructor
// 4. Constructor with multiple instance variables


//Q1 → Parameterized constructor ✅

class Student{
    String name;
    int age;
    double marks;

    Student(String name, int age, double marks){
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
}

public class Practice1 {
    public static void main(String[] args){


        Student stu = new Student("Harsh", 21, 85.5);

          System.out.println("name: "+ stu.name);
          System.out.println("Age: "+ stu.age);
          System.out.println("Marks: "+ stu.marks);
    }
}
