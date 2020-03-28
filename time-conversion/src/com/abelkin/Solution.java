package com.abelkin;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static void timeConversion(String s) {
        /*
         * Write your code here.
         */
        String suf = s.substring(8);
        String rest = s.substring(2, 8);
        int hour = Integer.parseInt(s.substring(0, 2));
        if (suf.equals("PM")) {
            if (hour != 12) {
                System.out.print(12 + hour);
            } else {
                System.out.print("12");
            }
            System.out.print(rest);
        } else {
            if (hour != 12) {
                System.out.print(s.substring(0,2));
            } else {
                System.out.print("00");
            }
            System.out.print(rest);
        }
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = scan.nextLine();

        timeConversion(s);

    }
}
