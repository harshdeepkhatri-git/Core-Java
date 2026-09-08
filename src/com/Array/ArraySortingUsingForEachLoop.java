package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortingUsingForEachLoop {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an Array: ");
        int size = sc.nextInt();
        int[] array= new int[size];

        System.out.println("Enter the elements of an Array: ");
          for (int i = 0; i<size; i++){
              array[i] = sc.nextInt();
          }
         for(int i = 0; i<size; i++){
             for(int j = i+1; i<size; i++){
                 if(array[i]>array[j]){
                     int temp = array[i];
                     array[i] = array[j];
                     array[j] = temp;
                 }

              }
          }

        System.out.println("The array after sorting is: " + Arrays.toString(array));


    }
}
