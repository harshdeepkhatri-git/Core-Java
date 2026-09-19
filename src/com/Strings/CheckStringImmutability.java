package com.Strings;

import java.util.Locale;

public class CheckStringImmutability {
    public static void main(String[] args){
        String str = "Java Fullstack Development";

        System.out.println("Before Modification: ");
        System.out.println(str);// Output: Java Fullstack Development


        String str1 = str.toLowerCase();

        System.out.println("After Modification: ");
        System.out.println(str);// Output: Java Fullstack Development
        System.out.println(str1);//Output:java fullstack development

    }
}
