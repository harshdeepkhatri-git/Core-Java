package com.Array;

import java.util.Scanner;

public class BalancedFinancialTransactions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < size; i++){
            for(int j = i+1; j < size; j++){
                for(int k = j+1; k < size; k++){
                     if(arr[i] + arr[j] + arr[k] == 0){
                         System.out.println( arr[i] +","+arr [j] +","+ arr [k]);

                     }
                }


            }
        }

    }
}
