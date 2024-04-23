package org.dsacoursebymosh;

import java.util.ArrayList;
import java.util.Arrays;

public class HashMapLinearProbing {
    private static class Entry {
        private final int key;
        private final String value;

        private Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private final Entry[] items;
    private int position;
    private int count;

    public HashMapLinearProbing(int size) {
        this.items = new Entry[size];
        Arrays.fill(items, null);
    }

    public void push(int key, String value) {
        var entry = new Entry(key, value);
        position = hash(key);
        var existingEntry = items[position];
        if (existingEntry != null)
            position = performLinearProbing();
        items[position] = entry;
        ++count;
    }

    public String get(int key) {
        var existingEntry = items[hash(key)];
        if (existingEntry != null)
            return existingEntry.value;
        return null;
    }

    public String remove(int key) {
        var position = hash(key);
        var existingEntry = items[position];
        if (existingEntry != null) {
            items[position] = null;
            return existingEntry.value;
        }
        return null;
    }

    public int size() {
        return count;
    }

    private int performLinearProbing() {
        for (int i = position; i < items.length; ++i)
            if (items[i] == null) return i;
        for (int i = 0; i < position; ++i)
            if (items[i] == null) return i;
        throw new IllegalStateException("Hash table is full");
    }

    private int hash(int key) {
        return Math.abs(key) % items.length;
    }

    @Override
    public String toString() {
        var values = new ArrayList<>();
        for (int i = 0; i < items.length; ++i)
            values.add(null);
        for (int i = 0; i < items.length; ++i) {
            if (items[i] != null) {
                values.set(i, items[i].key + "=" + items[i].value);
            }
        }
        return String.valueOf(values);
    }
}
