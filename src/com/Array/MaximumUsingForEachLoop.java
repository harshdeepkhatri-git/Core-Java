package com.Array;

import java.util.Scanner;

public class MaximumUsingForEachLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array:  ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of an array:  ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
      int maximum = array[0];

        for(int element : array){
            if(element > maximum){
                maximum = element;
            }

        }
        System.out.println("The maximum element is "+ maximum);

    }
}
