package com.Strings;

import java.util.Scanner;

public class StringValidation {
    public static void main(String[] arg){
        // There are two Methods for String validation.
        //   1. Startwith() Method = If string starts with the givenportion then this method,
        // return true otherwise false.
        //   2. endswith() = if string ends with the given portion then this method return true,
        // otherwise false.
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the URL: ");
//        String url = sc.nextLine();
//
//        if(url.startsWith("http://") || url.startsWith("https://")){
//            System.out.println(url+ "is a valid url");
//        }
//        else{
//            System.out.println(url+ "is not a valid URL");
//        }
//
//    // 2.endswith()
//
//         System.out.println("Enter the email id: ");
//         String email = sc.nextLine();
//
//         if(email.endsWith("@gmail.com") || email.endsWith("@yahoo.com") || email.endsWith("@rediffmail.com")){
//             System.out.println(email + " is a valid email");
//         }
//         else{
//             System.out.println(email + " is not a valid email");
//         }
//
         // Null Value >> It is a literal in a java, which we can use to assign for ,
        // the non primitive variables.

        // >> If Strings need to define without any value and allows to access it then we can
        // define the string with "null" as a value.

        // when we define any operation on null-String we will get "null pointer exception".

              String str1 = null;
              String str2 = "null";
              String str3 ;

             // System.out.println(str3);
              System.out.println(str1);
              System.out.println(str1.length());
              System.out.println(str2.length());


      //sc.close();

        //output: null
        //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "str1" is null
        //	at CoreJava/com.Strings.StringValidation.main(StringValidation.java:50)
      }
}
