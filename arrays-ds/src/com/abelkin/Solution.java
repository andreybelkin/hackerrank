package com.abelkin;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short n = scanner.nextShort();
        short[] a = new short[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextShort();
        }
        for (int i = n-1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }

    }
}
