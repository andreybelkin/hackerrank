package com.abelkin;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String string = scanner.nextLine();
            int pos = string.indexOf(' ');
            int num = Integer.parseInt(string.substring(pos + 1));
            string = string.substring(0, pos);
            System.out.printf("%-15s%03d%n", string, num);
        }
        System.out.println("================================");
    }
}
