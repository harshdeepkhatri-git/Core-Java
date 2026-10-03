package com.OopsPractice.Methods;

import java.util.Scanner;

class Student1{
    Scanner sc = new Scanner(System.in);
     String name;
     int marks;

     void takeDetails(){
         System.out.println("Enter your name: ");
         name = sc.nextLine();

         System.out.println("Enter your marks: ");
         marks = sc.nextInt();
     }

     void checkResult(){
         System.out.println("Student name = "+name);
         System.out.println("Student marks = "+marks);
         if(marks >= 40){
             System.out.println(" Result = Pass !!");
         }
         else{
             System.out.println("Result = Fail !!");
         }

     }
}

public class Practice8 {
    public static void main(String[] args) {
        Student1 stu = new Student1();
        stu.takeDetails();
        stu.checkResult();
    }
}
