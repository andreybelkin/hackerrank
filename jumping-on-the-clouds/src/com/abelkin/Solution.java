package com.abelkin;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }
        int i = 0;
        int counter = 0;
        while (i < n-1) {
            if ((i+2) < n && c[i+2] == 0) {
                i += 2;
            } else {
                i++;
            }
            counter++;
        }

        System.out.println(counter);

    }
}
