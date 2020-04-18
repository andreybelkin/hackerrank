package com.abelkin;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            min = Math.min(min, Math.abs(a[i]-a[i-1]));
        }
        System.out.println(min);

    }
}
