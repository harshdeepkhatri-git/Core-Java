package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class CreatAnArrayAndCopyElementToNewArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of an array: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("The Array given by the user is : " + Arrays.toString(array));

        int[] copyArray = new int[size];

         for(int i =0; i<size; i++){
             copyArray[i] = array[i];
         }
         System.out.println("The copied new array is : "+ Arrays.toString(copyArray));

    }
}
