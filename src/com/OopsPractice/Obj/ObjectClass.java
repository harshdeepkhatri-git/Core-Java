package com.OopsPractice.Obj;


//Creation of object and class.



class Student{
    String name ;
    int age ;
    int marks;
}

public class ObjectClass {
    public static void main(String[]args){
        Student stu = new Student();

        stu.age = 22;
        stu.marks = 70;
        stu.name = "Harsh";



        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println(stu.marks);
    }
}
