package com.Strings.PractiseQuestion;

import java.util.Scanner;

public class CountLetterRepeating {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();


       String str1 = str.toLowerCase();

        int count = 0;

        for(int i = 0; i<str.length(); i++){
            char ch= str1.charAt(i);

            if(ch == 'a'){
                count++;

            }
        }
        System.out.println(count);
        sc.close();

    }
}
