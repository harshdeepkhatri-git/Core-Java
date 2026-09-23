package com.Strings.PractiseQuestion;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the strings: ");
        String str = sc.nextLine();

       String str1 = str.toLowerCase();
        int count = 0;

        for(int i = 0; i<str1.length(); i++){
            char ch = str1.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        System.out.print(count);

    }
}
