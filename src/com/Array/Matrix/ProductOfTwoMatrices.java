package com.Array.Matrix;

import java.util.Scanner;

public class ProductOfTwoMatrices {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows in matrix 1: ");
         int row1 = sc.nextInt();

         System.out.println("Enter the number of columns in matrix 1: ");
         int column1 = sc.nextInt();

         System.out.println("Enter the number of rows in matrix 2: ");
         int row2 = sc.nextInt();

         System.out.println("Enter the number of columns in matrix 2: ");
         int column2 = sc.nextInt();


         //condtion check;(if column of matrix 1 is Equal to row of matrix 2)

         if(column1 == row2) {

             int[] [] mat1 = new int [row1][column1];
             int[] [] mat2 = new int [row2][column2];

             int [][] result = new int [row1][column2];

             System.out.println("Enter the elements of matrix 1: ");
             for (int i = 0; i < row1; i++) {
                 for (int j = 0; j < column1; j++) {
                    mat1[i][j] = sc.nextInt();

                 }
             }
             System.out.println("Enter the elements of matrix 2: ");
             for(int i = 0; i<row2; i++){
                 for(int j = 0; j< column2; j++ ){
                     mat2[i][j] = sc.nextInt();
                 }
             }

             //product of both elements.

             for(int i = 0; i<row1; i++){
                 for(int j = 0; j<column2; j++){
                     for(int k = 0; k<column1; k++){
                         result[i][j] += mat1[i][k]*mat2[k][j];
                     }
                 }
             }

             //Output of given matrix 1.
             System.out.println("The Elements of Matrix 1: ");
             for(int i = 0; i< row1; i++ ){
                 for(int j = 0; j< column1; j++ ){
                     System.out.print(mat1[i][j] + "\t");
                 }
                 System.out.println();
             }

                // Output of given Matrix 2
             System.out.println("The Elements of Matrix 2: ");
             for(int i = 0; i< row2; i++){
                 for(int j = 0; j< column2; j++ ){
                     System.out.print(mat2[i][j] + "\t");
                 }
                 System.out.println();
             }

             // Result Output printing (Product).

             System.out.println("The product of the two matrices is: ");
             for(int[] row : result){
                 for(int element : row){
                     System.out.print(element + "\t");
                 }
                 System.out.println();
             }
         }

         // if the above if condition fails these else block statements will be executed.

         else {
             System.out.println("The Product is not possible because rows of matrix 1 and column of matrix 2 is not equal.");
         }
         sc.close();
    }
}
