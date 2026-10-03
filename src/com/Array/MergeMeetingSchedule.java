package com.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeMeetingSchedule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Har interval [start, end] ko array mein rakhte hain
        ArrayList<int[]> intervals = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            intervals.add(new int[]{start, end});
        }

        // Start time ke hisaab se intervals sort karte hain
        intervals.sort((a, b) -> Integer.compare(a[0], b[0]));

        // Merged intervals yahan store honge
        ArrayList<int[]> result = new ArrayList<>();

        for (int[] current : intervals) {
            if (result.isEmpty()
                    || current[0] > result.get(result.size() - 1)[1]) {
                // Overlap nahi hai, toh naya interval add karo
                result.add(current);
            } else {
                // Overlap hai, toh pichhle interval ka end badhao
                int[] previous = result.get(result.size() - 1);
                previous[1] = Math.max(previous[1], current[1]);
            }
        }

        // Result print karo
        for (int[] interval : result) {
            System.out.print("[" + interval[0] + "," + interval[1] + "]");
        }

        sc.close();
    }
}