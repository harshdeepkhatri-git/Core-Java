package com.Loops;

import java.util.Scanner;

public class PerfectNumberBetweenGivenRange {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Starting Number= ");
        int start = sc.nextInt();

        System.out.println("Enter Ending Number= ");
        int end = sc.nextInt();

        System.out.println("The Perfect Numbers are: ");

        for(int i = start; i <= end; i++){
            int sum =0;

            for(int j = 1; j < i; j++){
                if (i%j==0){
                    sum+=j;
                }
            }
            if(sum==i){

                System.out.println(i);
            }
        }
    }
}
