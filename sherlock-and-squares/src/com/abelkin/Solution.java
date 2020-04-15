package com.abelkin;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println((int)(Math.floor(Math.sqrt(b))-Math.ceil(Math.sqrt(a))+1));
        }

    }
}
