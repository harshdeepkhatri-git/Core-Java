package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class CopyingArrayElementsInNewArray {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an Array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of an Array: ");
        for(int i = 0; i<size; i++){
            array[i] = sc.nextInt();
        }

        int[]newArray=new int[size];
        for(int i = 0; i<size; i++){
            newArray[i]=array[i];
        }
        System.out.println("The copied Array is: " + Arrays.toString(newArray));

    }
}
