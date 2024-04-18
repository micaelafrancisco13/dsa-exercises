package org.example;

import java.util.Stack;

public class QueueStack {
    private final Stack<Integer> stack1 = new Stack<>();
    private final Stack<Integer> stack2 = new Stack<>();
    private final int capacity;
    private int count;
    private int peek;

    public QueueStack(int capacity) {
        this.capacity = capacity;
    }

    public void add(int number) {
        if (count == capacity)
            throw new IllegalStateException("Queue is full");
        stack1.add(number);
        ++count;
    }

    public int remove() {
        if (stack1.empty())
            throw new IllegalStateException("Queue is empty");
        while (!stack1.empty())
            stack2.add(stack1.pop());
        var front = stack2.pop();
        var counter = 0;
        while (!stack2.empty()) {
            ++counter;
            var newFront = stack2.pop();
            if (counter == 1) peek = newFront;
            stack1.add(newFront);
        }
        --count;
        return front;
    }

    public int peek() {
        return peek;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == capacity;
    }

    @Override
    public String toString() {
        return String.valueOf(stack1);
    }
}
