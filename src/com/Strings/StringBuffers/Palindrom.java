package com.Strings.StringBuffers;

import java.util.Scanner;

public class Palindrom {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine().toLowerCase();

        StringBuffer buffer = new StringBuffer(str);

        if (str.equals(buffer.toString()))
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");
        sc.close();
    }
}

