package com.Strings.PractiseQuestion;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        // For this convert the string into the array

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Strings: ");
        String str = sc.nextLine();

        String[] arr = str.split(" ");

        // use length property in array to count the string array

        int number = arr.length;
        System.out.println(number);
        }
    }
// output:
//        Enter the Strings:
//        harsh deep khatri
//        3
