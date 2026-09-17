package com.Strings;

public class StringComparision {
    public static void main(String[] args) {

        // String comparision with using equal operator

        String s1 = "hello";  // Literal form
        String s2 = new String ("hello"); // Object form

        System.out.println(s1 == s2);
        System.out.println(10 == 10);

        String s3 = "hello";
        System.out.println(s1 == s3);

        String s4 = "hello";
        String s5 = s4;

        String s6 = new String("hello");
        String s7 = s6;

        System.out.println(s4 == s5);
        System.out.println(s6 == s7);
        System.out.println(s4 == s6);
        System.out.println(s5 == s7);

        String s8 = "hello"; //s1
        String s9 = new String("hello"); // s2
        String s10 = "hello"; // s3
        String s11 = new String("hello"); //s4

        System.out.println(s8 == s10); //s1 == s3
        System.out.println(s9 == s11); // s2 == s4


        // String comparision by using .equals() method and .equalIgnoreCase().

        String s12 = "HELLO"; // str1.
        String s13 = "hello"; // str2

        System.out.println(s12.equals(s13));
        System.out.println(s12.equalsIgnoreCase(s13));


        String s14 = "abc"; //str1
        String s15 = "Abc"; // str2
        String s16 = "ABC"; // str3
        String s17 = "abc"; //str4

        System.out.println(s14.compareTo(s17));
        System.out.println(s14.compareTo(s15));
        System.out.println(s15.compareTo(s17));

    }
}
