package dsacoursebymosh;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HashTable {
    private final List<LinkedList<Entry>> items;

    public HashTable(int size) {
        items = new ArrayList<>(size);
        for (int i = 0; i < size; ++i)
            items.add(i, null);
    }

    public void put(Entry entry) {
        var newLinkedList = new LinkedList<Entry>();
        var position = hash(entry.getKey());
        var linkedList = items.get(position);
        var existingEntry = checkDuplicateKey(entry.getKey());
        if (linkedList != null) {
            if (existingEntry != null)
                linkedList.remove(existingEntry);
            linkedList.push(entry);
        }
        else {
            newLinkedList.add(entry);
            items.set(position, newLinkedList);
        }
    }

    private int hash(int key) {
        return Math.abs(key) % items.size();
    }

    public String get(int key) {
        var list = getEntries(key);
        for (var entry : list)
            if (entry.getKey() == key)
                return entry.getValue();
        return null;
    }

    public Entry remove(int key) {
        var existingEntry = checkDuplicateKey(key);
        var list = getEntries(key);
        list.remove(existingEntry);
        return existingEntry;
    }

    private Entry checkDuplicateKey(int key) {
        var list = getEntries(key);
        if (list != null)
            for (var entry : list)
                if (entry.getKey() == key)
                    return entry;
        return null;
    }

    private LinkedList<Entry> getEntries(int key) {
        var position = hash(key);
        return items.get(position);
    }

    @Override
    public String toString() {
        List<List<String>> values = new ArrayList<>();
        for (var list : items) {
            var entryValues = new ArrayList<String>();
            if (list != null)
                for (var entry : list)
                    entryValues.add(entry.getValue());
            else
                entryValues.add(null);
            values.add(entryValues);
        }
        return String.valueOf(values);
    }
}
