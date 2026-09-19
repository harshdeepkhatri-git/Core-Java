package com.Strings;

public class CheckGivenStringIsPresentInMainString {
    public static void main(String[] args){
        String str = "Core java programming";

        // .contains gives boolean output.

        System.out.println(str.contains("java"));// output: true
        System.out.println(str.contains("Java"));//         false
    }
}
