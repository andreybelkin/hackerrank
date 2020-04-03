package com.abelkin;

import java.math.BigInteger;
import java.util.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        scanner.close();
        BigInteger inte = new BigInteger(n);
        System.out.println(inte.isProbablePrime(1) ? "prime" : "not prime");
    }
}
