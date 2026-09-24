package com.Strings.PractiseQuestion;

import java.util.Scanner;

public class ReplaceSpaceWithHypen {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String str = sc.nextLine().toLowerCase();


          String result = "";
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch == ' '){
                ch = '-';
            }
            result += ch;
        }

        System.out.println(result);

    }
}
