package com.abelkin;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        while (n-- > 0) {
            list.add(sc.nextInt());
        }
        n = sc.nextInt();
        while (n-- > 0) {
            sc.nextLine();
            String s = sc.nextLine();
            if (s.equals("Insert")) {
                list.add(sc.nextInt(), sc.nextInt());
            } else {
                list.remove(sc.nextInt());
            }
        }
        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }
}
