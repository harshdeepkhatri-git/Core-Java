package com.Strings;

import java.util.Scanner;

            // by using .Equals() method

public class ApplicationLoginSystem {
    public static void main(String[] args) {
        String CorrectUserName ="admin123";
        String CorrectPassword ="admin@123#";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username = ");
        String username = sc.nextLine();
        System.out.println("Enter your password = ");
        String password = sc.nextLine();

        if (username.equals(CorrectUserName) && password.equals(CorrectPassword)) {
            System.out.println("Login Successful");
            System.out.println("Welcome to our online services");
        }
        else {
            System.out.println("Login Failed");
            System.out.println("Please check your login credentials");
        }
        sc.close();
    }
}
