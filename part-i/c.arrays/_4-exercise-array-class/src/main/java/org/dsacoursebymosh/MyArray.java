package org.dsacoursebymosh;

public class MyArray {
    private int[] items;
    private int[] copy;
    private int item;
    private int count;

    public MyArray(int length) {
        setLength(length);
    }

    public void insert(int item) {
        this.item = item;

        if (count == items.length) extendArray();
        else items[count++] = item;

    }

    public void removeAt(int index) {
        if (index >= items.length || index < 0)
            throw new IllegalArgumentException("Removal of element at index " + index + " failed");

        copy = new int[items.length - 1];
        for (int i = 0; i < copy.length; ++i) {
            if (i < index) copy[i] = items[i];
            else if (i == index) {
                copy[index] = items[index + 1];
                for (int j = index + 2; j < items.length; ++j)
                    copy[j - 1] = items[j];
            }
        }
        items = copy;
        --count;
    }

    public int indexOf(int element) {
        for (int i = 0; i < items.length; ++i)
            if (items[i] == element)
                return i;

        return -1;
    }

    public void print() {
        for (var element : items) System.out.println(element);
    }

    private void extendArray() {
        copy = new int[count + 1];

        System.arraycopy(items, 0, copy, 0, items.length);

        copy[count++] = item;
        items = copy;
    }

    private void setLength(int length) {
        if (length < 1)
            throw new IllegalArgumentException("Array's length must be greater than 0");

        items = new int[length];
    }
}