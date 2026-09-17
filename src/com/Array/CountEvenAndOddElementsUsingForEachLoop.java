package com.Array;

import java.util.Scanner;

public class CountEvenAndOddElementsUsingForEachLoop {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of an array: ");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the Elements of an array: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int evenCount = 0;
        int oddCount = 0;

        for (int element : array) {
            if (element % 2 == 0)
                evenCount++;


            else
                oddCount++;
        }
        System.out.println("The Even Number is : " + evenCount);
        System.out.println("The Odd Number is : " + oddCount);
    }
}
