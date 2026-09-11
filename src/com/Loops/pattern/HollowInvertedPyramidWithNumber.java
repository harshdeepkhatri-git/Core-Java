package com.corejava.pattern;

public class HollowInvertedPyramidWithNumber {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            // Starting spaces
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }

            // Numbers and middle spaces
            for (int j = i; j <= 2 * n - i; j++) {

                if (i == 1) {
                    System.out.print(j);
                }
                else if (j == i) {
                    System.out.print(i);
                }
                else if (j == 2 * n - i) {
                    System.out.print(2 * n - i);
                }
                else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}