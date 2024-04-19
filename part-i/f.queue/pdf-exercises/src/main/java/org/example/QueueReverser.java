package org.example;

import java.util.ArrayDeque;
import java.util.Stack;

public class QueueReverser {
    private static int tracker;
    private static final Stack<Integer> stack = new Stack<>();
    private static final ArrayDeque<Integer> newArrayDequeue = new ArrayDeque<>();

    public static ArrayDeque<Integer> reverse(ArrayDeque<Integer> arrayDeque, int counter) {
        if (counter > arrayDeque.size())
            throw new IllegalStateException("Number of elements to be reversed cannot be greater than the queue's size");
        while (tracker < counter) {
            stack.add(arrayDeque.remove());
            ++tracker;
        }
        while (!stack.empty())
            newArrayDequeue.add(stack.pop());
        while (!arrayDeque.isEmpty())
            newArrayDequeue.add(arrayDeque.remove());
        return newArrayDequeue;
    }
}
