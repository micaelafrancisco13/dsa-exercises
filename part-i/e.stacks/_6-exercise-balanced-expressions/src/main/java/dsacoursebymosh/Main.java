package dsacoursebymosh;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String leftRegex  = "\\[|\\{|\\(|<";
        String rightRegex = "\\]|\\}|\\)|>";
        String input = "([1>)";
        String test = input.replaceAll("[^()\\[\\]{}<>]", "");
        System.out.println("test " + test);

        Stack<Character> stack = new Stack<>();
        var count = 0;
        for (var ch : test.toCharArray()) {
            if ((ch == '[' || (ch == '{') || (ch == '(') || (ch == '<'))) {
                ++count;
                stack.push(ch);
            }
        }

        System.out.println(count);
    }
}