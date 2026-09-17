package com.Array;

public class TraversalOfArrayUsingForEachLoop {
    public static void main(String[] args) {

    int [ ] array = new int [] {10, 20, 30, 40, 59};

    int index = 0;

    for(int pointer : array) {
        System.out.println("the elements at " + index + " is =" + pointer);
        index++;
      }
    }
}

