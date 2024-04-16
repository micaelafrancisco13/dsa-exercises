package org.dsacoursebymosh;

import java.util.Arrays;

public class TwoStacks {
    private int[] items = new int[1];
    private int count;
    private int lastIndex1;
    private int lastIndex2;
    private int previousLastIndex1;
    private int previousLastIndex2;

    public void push1(int number) {
        checkStack();
        previousLastIndex1 = lastIndex1;
        lastIndex1 = count;
        items[count++] = number;
    }

    public void push2(int number) {
        checkStack();
        previousLastIndex2 = lastIndex2;
        lastIndex2 = count;
        items[count++] = number;
    }

    private void checkStack() {
        if (count == items.length) { // or throw new StackoverflowError()
            int[] itemsCopy = new int[count * 2];
            System.arraycopy(items, 0, itemsCopy, 0, items.length);
            items = itemsCopy;
        }
    }

    public int pop1() {
        var top = pop(lastIndex1);
        lastIndex1 = previousLastIndex1;
        return top;
    }

    public int pop2() {
        var top = pop(lastIndex2);
        lastIndex2 = previousLastIndex2;
        return top;
    }

    private int pop(int lastIndex) {
        if (count == 0) throw new IllegalStateException("Stack is empty");
        var top = 0;

        if (lastIndex != count - 1) {
            for (int i = 0; i < count; ++i)
                if (i == lastIndex)
                    top = items[i];

            for (int i = top; i < count - 1; ++i)
                items[i] = items[i + 1];
        }
        else top = items[count - 1];
        --count;
        return top;
    }

    public Object peek1() {
        return peek(lastIndex1);
    }

    public Object peek2() {
        return peek(lastIndex2);
    }

    private Object peek(int lastIndex) {
        if (count == 0) throw new IllegalStateException("Stack is empty");
        for (int i = 0; i <= count; ++i)
            if (i == lastIndex)
                return items[i];
        return null;
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
