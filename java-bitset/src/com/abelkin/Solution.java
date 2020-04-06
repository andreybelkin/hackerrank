package com.abelkin;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        int m = scanner.nextInt();
        scanner.nextLine();
        while (m-- > 0) {
            String operation = scanner.nextLine();
            String[] opArray = operation.split(" ");
            String command = opArray[0];
            String operand1 = opArray[1];
            String operand2 = opArray[2];
            switch (command) {
                case "AND":
                case "OR":
                case "XOR":
                    if (operand2.equals("1")) {
                        BitSet b = b2;
                        b2 = b1;
                        b1 = b;
                    }
                    break;
                case "FLIP":
                case "SET":
                    if (operand1.equals("2")) {
                        BitSet b = b2;
                        b2 = b1;
                        b1 = b;
                    }
            }

            switch (command) {
                case "AND": b1.and(b2);
                break;
                case "OR": b1.or(b2);
                break;
                case "XOR": b1.xor(b2);
                break;
                case "FLIP": b1.flip(Integer.parseInt(operand2));
                break;
                case "SET": b1.set(Integer.parseInt(operand2));
            }

            switch (command) {
                case "AND":
                case "OR":
                case "XOR":
                    if (operand2.equals("1")) {
                        BitSet b = b2;
                        b2 = b1;
                        b1 = b;
                    }
                    break;
                case "FLIP":
                case "SET":
                    if (operand1.equals("2")) {
                        BitSet b = b2;
                        b2 = b1;
                        b1 = b;
                    }
            }
            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }

    }
}
