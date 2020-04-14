package com.abelkin;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        scanner.nextInt();
        scanner.nextLine();
        HashMap<String, Integer> hm = new HashMap<>();
        String string = scanner.nextLine();
        String[] strings = string.split(" ");
        for (String st : strings) {
            Integer val = hm.get(st);
            if (val == null) {
                hm.put(st, 1);
            } else {
                hm.put(st, ++val);
            }
        }
        string = scanner.nextLine();
        strings = string.split(" ");
        for (String st : strings) {
            Integer val = hm.get(st);
            if (val == null) {
                System.out.println("No");
                return;
            } else {
                val--;
                if (val == 0) {
                    hm.remove(st);
                } else {
                    hm.put(st, val);
                }
            }
        }
        System.out.println("Yes");
    }
}
