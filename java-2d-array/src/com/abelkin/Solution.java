package com.abelkin;

import java.util.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        scanner.close();

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = 0;
                for (int j1 = j; j1 < j+3; j1++) {
                    sum += arr[i][j1];
                    sum += arr[i+2][j1];
                }
                sum += arr[i+1][j+1];
                max = Math.max(max, sum);
            }
        }

        System.out.println(max);
    }
}
