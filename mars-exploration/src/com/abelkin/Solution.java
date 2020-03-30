package com.abelkin;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int counter = 0;

        for (int i = 0; i < s.length(); i+=3) {
            String etalon = "SOS";
            String s1 = s.substring(i, i+3);
            for (int j = 0; j < etalon.length(); j++) {
                if (etalon.charAt(j) - s1.charAt(j) != 0) {
                    counter++;
                }
            }
        }
        System.out.println(counter);

    }
}
