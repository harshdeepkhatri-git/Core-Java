package com.Strings;

import java.util.Scanner;

public class PrintUnicodeWithItsCharacterInForwaedAndReverseOrder {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String str = sc.nextLine();

        // To extract each charatcer of a string we need to traverse on the given string.
        // String traversing is done basically by using for , while, do-while loops only .
        // we can't use for-each loop because string does't allow character-by-Character,
        // traversing. if we do we get compile time error.

        int index =0;
        int lastIndex = str.length()-1;

          while (index<=lastIndex){
              char ch = str.charAt(index);

              System.out.println("The Character at: "+ index + " = " + ch +" and its unicode is: "+ str.codePointAt(index) );
              index++;
          }
          System.out.println("-----".repeat(10));

          System.out.println("String in Reverse Order: ");

          for(int i = str.length()-1; i>=0; i--){
              System.out.println("Character at: "+ i + " = "  + str.charAt(i) + " its unicode= "+ str.codePointAt(i));
          }
          sc.close();
    }
}
