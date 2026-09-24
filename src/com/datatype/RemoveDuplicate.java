package com.datatype;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int number = 534265432;
        int temp = number;
        int result = 0;
        int place = 1;

        while (temp > 0) {
            int digit = temp % 10;
            int count = 0;
            int check = number;

            while (check > 0) {
                if (check % 10 == digit) {
                    count++;
                }
                check /= 10;
            }

            if (count == 1) {
                result += digit * place;
                place *= 10;
            }

              temp/= 10;
        }

        System.out.println(result);
    }
}