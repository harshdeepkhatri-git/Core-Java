package com.Strings;

import java.util.Scanner;

public class UsingTrim {
    public static void main(String[] args) {
        // trim >> It is used for removing the leading white spaces which may be at the beginning or the end of the strings.
      // the middle spaces are not been removed by using the trim () method.

       Scanner sc = new Scanner(System.in);

       System.out.println("Enter a string");
       String str = sc.nextLine();

       String str1 = str.trim();
       System.out.println(str1);
    }
}
// output
  // Enter a string
//    ---   core-Java ---- (spaces)
//core-Java