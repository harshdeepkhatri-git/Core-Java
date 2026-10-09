package com.OopsPractice.Constructor;


class Student1{
    String name;
    int age;
    double marks;

    Student1(){
        this.name = "unknown";


//        System.out.println("Student 1: ");
//        System.out.println("Name: "+ name);
//        System.out.println("Age: "+ age);
//        System.out.println("Marks: "+ marks);
//        System.out.println("===".repeat(5));
//        System.out.println();

    }

    Student1(String name){
        this.name = name;


//        System.out.println("Student 2: ");
//        System.out.println("Name: "+ this.name);
//        System.out.println("Age: "+ this.age);
//        System.out.println("Marks: "+ this.marks);
//        System.out.println("===".repeat(5));
//        System.out.println();
    }

    Student1(String name, int age, double marks){
        this.name = name;
        this.age =age;
        this.marks = marks;

//        System.out.println("Student 3: ");
//        System.out.println("Name: "+ this.name);
//        System.out.println("Age: "+ this.age);
//        System.out.println("Marks: "+ this.marks);

    }

    void displayDetails(){
        System.out.println("Name: "+ this.name);
        System.out.println("Age: "+ this.age);
        System.out.println("Marks: "+ this.marks);
    }
}


public class Practice7 {
    public static void main(String[] args){
         Student1 stu = new Student1();
        stu.displayDetails();

         Student1 stu1 = new Student1("Harsh");
         stu1.displayDetails();

         Student1 stu2 = new Student1("Rahul", 22, 85);
         stu2.displayDetails();


    }
}
