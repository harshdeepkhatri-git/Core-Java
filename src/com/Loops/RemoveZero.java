package com.Loops;

import java.util.Scanner;

public class RemoveZero {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number = ");
        int num = sc.nextInt();


        int result = 0;
        int place = 1;

        while (num > 0) {
            int digit = num % 10;


            if (digit != 0) {
                result = result + digit * place;
                place = place * 10;
            }

            num = num / 10;
        }

        System.out.println(result);
    }
}
