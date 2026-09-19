package com.Strings;

import java.util.Arrays;

public class StringConversion {
    public static void main(String[] args){
        // String to Array Conversion
        //<<-------------------------->>
        // There are two methods:
        //    1. toCharArray() Method.
        //    2. split() Method.

    // 1. By Using toCharArray() Method.

        String str = "Fullstack";
        char[] array = str.toCharArray();
        System.out.println("The character of an array: "+ Arrays.toString(array));
        // Output : The character of an array: [F, u, l, l, s, t, a, c, k]

        // 2. >> By using split() method.

       String str1 = "Java Fullstack Development";
       String [] arr  = str1.split(" ");

       System.out.println("array = "+ Arrays.toString(arr)); // output : array = [Java, Fullstack, Development]

       String str2 = "12-08-2005";
       String[] arr1 = str2.split("-");

       System.out.println("arr1 = "+ Arrays.toString(arr1));// output: arr1 = [12, 08, 2005]

    // Array to Strings.

       // >> To convert array to string there are two approaches--
                // 1. By Using toString() method.
                // 2. By using join() method.

    // 1. By Using toString() Methods.

       int [] a = {10, 20, 30 };
       String s = java.util.Arrays.toString(a);
       System.out.println("string = " + s );


    // 2. By using join() method.

     String [] data1 = {"12", "08", "2005"};
     System.out.println("The given array = " + Arrays.toString(data1));// Output: The given array = [12, 08, 2005]

     String r1 = String.join("-",  data1);
     System.out.println("r1 = " + r1);// output :  r1 = 12-08-2005

        String r2 = String.join(" " , data1);
         System.out.println("r2 = " +  r2); // output: r2 = 12 08 2005

        String r3 = String.join(" ", data1);
           System.out.println("r3 = "+ r3); // output: r3 = 12 08 2005


        // Conversion of primitive type to String type.
            // There is a method for conversion called as
        //             >> ValueOf() method.

        int x = 10;
        String s1 = String.valueOf(x);
        System.out.println("s1 = "+ s1);// output: s1 = 10
        System.out.println(s1.getClass().getName()); // output: java.lang.String


      // Conversion of Character array into String
          // >> There is a method used:
                  //  >>> CopyvalueOf().

      char [] array1 = {'a', 'p', 'p', 'l', 'e'};
         System.out.println(array1.getClass().getName());
         // output: [C >> this indicate '[' means it is a 1-D array ,
        //  'c' represent it is a character type.

        String st = String.copyValueOf(array1);
        System.out.println("St= "+ st); // output : St= apple

        System.out.println(str.getClass().getName()); // output : java.lang.String


    }
}
