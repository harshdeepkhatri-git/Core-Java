package com.Strings.StringBuffers;

import java.util.Scanner;

public class Demo2 {
    static void main() {
        StringBuffer sb= new StringBuffer("Hello");
        System.out.println(sb.length()); // 5

        System.out.println(sb.capacity());     // 21

        sb.append("123456789012356");
        System.out.println(sb.length()); // 20
        System.out.println(sb.capacity()); // 21

        sb.append("1");
        System.out.println(sb.length());  // 21
        System.out.println(sb.capacity());  // 21


    }
}
