package com.Strings.PractiseQuestion;

import java.util.Scanner;

public class CountCharacterWithoutSpaces {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Strings");
        String str = sc.nextLine();

        str = str.trim();

        int count = 0;

        for(int i = 0; i<str.length(); i++){
            char ch= str.charAt(i);// here we can directly write count++.
             count++;
        }
        System.out.println(count);
    }
}
