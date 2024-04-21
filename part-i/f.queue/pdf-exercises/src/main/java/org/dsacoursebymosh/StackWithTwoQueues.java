package org.dsacoursebymosh;

import java.util.ArrayDeque;

public class StackWithTwoQueues {
    private final ArrayDeque<Integer> arrayDeque1;
    private final ArrayDeque<Integer> arrayDeque2;
    private int count;
    private int peek;

    public StackWithTwoQueues() {
        arrayDeque1 = new ArrayDeque<>();
        arrayDeque2 = new ArrayDeque<>();
    }

    public void push(int number) {
        arrayDeque1.add(number);
        ++count;
        peek = number;
    }

    public int pop() {
        if (count == 0)
            throw new IllegalStateException("Queue is empty");
        var top = 0;
        var counter = 0;
        var originalSize = arrayDeque1.size();
        while (!arrayDeque1.isEmpty()) {
            var item = arrayDeque1.pop(); // 11,
            ++counter;
            if (counter < originalSize)
                arrayDeque2.add(item);
            else top = item;
        }
        counter = 0;
        while (!arrayDeque2.isEmpty()) {
            ++counter;
            var item = arrayDeque2.pop();
            if (counter == originalSize - 1)
                peek = item;
            arrayDeque1.add(item);
        }
        --count;
        return top;
    }

    public int peek() {
        if (count == 0)
            throw new IllegalStateException("Queue is empty");
        return peek;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        return String.valueOf(arrayDeque1);
    }
}
