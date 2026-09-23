package com.Strings.PractiseQuestion;

import java.util.Scanner;

public class FrequencyOfEachCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        str = str.toLowerCase();



//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            int count= 0;
//
//            // Skip the character if it appeared earlier
//
//            boolean counted = false;
//            for (int j = 0; j < i; j++) {
//               if (str.charAt(j) == ch) {
//                   counted=true;
//                   break;
//               }
//
//            }
//
//            if (counted) {
//                continue;
//            }
//
//            // count  how many times it appears in the whole string
//
//            for (int k = 0; k<str.length(); k++){
//                if (str.charAt(k) == ch) {
//                    count++;
//                }
//            }
//            System.out.println(ch + ":" + count );
//        }

        // ----Another way to calculate the frequency ----

         for(int i = 0; i<str.length();i++){
             char ch = str.charAt(i);
             int count = 0;

             if(str.indexOf(ch)!= i){
                 continue;
             }
             for(int j=0;j<str.length();j++){
                 if(str.charAt(j)==ch){
                     count++;
                 }
             }
             System.out.print(" The " + ch + " is available for: "+ count);
             System.out.println();
         }
         sc.close();
    }
}

//Enter a string: Harsh deep khatri
//
//            The h is available for: 3
//            The a is available for: 2
//            The r is available for: 2
//            The s is available for: 1
//            The   is available for: 2
//            The d is available for: 1
//            The e is available for: 2
//            The p is available for: 1
//            The k is available for: 1
//            The t is available for: 1
//            The i is available for: 1