package com.OopsPractice.Methods;

import java.util.Scanner;

class Student2{
    String name;
    int marks;

    void setDetails(String name, int marks){
          this.name = name;
          this.marks = marks;
    }

    void displayResult(){
        System.out.println("Name : "+ name);
        System.out.println("Marks: "+ marks);

        if(marks>= 40){
            System.out.println("Result = Pass !!");
        }
        else {
            System.out.println("Result = Fail !!");
        }

    }

}

public class Practice12 {
    public static void main(String[] args){
        Student2 stu = new Student2();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your marks: ");
        int marks = sc.nextInt();

        stu.setDetails(name , marks);
        stu.displayResult();

        sc.close();

    }
}
