package com.Strings;

public class ComparisionUsingEqualMethod {
    public static void main(String[] args) {

        // comparision of string using equals() method.

        String str1 = "hello";
        String str2 = new String("hello");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }
}
