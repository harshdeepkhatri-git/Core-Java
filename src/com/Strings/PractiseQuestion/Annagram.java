package com.Strings.PractiseQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class Annagram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st String:");
        String str1 = sc.nextLine();

        System.out.println("Enter the 2nd String: ");
        String str2 = sc.nextLine();

        str1 = str1.trim().toLowerCase();
        str2 = str2.trim().toLowerCase();

        if(str1.length()==str2.length()){
            // anagram check ======

            char [] arr1 = str1.toCharArray();
            char [] arr2 = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if (Arrays.equals(arr1,arr2)){
                System.out.println("Both Strings are Annagrams");
            }
            else{
                System.out.println("Both Strings are not Annagrams");
            }

        }
        else{
            System.out.println("Strings are not Annagrams");
        }
        sc.close();
    }
}
