package com.abelkin;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] p = new int[n+1];

        for (int i = 1; i <= n; i++) {
            p[scanner.nextInt()] = i;
        }

        for (int i = 1; i <= n; i++) {
            System.out.println(p[p[i]]);
        }

    }
}
