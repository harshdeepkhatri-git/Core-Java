package com.Strings.StringBuffers;

public class Demo3DeleteMethod {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Core Java Programming");
        System.out.println(sb.length());  // 21
        System.out.println(sb.capacity());  // 37
        System.out.println(sb); // Core Java Programming
        sb.delete(5 , 10);
        System.out.println(sb); //Core Programming

    }
}
