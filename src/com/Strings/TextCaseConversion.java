package com.Strings;

public class TextCaseConversion {
    public static void main(String [] args){
        String str = "Java Fullstack Development";

        // By using text case conversion method.
        // >> 1. toLowerCase(); methods.
        // >> 2. toUpperCase(); methods.

        System.out.println("The Given String: " + str);
        System.out.println("The given String in Lower Case: "+ str.toLowerCase());
        System.out.println("The given String in Upper Case: "+ str.toUpperCase());


        // To find total Numbers of Character in a String
        // we use method called: .length().

        String str2 = "Java Fullstack Development";
        System.out.println("The Number of Character = " + str2.length());
   // Output : The Number of Character = 26.

        // String Concatenation .
        // It is done by two ways:
        //   1. By using "+" operator.
        //   2. By using Concat() method.
// 1. By using "+" operator.

        String str3 = "Core";
        String str4 = "Java";
        String str5 = str3 + str4;
        System.out.println(str5);// output : CoreJava


    // 2. By using concate() method.

      String str6 = str3.concat(str4);
      System.out.println(str6); // Output: CoreJava



    }
}
