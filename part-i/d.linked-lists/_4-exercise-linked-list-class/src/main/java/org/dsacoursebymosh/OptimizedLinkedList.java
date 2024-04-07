package org.dsacoursebymosh;

import java.util.NoSuchElementException;

public class OptimizedLinkedList {
    public static class Node {
        private final int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public void addFirst(int item) {
        var node = new Node(item);
        if (isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
        size++;
    }

    public void addLast(int item) {
        var node = new Node(item);
        if (isEmpty()) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public void removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last) {
            first = last = null;
        } else {
            var second = first.next;
            first.next = null;
            first = second;
        }
        size--;
    }

    public void removeLast() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last) {
            first = last = null;
        } else {
            last = getPrevious(last);
            if (last != null) last.next = null;
        }
        size--;
    }

    private Node getPrevious(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public int indexOf(int item) {
        int index = 0;
        var current = first;
        while (current != null) {
            if (current.value == item) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    private boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return size;
    }

    public int[] toArray() {
        int[] array = new int[size];
        var index = 0;
        var current = first;
        while (current != null) {
            array[index] = current.value;
            current = current.next;
            index++;
        }
        return array;
    }

    public void reverse() {
        if (isEmpty()) return;

        var originalLast = last;
        var current = first;
        var previous = first;
        while (current != null) {
            var originalNext = current.next;
            if (current == first) {
                last = first;
                last.next = null;
            }
            else current.next = previous;
            if (current == originalLast) first = current;
            previous = current;
            current = originalNext;
        }
    }

    public Node getKthNodeFromTheEnd(int position) {
        if (position > size || position < 1)
            throw new IllegalArgumentException("Position is invalid");

        if (position == size)
            return first;
        if (position == 1)
            return last;

        var current = first;
        while (current != null) {
            var end = current;
            for (int i = 1; i <= position - 1; ++i)
                end = end.next;
            if (end == last) break;
            current = current.next;
        }

        return current;
    }

    public Node[] printMiddle() {
        if (isEmpty()) throw new NoSuchElementException("Linked list is empty");

        var startIndex = 0.0;
        if (size % 2 == 0) startIndex = (double) size / 2;
        else startIndex = (((double) size / 2) + 0.5);

        var nodes = new Node[2];
        var start = first;
        for (int i = 1; i <= startIndex - 1; ++i)
            start = start.next;
        nodes[0] = start;
        if (size % 2 == 0) nodes[1] = start.next;
        else nodes[1] = null;

        return nodes;
    }
}