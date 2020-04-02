package com.abelkin;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<ArrayList<Integer>> array = new ArrayList<>(n);
        for (int i=0;i<n;i++) {
            int d = scanner.nextInt();
            array.add(new ArrayList<>(d));
            for (int j=0;j<d;j++) {
                array.get(i).add(scanner.nextInt());
            }
        }
        int q = scanner.nextInt();
        while (q-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (x > n) {
                System.out.println("ERROR!");
                continue;
            }
            if (y > array.get(x-1).size()) {
                System.out.println("ERROR!");
                continue;
            }
            System.out.println(array.get(x-1).get(y-1));
        }
    }
}