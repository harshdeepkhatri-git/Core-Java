package com.Array.Matrix;

import java.util.Scanner;

public class SumOfTwoMatrices {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows of matrix 1: ");
        int row1 = sc.nextInt();

        System.out.println("Enter the number of columns of matrix 1: ");
        int column1 = sc.nextInt();

        System.out.println("Enter rows of matrix 2: ");
        int row2 = sc.nextInt();

        System.out.println("Enter the number of columns of matrix 2: ");
        int column2 = sc.nextInt();


          // Check condition Wheather both rows and columns of both matrices are equal or not.

        if (row1 == row2 && column1 == column2) {

            int[][] mat1 = new int[row1][column1];
            int[][] mat2 = new int[row2][column2];

            int[][] result = new int[row1][column2];

            System.out.println("Enter the elements of the matrix 1: ");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < column1; j++) {
                    mat1[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter the elements of the matrix 2: ");
            for (int i = 0; i < row2; i++) {
                for (int j = 0; j < column2; j++) {
                    mat2[i][j] = sc.nextInt();
                }
            }

            //Sum of two matrices.

            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < column1; j++) {
                    result[i][j] = mat1[i][j] + mat2[i][j];
                }
            }

            // Output

            System.out.println("The given matrix 1: ");
            for(int i = 0; i < row1; i++) {
                for(int j = 0; j < column1; j++) {
                    System.out.print(mat1[i][j] + " ");
                }
                System.out.println();
            }


            System.out.println("The given matrix 2: ");
            for(int i = 0; i < row1; i++) {
                for(int j = 0; j < column1; j++) {
                    System.out.print(mat2[i][j] + " ");
                }
                System.out.println();
            }


            System.out.println("Addition of matrices : ");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < column1; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Addition not allowed because matrices are not in same order.");
        }
        sc.close();

    }
}