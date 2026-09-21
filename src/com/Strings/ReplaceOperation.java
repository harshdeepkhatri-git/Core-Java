package com.Strings;

public class ReplaceOperation {
    public static void main(String[] args ){
        // >> There are three methods in strings for string replace operation.
        //  1. replace() method
        //  2. replaceFirst() method
        //  3. replaceAll() method

        // 1. replace() Method = It can replace the specified old-string with the given new String.
        // If the old-string is at multiple places then replace() method will replace all the occurances of the old-string.
        // If the old string is not in the given String, then there is no changes seen.

               String str = "The cat sat on the wall";
               System.out.println(str);

               String m = str.replace("cat","dog");System.out.println(m);

               System.out.println("-----".repeat(20));


               String str1 = "The cat sat on the wall and the cat jump to the next wall.";
               String m1 = str1.replace("cat","dog");

               System.out.println("The String before replace: "+ str1);
               System.out.println("The String after replace: "+ m1);

               System.out.println("-----".repeat(20));

               String str2 = str1.replace("horse" , "lion");
               System.out.println(str2);


        // 2. replaceAll() method.
        // >> Same as replace() method only implementation wise there is some changes.
// replace method can't accept regular expression to replace, the old string we can,
// specify as regular expression.
// so, regular expression can be replaced by new regular expression.
// So replace method does not accept the regular expression as the old and new strings, but
// replaceAll() can do the replace operation based on the regular expressionalso, but replace method can't do.



// 3. replaceFirst() method .
        // >> When the given old-String wants to replace woth the new-String at
        // only the first Occurance, in this situation , "replaceFirst()" Mehthod is used.


    }
}
