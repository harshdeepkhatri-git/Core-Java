package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestUsingForEachLoop {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of an Array: ");
        int size= sc.nextInt();
        int[] array = new int [size];

        System.out.println("Enter the elements of an Array: ");
        for(int i = 0; i <size; i++){
            array[i]=sc.nextInt();
        }
        System.out.println("The given Array is without sorting= "+ Arrays.toString(array));

        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;

        for(int elements:array){
            if(elements>largest){
                secondlargest = largest;
                largest = elements;
            }
            else if(elements>secondlargest){
                secondlargest = elements;
            }
        }
        if(secondlargest == Integer.MIN_VALUE){
            System.out.println("Second Largest Element: "+ -1);
        }
        else {
            System.out.println("Second Largest Element: "+ secondlargest);
        }
    }
}
