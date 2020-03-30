package com.abelkin;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }
        byte e = 100;
        int i = 0;
        do {
            if (c[i] == 1) {
                e -= 2;
            }
            i = (i + k) % n;
            e--;
        } while (i != 0);

        System.out.println(e);

    }
}
