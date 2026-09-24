package com.Strings.PractiseQuestion;

import java.util.Scanner;

public class CheckOneStringIsASubStringOfAnother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str = sc.nextLine();

        System.out.print("Enter the second string: ");
        String str1 = sc.nextLine();

        boolean found = false;

        for (int i = 0; i <= str.length() - str1.length(); i++) {
            int j = 0;

            while (j < str1.length()
                    && str.charAt(i + j) == str1.charAt(j)) {
                j++;
            }

            if (j == str1.length()) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Yes, it is a substring.");
        } else {
            System.out.println("No, it is not a substring.");
        }

        sc.close();
    }
}