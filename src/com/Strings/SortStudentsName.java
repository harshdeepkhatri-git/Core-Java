package com.Strings;

import java.util.Scanner;

// This code is using .compareTo() method  of String Comparision.

// this code work according to the unique code value of first letter of name
// suppose Harsh and Roushan
// so here H unique code comes first compare to R so Harsh will be the output.

public class SortStudentsName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Name: ");
        String student1 = sc.nextLine();

        System.out.println("Enter Student Name: ");
        String student2 = sc.nextLine();

        if(student1.compareTo(student2) > 0){
            System.out.println(student2 + " should come before " + student1);
        }
        else {
            System.out.println(student1 + " should come before " + student2);
        }
        sc.close();
    }
}
