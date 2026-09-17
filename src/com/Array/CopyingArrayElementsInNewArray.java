package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class CopyingArrayElementsInNewArray {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an Array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of an Array: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int duplicate = 0;
        int count = 0;
        for(int i = 0; i < size-1; i++){
            if ( array[i] == array[i+1]){
                duplicate = array[i];
                count++;
            }
        }

        int [] newArray = new int[size - count];

        int j = 0;

        for(int i = 0; i<size; i++) {
            if(i ==0 || array[i] != array[i-1]){
                newArray[j] = array[i];
                j++;
            }
        }

        System.out.println("New Array elements: ");

        for(int i = 0; i< newArray.length; i++){
            System.out.println(newArray[i]);
        }
    }
    }


