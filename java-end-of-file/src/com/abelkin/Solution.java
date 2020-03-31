package com.abelkin;

import java.util.*;

public class Solution{
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);
        int counter = 0;
        while (sc.hasNextLine()) {
            String st = sc.nextLine();
            System.out.println(++counter + " " + st);
        }
    }
}
