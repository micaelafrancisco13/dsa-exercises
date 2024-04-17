package org.example;

import java.util.Arrays;

public class ArrayQueue {
    private int[] items;
    private int count;
    private int front;
    private int dequeue;

    public ArrayQueue(int size) {
        items = new int[size];
    }

    public void enqueue(int number) {
        if (count == items.length) throw new IllegalStateException("Queue is full");
        items[count++] = number;
        if (count == 1) front = number;
    }

    public void dequeue() {
        if (count == 0) throw new IllegalStateException("Queue is empty");
        if (count == 1) items = new int[0];
        else front = items[++dequeue];
        --count;
    }

    public int peek() {
        return front;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == items.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(items, dequeue, items.length));
    }
}
