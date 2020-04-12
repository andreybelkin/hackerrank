package com.abelkin;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        long n = scanner.nextLong();
        long wholeCounts = (s.length() - s.replace("a", "").length());
        wholeCounts *= n / s.length();
        long restLength = n % s.length();
        String restString = s.substring(0, (int)restLength);
        int restCount = (restString.length() - restString.replace("a", "").length());
        System.out.println(wholeCounts + restCount);
    }
}
