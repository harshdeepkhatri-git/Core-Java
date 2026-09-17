package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearchInUnSortedArray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();

        int[] array = new int [size];

        System.out.println("Enter the elements of an array: ");
          for (int i = 0; i<size; i++){
              array[i] = sc.nextInt();
          }

          System.out.println(" Enter the key: ");
          int key = sc.nextInt();

          Arrays.sort(array);

          int low = 0; int high = array.length-1;
          boolean found = false;

          while(low<=high) {
              int mid = (low + high) / 2;
              if (array[mid] == key) {
                  found = true;
                  break;
              } else if (array[mid] > key) {
                  high = mid - 1;
              } else {
                  low = mid + 1;
               }
          }
         if (found )
             System.out.println("Element is found");

         else
             System.out.println("Element is not found");



    }
}
