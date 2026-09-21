package com.Strings;

import java.util.Scanner;

public class CountVowelConsonentDigitSpecialCharacter {
    public static void main(String[] args){
        // for counting the given things there are different methods in wrapper class.
        // some of them which we will use are :
              // 1. Character.isLetter(ch); >> for Letter / Alphabet
              // 2. Character.isDigit(ch); >> for digit
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String str = sc.nextLine();

        int vowel = 0; int consonent = 0; int digit = 0; int special = 0;

        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(Character.isLetter(ch)){
                if("aeiouAEIOU".indexOf(ch) != -1){
                    vowel++;
                }
                else{
                    consonent++;
                }
            } else if (Character.isDigit(ch)) {
                 digit++;
            }
            else{
                special++;
            }
        }
        System.out.println("Number Of vowels are :  " + vowel);
        System.out.println("Number Of Consonents are: "+ consonent);
        System.out.println("Number of Digits are : " + digit);
        System.out.println("Number of special Characteres are: " + special);


    }
}
