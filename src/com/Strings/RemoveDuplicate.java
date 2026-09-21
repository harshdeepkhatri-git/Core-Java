package com.Strings;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();

        String result = "";

        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(result.indexOf(ch) == -1){
                result = result + ch;
            }
        }
        System.out.println("The Given String = "+ str);
        System.out.println("The given String after removing duplicates: " + result);
    }
}
// output
//Enter the String:corejava
//The Given String = corejava
//The given String after removing duplicates: corejav