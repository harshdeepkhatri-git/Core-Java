package com.Array;

import java.util.Scanner;

public class FindDuplicateElementInAnArray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an Array: ");
        int size = sc.nextInt();

        int [] array= new int [size];

        System.out.println("Enter the elements of an array: ");
        for(int i =0; i<size; i++){
            array[i] = sc.nextInt();
        }

        for(int i = 0; i<size; i++){
            for(int j = i+1; j<size; j++){
                if(array[i] == array[j]){
                    System.out.println("Duplicate: "+ array[i]);
                }
            }
        }
        sc.close();
    }
}
