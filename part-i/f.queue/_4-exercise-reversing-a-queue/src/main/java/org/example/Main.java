package org.example;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        reverse(queue);
        System.out.println(queue);
        System.out.println(queue.peek());
    }

    private static void reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty())
            stack.add(queue.remove());
        while (!stack.empty())
            queue.add(stack.pop());
    }
}