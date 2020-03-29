package com.abelkin;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int counter = 0, n1 = n;
            while (n > 0) {
                int z = n % 10;
                if ((z != 0) && (n1 % z == 0)) {
                    counter++;
                }
                n /= 10;
            }
            System.out.println(counter);
        }
    }
}
