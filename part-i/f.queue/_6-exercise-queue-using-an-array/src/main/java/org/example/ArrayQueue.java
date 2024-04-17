package org.example;

import java.util.Arrays;

public class ArrayQueue {
    private final int[] items;
    private int count;
    private int front;
    private int rear;

    public ArrayQueue(int size) {
        items = new int[size];
    }

    public void enqueue(int number) {
        if (count == items.length)
            throw new IllegalStateException("Queue is full");

        items[rear++] = number;
        count++;
    }

    public int dequeue() {
        if (count == 0)
            throw new IllegalStateException("Queue is empty");

        var deletedFront = items[front];
        items[front++] = 0;
        --count;
        return deletedFront;
    }

    public int peek() {
        return front;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
