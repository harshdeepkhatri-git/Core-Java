package com.Strings;

public class AccessingCharactersOfString {
    public static void main(String[] args){

        // charAt() method is used.

//        String str ="java";
//        System.out.println(str.charAt(0));
//        System.out.println(str.charAt(1));
//        System.out.println(str.charAt(2));
//        System.out.println(str.charAt(3));
//        System.out.println(str.charAt(4));

        // Substring() method is used.


//        String str = "Java FullStack Developement";
//        System.out.println(str.substring(0));
//        System.out.println(str.substring(15));
//        System.out.println(str.substring(0,3));
//        System.out.println(str.substring(5,14));
//

        // By using Indexof() method.

        String str = "java";
        System.out.print("Index of all the String characters = ");
        System.out.print(str.indexOf("j") + " ");
        System.out.print(str.indexOf("a") + " ");
        System.out.print(str.indexOf("v") + " ");
        System.out.println(str.indexOf("a") + " ");
  //output
//  Index of all the String characters = 0 1 2 1
//  in last index the the string is repeated "a" so the first occurance is counted
//  so first "a" occurred at index value 1, so at last also it printed same index of first value occurance.

        // same indexOf() method example.

        String str2 = "The cat sat on the wall and the cat jump to the next wall";

        // here duplicate substrings are : cat , wall .

        System.out.println("First occurance of cat = "+ str2.indexOf("cat"));
        System.out.println("First occurance of wall = "+ str2.indexOf("wall"));

        // Suppose if the given elements is not in the string.

        String str3 = "The cat sat on the wall";
        System.out.println(str.indexOf("dog"));

        // output
        // >> -1  Because if elements in the string is not available then JVM gives -1,
          // as the output.

        // lastIndexOf() method.

        String str4 = "The cat sat on the wall and the cat jump to the next wall";
        System.out.println(str4.lastIndexOf("wall"));


    }
}
