package com.abelkin;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), d = scanner.nextInt();
        int rest = (n - d) % n;
        n -= rest;
        ArrayList<Integer> a = new ArrayList<>();
        while (n-- > 0) {
            a.add(scanner.nextInt());
        }
        for (int i = 0; i < rest; i++) {
            a.add(i, scanner.nextInt());
        }
        a.forEach(x -> System.out.print(x + " "));

    }
}
