package com.Array.Matrix;

public class JaggedArrayMatrix {
    public static void main(String[]args){
        int [][] jagedArray = new int[5][];

        jagedArray[0] = new int[]{1};
        jagedArray[1] = new int[]{1,2};
        jagedArray[2] = new int[]{1,2,3};
        jagedArray[3] = new int[]{1,2,3,4};
        jagedArray[4] = new int[]{1,2,3,4,5};

       for(int [] row:  jagedArray){
           for(int element : row){
               System.out.print(element + " ");
           }
           System.out.println();
       }
    }
}
