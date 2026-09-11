package com.Loops;

import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int sum =0;
        while(temp != 0){

            int lastDigit = 0;
            lastDigit = temp % 10;
            sum += lastDigit;
            temp /= 10;
        }

        int lastdigit = 0;
        int product = 1;
        while(num!= 0){
           lastdigit = num % 10;
            product *= lastdigit;
            num /= 10;
        }
        if(sum == product){
            System.out.println("It is a spy number");
        }
        else{
            System.out.println("It is not a spy number");
        }
    }
}
