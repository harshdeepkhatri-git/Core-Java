package com.Array;

public class ArrayTraversalMatrix {
    public static void main(String[] args) {
        int [] [] [] array = {{{1, 2, 3}, {4, 5, 6}}, {{7, 8, 9}, {10, 11, 12}}};
        for (int [] [] matrix : array) {
            for (int [] row: matrix ){
                for(int elements: row){
                    System.out.print(elements + "\t ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
