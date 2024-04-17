package org.dsacoursebymosh;

import java.util.Arrays;

public class Stack {
    private int[] items = new int[1];
    private int count;
    private int min;

    public void push(int number) {
        if (count == items.length) { // or throw new StackoverflowError()
            int[] itemsCopy = new int[count * 2];
            System.arraycopy(items, 0, itemsCopy, 0, items.length);
            items = itemsCopy;
        }
        // input : 5, 3, 4, 1, 2
        // min : 5, 3, 1
        items[count++] = number;
        if (count == 1) min = number;
        if (number < min)
            min = number;
    }

    public int pop() {
        if (count == 0) throw new IllegalStateException("Stack is empty");
        var top = items[count - 1];
        --count;
        return top;
    }

    public int peek() {
        if (count == 0) throw new IllegalStateException("Stack is empty");
        return items[count - 1];
    }

    public int min() {
        return min;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
