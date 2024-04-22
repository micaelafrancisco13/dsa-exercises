package org.dsacoursebymosh;

import java.util.Arrays;

public class LinkedListQueue {
    public static class Node {
        private final int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public void enqueue(int item) {
        var node = new Node(item);
        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
        ++size;
    }

    public int dequeue() {
        if (isEmpty())
            throw new IllegalStateException("Queue is empty");

        var front = first;
        if (first == last)
            first = last = null;
        else {
            var second = first.next;
            first.next = null;
            first = second;
        }
        --size;

        return front.value;
    }

    public int peek() {
        if (isEmpty())
            throw new IllegalStateException("Queue is empty");
        return first.value;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public String toString() {
        int[] items = new int[size];
        var current = first;
        var count = 0;
        while (current != null) {
            items[count++] = current.value;
            current = current.next;
        }
        return Arrays.toString(items);
    }
}
