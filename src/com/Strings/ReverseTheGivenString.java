package com.Strings;

import java.util.Scanner;

public class ReverseTheGivenString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String str = sc.nextLine();

        String  reverse = " ";

        for(int i = str.length()-1; i>=0; i--){
            reverse = reverse+str.charAt(i);
        }
        System.out.println("The reverse of the given string is :  "+ reverse);
        sc.close();
    }
}
// output
//Enter the String:corejava
//The reverse of the given string is :   avajeroc