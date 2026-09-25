package com.datatype;

import java.util.Scanner;

public class ReverseANumber {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();

        int reverse = 0;
        while (n != 0) {
            int lastdigit = n % 10;
            reverse = reverse * 10 + lastdigit;
            n = n / 10;
        }
        System.out.println(reverse);

    }
}
