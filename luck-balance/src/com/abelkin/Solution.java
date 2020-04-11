package com.abelkin;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte n = scanner.nextByte();
        byte k = scanner.nextByte();
        ArrayList<Short> ls = new ArrayList<>();
        int luck = 0;
        while (n-- > 0) {
            short l = scanner.nextShort();
            byte t = scanner.nextByte();
            if (t == 0) {
                luck += l;
            } else {
                ls.add(l);
            }
        }
        Collections.sort(ls);

        for (int i = 0; i < ls.size(); i++) {
            if (i < ls.size() - k) {
                luck -= ls.get(i);
            } else {
                luck += ls.get(i);
            }
        }

        System.out.println(luck);

    }
}
