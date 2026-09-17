package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class SearchElementUsingForEach {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of an array: ");
        int size = sc.nextInt();
        int[]array = new int[size];

        System.out.println("Enter the elements of an aray");
        for(int i = 0; i<size; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("The given array is "+ Arrays.toString(array));

        System.out.println("Enter the key: ");
        int key = sc.nextInt();



        boolean found=false;

        for(int element: array){
            if(key == element) {
                found = true;
                break;
            }
        }
        if(found)
            System.out.println( key + " " + " is present in the array");
        else
            System.out.println(key + " " + " is not present in an array");
    }
}
