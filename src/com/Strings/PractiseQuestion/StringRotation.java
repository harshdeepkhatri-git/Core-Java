package com.Strings.PractiseQuestion;

import java.util.Scanner;

import java.util.Scanner;

public class StringRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Pehli string: ");
        String first = sc.nextLine();

        System.out.print("Doosri string: ");
        String second = sc.nextLine();

        String doubled = first + first;

        if (first.length() == second.length()
                && doubled.contains(second)) {
            System.out.println("Rotation hai");
        } else {
            System.out.println("Rotation nahi hai");
        }

        sc.close();
    }
}