package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumConsecutivelyRepeatedElements {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements in an array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);
        int count = 1;
        int temp = array[0];
        int max = 0;

        for (int i = 0; i < size - 1; i++) {
            if (array[i] == array[i + 1]) {
                count++;

                if (count > max) {
                    max = count;
                    temp = array[i];
                }
            } else
                count = 1;
        }


         System.out.println(temp);
         System.out.println(max);



    }
}
