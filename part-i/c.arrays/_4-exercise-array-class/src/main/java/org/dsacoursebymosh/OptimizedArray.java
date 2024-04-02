package org.dsacoursebymosh;

public class OptimizedArray {
    private int count;
    private int[] items;

    public OptimizedArray(int length) {
        setLength(length);
    }

    public void insert(int element) {
        if (count == items.length) extendArray();
        items[count++] = element;
    }

    private void extendArray() {
        int[] newItems = new int[items.length * 2];
        System.arraycopy(items, 0, newItems, 0, items.length);
        items = newItems;
    }

    public void removeAt(int index) {
        if (index >= items.length || index < 0)
            throw new IllegalArgumentException("Removal of element at index " + index + " failed");

        for (int i = index; i < items.length - 1; ++i)
            items[i] = items[i + 1];

        --count;
    }

    public int indexOf(int element) {
        for (int i = 0; i < items.length; ++i)
            if (items[i] == element)
                return i;

        return -1;
    }

    public void print() {
        for (int i = 0; i < count; ++i) System.out.println(items[i]);
    }

    private void setLength(int length) {
        if (length < 1)
            throw new IllegalArgumentException("Array's length must be greater than 0");

        items = new int[length];
    }
}
