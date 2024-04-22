package org.dsacoursebymosh;

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

        items[rear] = number;
        rear = (rear + 1) % items.length;
        count++;

        // [0, 0, 3, 4, 5]
        // if 6 is added  -> at index 0
        // if 7 is added  -> at index 1
        // if 8 is added  -> at index 2
        // if 9 is added  -> at index 3
        // if 10 is added -> at index 4
        // if 11 is added -> at index 0
    }

    public int dequeue() {
        if (count == 0)
            throw new IllegalStateException("Queue is empty");

        var deletedFront = items[front];
        items[front] = 0;
        front = (front + 1) % items.length;
        --count;
        return deletedFront;
    }

    public int peek() {
        return ++front;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == items.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
