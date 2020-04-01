package com.abelkin;

import java.util.Scanner;

public class Solution {

    private static boolean isAnagram(String a, String b) {
        byte[] numLetters = new byte[26];
        if (a.length() != b.length()) {
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();
        for (int i = 0; i < a.length(); i++) {
            numLetters[a.charAt(i) - 'a']++;
            numLetters[b.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (numLetters[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
