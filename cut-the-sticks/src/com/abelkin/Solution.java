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
        int newMin = a[0], min, ind = 0;
        boolean wasMin = true;
        while (wasMin) {
            System.out.println(n-ind);
            wasMin = false;
            min = newMin;
            for (int i = ind; i < n; i++) {
                a[i] -= min;
                if (a[i] != 0 && !wasMin) {
                    newMin = a[i];
                    ind = i;
                    wasMin = true;
                }
            }
        }
    }
}
