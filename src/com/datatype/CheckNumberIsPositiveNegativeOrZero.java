package com.datatype;

import java.util.Scanner;

public class CheckNumberIsPositiveNegativeOrZero {



        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            String result = (n == 0) ? "Zero"
                    : (n > 0)
                    ? ((n % 2 == 0) ? "Positive Even" : "Positive Odd")
                    : ((n % 2 == 0) ? "Negative Even" : "Negative Odd");

            System.out.println(result);
        }
    }

