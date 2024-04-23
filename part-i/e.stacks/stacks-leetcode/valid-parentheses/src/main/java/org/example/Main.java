package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // link: https://leetcode.com/problems/valid-parentheses/

        System.out.println("Result " + isValid("[]"));
        System.out.println("Result " + isValid("[]{}"));
        System.out.println("Result " + isValid("{()}"));
        System.out.println("Result " + isValid("([)]"));
        System.out.println("Result " + isValid("(}"));
    }

    private static boolean isValid(String string) {
        Stack<Character> stack = new Stack<>();
        for (var ch : string.toCharArray()) {
            if ((ch == '[' || (ch == '{') || (ch == '(') || (ch == '<')))
                stack.push(ch);
            if ((ch == ']' || (ch == '}') || (ch == ')') || (ch == '>'))) {
                if (stack.isEmpty())
                    return false;
                var top = stack.pop();
                if ((ch == ']' && top != '[') ||
                        (ch == '}' && top != '{') ||
                        (ch == ')' && top != '(') ||
                        (ch == '>' && top != '<'))
                    return false;
            }
        }

        return stack.empty();
    }
}