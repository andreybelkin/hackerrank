package com.abelkin;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String st = scanner.next();
        boolean palindrom = true;
        for (int i = 0; i < st.length()/2 && palindrom; i++) {
            if (st.charAt(i) != st.charAt(st.length() - 1 - i)) {
                palindrom = false;
            }
        }
        System.out.println(palindrom ? "Yes" : "No");
    }
}
