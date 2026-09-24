package com.Strings.PractiseQuestion;

import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String str = sc.nextLine().toLowerCase();

        int max = 0;
        char mostrepeated = ' ';
        for(int i = 0; i<str.length(); i++){
            char ch= str.charAt(i);
            if(ch==' ')
                continue;

            int count = 0;

             for(int j=0;j<str.length();j++){
                 if(ch == str.charAt(j)){
                     count++;
                 }
               }
                if(count>max){
                max=count;
                mostrepeated=ch;
             }
             count=0;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ' || str.indexOf(ch) < i) {
                continue; // ignore spaces and characters already checked
            }

            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                }
            }

            if (count == max) {
                System.out.println(ch + " appears " + count + " times");
            }
        }
    }
}
