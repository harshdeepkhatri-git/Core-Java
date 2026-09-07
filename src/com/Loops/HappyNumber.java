package com.Loops;
import java.util.Scanner;
public class HappyNumber {
    static void main() {


            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            int num = n;

            while (num != 1 && num != 4) {
                int sum = 0;

                while (num > 0) {
                    int digit = num % 10;
                    sum = sum + digit * digit;
                    num = num / 10;
                }

                num = sum;
            }

            if (num == 1) {
                System.out.println("Happy Number");
            } else {
                System.out.println("Not a Happy Number");
            }
        }
    }

