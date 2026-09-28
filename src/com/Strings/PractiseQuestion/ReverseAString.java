package com.Strings.PractiseQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAString {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();

//        String reverse ="";
//
//        for(int i = str.length()-1; i>=0; i--){
//            reverse+=str.charAt(i);
//        }
//        System.out.println(reverse);


                String[] ch = str.split(" ");

                for (int i = 0; i < ch.length; i++) {
                    ch[i] = new StringBuilder(ch[i]).reverse().toString();
                }

                System.out.println(String.join(" ", ch)); // olleh dlrow
            }
        }



// output
//        Enter the String:   the sky is blue
//         output >>  eulb si yks eht

