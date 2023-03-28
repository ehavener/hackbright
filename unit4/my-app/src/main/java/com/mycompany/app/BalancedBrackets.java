package com.mycompany.app;

import java.util.Stack;

public class BalancedBrackets {
    public static boolean balancedBrackets(String input) {
        Stack<Character> s = new Stack<Character>();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ')') {
                if (!s.empty() && s.peek() == '(') {
                    s.pop();
                } else {
                    return false;
                }
            } else if (input.charAt(i) == '(') {
                s.add('(');
            }
        }

        return s.isEmpty() ? true : false;
    }

    public static void main(String args[]) {
        String input = "(()))";
        System.out.println(balancedBrackets(input));
    }
}
