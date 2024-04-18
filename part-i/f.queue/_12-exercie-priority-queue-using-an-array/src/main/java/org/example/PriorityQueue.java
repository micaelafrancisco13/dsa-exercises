package org.example;

import java.util.Arrays;

public class PriorityQueue {
    private final int[] items;
    private int count;

    public PriorityQueue(int size) {
        items = new int[size];
    }

    public void add(int number) {
        if (count == items.length)
            throw new IllegalStateException("Queue is full");
        sort(number);
    }

    private void sort(int number) {
        items[count++] = number;
        for (int i = count - 1; i >= 0; --i) {
            if (items[i] > number) {
                items[i + 1] = items[i];
                items[i] = number;
            }
        }
    }

    public int remove() {
        return items[--count];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == items.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(items, 0, count));
    }
}
