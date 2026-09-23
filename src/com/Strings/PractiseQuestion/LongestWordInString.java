package com.Strings.PractiseQuestion;

import java.util.Scanner;

public class LongestWordInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String str = sc.nextLine();

        String[] arr = str.split(" ");

        String longest = "";

        for(String word : arr){
            if(word.length()>longest.length()){
                longest = word;
            }
        }
        System.out.println("Longest Word is = " + longest);
    }
}
//    output:
//        Enter a String:
//        Java FullStack Development With Cloud Integration
//        Longest Word is = Development
// here the "development" and "Integration" Both are of same number so the
// first one is printed which is development.