package com.abelkin;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n-- > 0) {
            long k = scanner.nextLong();
            System.out.println(~k+4294967296L);
        }

    }
}
