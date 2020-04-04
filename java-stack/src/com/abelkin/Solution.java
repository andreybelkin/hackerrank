package com.abelkin;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String st = scanner.nextLine();
            Stack<Character> stack = new Stack<>();
            boolean er = false;
            for (int i = 0; i < st.length() && !er; i++) {
                Character ch = st.charAt(i);
                switch (ch) {
                    case '[':
                    case '(':
                    case '{':
                        stack.push(ch);
                        break;
                    case ']':
                        if (stack.empty()) {
                            er = true;
                            break;
                        }
                        Character ch1 = stack.pop();
                        if (!ch1.equals('[')) {
                            er = true;
                            break;
                        }
                        break;
                    case ')':
                        if (stack.empty()) {
                            er = true;
                            break;
                        }
                        ch1 = stack.pop();
                        if (!ch1.equals('(')) {
                            er = true;
                            break;
                        }
                        break;
                    case '}':
                        if (stack.empty()) {
                            er = true;
                            break;
                        }
                        ch1 = stack.pop();
                        if (!ch1.equals('{')) {
                            er = true;
                            break;
                        }
                        break;
                }
            }
            if (stack.empty() && !er) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

    }
}
