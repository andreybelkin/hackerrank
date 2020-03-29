package com.abelkin;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int s = scanner.nextInt();
            int res = (s + (m - 1) % n);
            res = (res > n) ? res - n : res;
            System.out.println(res);
        }
        // the better way was https://www.hackerrank.com/challenges/save-the-prisoner/forum/comments/265315
        // to count from zero to use modular without correction res - n
        // and only one correction at the end:
        // ((s-1) + (m-1)) % n +1
    }
}
