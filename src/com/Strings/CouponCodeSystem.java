package com.Strings;

import java.util.Scanner;

               // By using .Equals() Method

public class CouponCodeSystem {
    public static void main(String[] args) {
        String coupon = "Save 100";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coupon code if any  = ");
        String referralcode = sc.nextLine();

        if (referralcode.equals(coupon)) {
            System.out.println(" Congrats 🎉 !! Discount Applied on your purchase !! ");
        }
        else {
            System.out.println("Sorry 😕!! Better luck next time😉");
        }
        sc.close();
    }
}
