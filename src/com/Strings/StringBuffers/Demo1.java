package com.Strings.StringBuffers;

public class Demo1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb);

        sb.append("World!"); // Hello
        System.out.println(sb);  //  HelloWorld!
    }
}
