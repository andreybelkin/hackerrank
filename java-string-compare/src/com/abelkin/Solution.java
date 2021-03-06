package com.abelkin;

import java.util.Scanner;

public class Solution {

    private static String getSmallestAndLargest(String s, int k) {

        String smallest = "z";
        String largest = "A";

        for (int i = 0; i < s.length()-k+1; i++) {
            String subs = s.substring(i, i+k);
            if (subs.compareTo(smallest) < 0) {
                smallest = subs;
            }
            if (subs.compareTo(largest) > 0) {
                largest = subs;
            }

        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
