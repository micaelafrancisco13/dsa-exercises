package org.dsacoursebymosh;

public class Main {
    public static void main(String[] args) {
        var stack = new Stack();
        stack.push(1);
        stack.push(12);
        stack.push(13);
        stack.push(15);
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack);
    }
}