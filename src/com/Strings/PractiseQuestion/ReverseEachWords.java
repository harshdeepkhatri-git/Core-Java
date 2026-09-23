package com.Strings.PractiseQuestion;

import java.util.Scanner;

public class ReverseEachWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Strings");
        String str = sc.nextLine();

        String[] arr = str.split(" ");
        String sentence = "";
           for(String word : arr){
               String reverseWord = "";

               for(int i = word.length()-1; i>=0; i--){
                   char ch = word.charAt(i);
                   reverseWord += ch;
               }
               sentence += reverseWord;
           }
           System.out.println(sentence);
    }
}
