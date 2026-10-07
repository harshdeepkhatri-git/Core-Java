package com.OopsPractice.Methods;

import java.util.Scanner;

class Students{

    void display(int marks){
        System.out.println("Marks: "+ marks);
    }

    void display(double percentage){
        System.out.println("Percentage: "+ percentage);
    }
    void display(String name){
        System.out.println("Name : "+ name);
    }
}

public class Practice27 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks: ");
        int marks = sc.nextInt();

        System.out.println("Enter your percentage: ");
        double percentage = sc.nextDouble();

        sc.nextLine();

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        Students stu = new Students();

        stu.display(marks);
        stu.display(percentage);
        stu.display(name);


    }
}
