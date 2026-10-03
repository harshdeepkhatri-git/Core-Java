package com.Array;

import java.util.Scanner;

public class ContainsDuplicate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int [] arr = new int [size];

        System.out.println("Enter the elements of an array: ");
        for (int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        // duplicate number.

        boolean duplicate = false;

        int repeat = 0;
        for(int i = 0; i<size; i++){
            for(int j = i+1; j<size; j++){
                if(arr[i] == arr[j]){
                    repeat++;
                }
              }
            }
        if(repeat > 0){
            duplicate = true;
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
       }
    }

