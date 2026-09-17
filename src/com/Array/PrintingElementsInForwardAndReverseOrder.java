package com.Array;

import java.util.Scanner;

public class PrintingElementsInForwardAndReverseOrder {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of an array: ");
        int size = sc.nextInt();

        int [] array = new int [size];

        System.out.println("Enter the elements of an array: ");
        for(int i = 0; i<size; i++){
            array[i] = sc.nextInt();
        }

        // printing array in forward direction

        System.out.println("The array in forward direction: ");
        for(int i = 0; i<size; i++){
           System.out.print(array[i] + "\t");
        }

        System.out.println();
        System.out.println();

        // printing array in reverse direction

        System.out.println("The array in reverse direction: ");

        for(int i = array.length - 1; i>=0; i--){
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        sc.close();
    }
}
