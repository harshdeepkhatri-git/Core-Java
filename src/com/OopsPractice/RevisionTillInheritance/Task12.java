package com.OopsPractice.RevisionTillInheritance;

class Person{
    String name;
    int age;
    Person(String name, int age ){
        this.name = name;
        this.age = age;
    }

    void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


class Student extends Person{
    long rollNumber;
    Student(String name, int age, long rollNumber){
        super(name, age);
        this.rollNumber = rollNumber;
    }
    @Override
    void displayDetails(){
      super.displayDetails();
      System.out.println("Roll Number: " + rollNumber);
    }
}

class Result extends Student{
    int marks1;
    int marks2;
    int marks3;

    Result(String name, int age, long rollNumber, int marks1, int marks2, int marks3){
        super(name, age, rollNumber);
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

     int calculateTotal(){
        int totalMarks = marks1 + marks2 + marks3;

        return totalMarks;
    }

    double calculatePercentage(double marks1, double marks2,  double marks3){

        return ((marks1 + marks2 + marks3) *100)/ 300;
    }

    String finalResult(int marks1, int marks2, int marks3){
        if(marks1 >= 35 && marks2 >= 35 && marks3 >= 35){
            return "Pass";
        }
        else{
            return "Fail";
        }
    }

    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Marks: " + marks1);
        System.out.println("Marks: " + marks2);
        System.out.println("Marks: " + marks3);
        System.out.println("Total Marks: "+ calculateTotal());
        System.out.printf("Percentage Marks:  %.2f%%%n", + calculatePercentage(marks1, marks2, marks3));
        System.out.println("Final Result: "+ finalResult(marks1, marks2, marks3));
    }
}

public class Task12 {
    public static void main(String [] args){
        Result result = new Result("Harsh", 22, 101, 78, 65, 32);
        result.displayDetails();

    }
}
