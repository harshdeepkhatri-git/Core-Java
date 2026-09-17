package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class CreateAnArrayByRemovingDuplicateElements {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an Array: ");
        int size = sc.nextInt();
        int[]array = new int [size];

        System.out.println("Enter the elements of an Array: ");
         for(int i = 0; i<size; i++){
             array[i] = sc.nextInt();
         }


        int [] newArray = new int[size];
        int newSize = 0;

        for(int i =0; i < size; i++){
            boolean duplicate = false;
            for(int j =0; j < newSize; j++){
                if(array[i] == newArray[j]){
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                newArray[newSize] = array[i];
                newSize++;
            }
        }

        System.out.println("The new array elements after removing duplicates: ");
        for (int i = 0; i < newSize; i++) {
            System.out.print(newArray[i] + " ");
        }
        sc.close();
    }
}
