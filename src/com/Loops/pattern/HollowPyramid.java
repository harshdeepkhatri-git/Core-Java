package com.Loops.pattern;

public class HollowPyramid {
    public static void main(String[] args) {

       /* for (int i = 1; i <= 5; i++) {

            // Spaces
            for (int j = 1; j < i + 1; j++) {
                System.out.print("  ");
            }

            // Stars
            if (i == 1) {
                for (int j = 1; j <= 9; j++) {
                    System.out.print("*" + " ");
                }
            } else {
                System.out.print("*");

                // Middle spaces
                for (int j = 1; j <= 7 - 2 * (i - 2); j++) {
                    System.out.print("  ");
                }

                if (i <= 5) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
      */
        int n = 5;

        for (int i = 1; i <= n; i++) {

            // spaces before star
            for (int s = 1; s < i; s++) {
                System.out.print(" ");
            }

            // stars and inner spaces
            int width = 2 * (n - i) + 1;

            for (int j = 1; j <= width; j++) {

                if (i == 1 || j == 1 || j == width) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}