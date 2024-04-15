package dsacoursebymosh;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String input = "(({1] + <2>))";
//        String input = "{{1)}";
        System.out.println("Is balanced? " + isExpressionBalanced(input));
    }

    public static boolean isExpressionBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        for (var ch : input.toCharArray()) {
            if ((ch == '[' || (ch == '{') || (ch == '(') || (ch == '<'))) {
                System.out.println("ch = " + ch);
                stack.push(ch);

            }

            if ((ch == ']' || (ch == '}') || (ch == ')') || (ch == '>'))) {
                if (stack.isEmpty())
                    return false;

                var top = stack.pop();
                System.out.println("ch = " + ch);
                System.out.println("top = " + top);
                System.out.println(' ');
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