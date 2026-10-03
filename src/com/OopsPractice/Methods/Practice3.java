package com.OopsPractice.Methods;


import java.util.Scanner;

class Student{
    Scanner sc = new Scanner(System.in);
            String name;
            int age;
            int mark;

    void displayDetails(){
        System.out.println("Enter the Name: ");
         name = sc.nextLine();

        System.out.println("Enter the Age: ");
         age = sc.nextInt();

        System.out.println("Enter the Marks: ");
         mark = sc.nextInt();

        System.out.println("Name = "+ name);
        System.out.println("Age = "+ age);
        System.out.println("Marks = "+ mark);

    }

    void calculateGrade(){
        if(mark>=90 && mark<=100){
            System.out.println("Grade A");
        }
        else if (mark>=75 && mark<=89){
            System.out.println("Grade B");
        }
        else if (mark>=60 && mark<=74){
            System.out.println("Grade C");
        }
        else if (mark>=40 && mark<=59){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Fail");
        }

    }
}
public class Practice3 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.displayDetails();
        s1.calculateGrade();
    }
}
