package com.abelkin;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        String[] strings = s.split("[ !,?._'@]+");
        if (s.equals("")) {
            System.out.println(0);
            return;
        }
        System.out.println(strings.length);
        Arrays.stream(strings).forEach(System.out::println);
        scan.close();
    }
}
