package com.abelkin;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        while (n-- > 0) {
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();
            boolean was = false;
            for (char c : "abcdefghijklmnopqrstuvwxyz".toCharArray()) {
                if (s1.indexOf(c) > -1 && s2.indexOf(c) > -1) {
                    was = true;
                    break;
                }
            }
            if (was) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}
