package com.Strings.PractiseQuestion;

import java.util.Scanner;

public class SwapTwoStringWithoutThirdString {
    static void main() {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First String: ");
        String str = sc.nextLine();

        System.out.println("Enter the second string: ");
        String str2 = sc.nextLine();

         str = str + str2;
         str2 = str.substring(0, (str.length() - str2.length()));
         str = str.substring(str2.length());

         System.out.println(str);
         System.out.println(str2);
    }
}
