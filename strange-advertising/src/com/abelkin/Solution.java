package com.abelkin;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int shared = 5, sum = 0;

        for (int i = 0; i  < n; i++) {
            shared = shared / 2;
            sum += shared;
            shared *= 3;
        }

        System.out.println(sum);
    }
}
