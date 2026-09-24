package com.Strings.PractiseQuestion;

import java.util.Scanner;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().trim().toLowerCase();

        StringBuilder result = new StringBuilder();
        String[] words = sentence.split("\\s+");

        for (String word : words) {
            boolean alreadyAdded = false;

            // Check complete words already in the result
            String[] addedWords = result.toString().split("\\s+");
            for (String added : addedWords) {
                if (word.equals(added)) {
                    alreadyAdded = true;
                    break;
                }
            }

            if (!alreadyAdded) {
                if (result.length() > 0) {
                    result.append(" ");
                }
                result.append(word);
            }
        }

        System.out.println(result);
        sc.close();
    }
}