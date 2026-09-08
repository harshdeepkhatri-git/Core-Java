package com.Array;

import java.util.Scanner;

public class SumUsingForEachLoop {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();

        int [] array = new int [size];

        System.out.println("Enter the elemenst of an array: ");
        for(int i =0; i<size; i++){
            array[i]=sc.nextInt();
        }

        int sum = 0;
         for(int element:array){
             sum = sum + element;

         }

        System.out.println("Sum of elements of an array = "+ sum);
    }
}
