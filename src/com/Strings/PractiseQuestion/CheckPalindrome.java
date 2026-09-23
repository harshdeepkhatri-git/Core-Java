package com.Strings.PractiseQuestion;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
        String str = sc.nextLine();

        String reverse= "";
        boolean palindrome = true;

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        if(reverse.equalsIgnoreCase(str)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
          }
        }
}
