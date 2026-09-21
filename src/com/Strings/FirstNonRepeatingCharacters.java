package com.Strings;

import java.util.Scanner;

public class FirstNonRepeatingCharacters {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Strings: ");
        String str = sc.nextLine();

        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);

            int count = 0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)==ch){
                    count++;
                }
            }
            if(count == 1){
                System.out.println("First non repeating Number: " + ch);
                break;
            }
        }
    }
}
