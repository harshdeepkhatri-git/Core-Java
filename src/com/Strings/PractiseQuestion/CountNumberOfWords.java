package com.Strings.PractiseQuestion;

import java.util.Scanner;

public class CountNumberOfWords {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Strings: ");
        String str = sc.nextLine();

          String[] words = str.trim().split("\\s+");

           System.out.println(words.length);

        }
    }

