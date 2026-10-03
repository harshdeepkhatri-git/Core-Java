package com.Array;

import java.util.Scanner;

public class SalesTargetAchievement {
    public static int countSubarrays(int[] nums, int k) {
        int count = 0;

        for (int start = 0; start < nums.length; start++) {
            int sum = 0;

            for (int end = start; end < nums.length; end++) {
                sum += nums[end];

                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of an array: ");
        int n = scanner.nextInt(); // array ka size
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println("Enter the k : ");
        int k = scanner.nextInt();

        System.out.println(countSubarrays(nums, k));
        scanner.close();
    }
}
