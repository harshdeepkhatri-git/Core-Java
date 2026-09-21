package com.Strings;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();

        System.out.println("The given string : "+ str);
         String reverse = "";// In a empty String we should not use any space ,
        // because space is counted as a string.

        for(int i = str.length()-1; i >= 0; i--){
            reverse = reverse + str.charAt(i);
        }
        if(reverse.equals(str)){
            System.out.println(str + " is palindrome");
        }
        else{
            System.out.println(str + " is not a palindrome");
        }
    }
}
