package org.dsacoursebymosh;

public class LinkedList {
    private Node first;
    private Node last;
    private Node[] lists;
    private Node[] newLists;
    private int count;

    public LinkedList() {
        lists = new Node[1];
    }

    // addFirst
    public void addFirst(int data) {
        var node = new Node(data, null);
        if (count == 0)
            last = node;
        else {
            if (count == lists.length) {
                newLists = new Node[lists.length * 2];
                System.arraycopy(lists, 0, newLists, 0, lists.length);
                lists = newLists;
            }
            node.setNext(first);
        }
        for (int i = count - 1; i >= 0; --i)
            lists[i + 1] = lists[i];
        lists[0] = first = node;
        count++;
    }

    // addLast
    public void addLast(int data) {
        var node = new Node(data, null);
        if (count == 0)
            first = node;
        else {
            if (count == lists.length) {
                newLists = new Node[lists.length * 2];
                System.arraycopy(lists, 0, newLists, 0, lists.length);
                lists = newLists;
            }
            last.setNext(node);
        }
        last = node;
        lists[count++] = node;
    }

    public void print() {
        for (int i = 0; i < count; ++i) {
            if (lists[i].getNext() != null)
                System.out.println(lists[i].getValue() +  " -> " + lists[i].getNext().getValue());
            else
                System.out.println(lists[i].getValue() +  " -> " + "null");
        }
    }

    // remove first node
    public void removeFirst() {
        if (count == 0)
            throw new RuntimeException("Cannot remove first node. Linked list is empty");

        for (int i = 1; i < count; ++i)
            lists[i - 1] = lists[i];
        --count;

        first.setNext(null);
        first = lists[0];
    }

    // remove last node
    public void removeLast() {
        if (count == 0)
            throw new RuntimeException("Cannot remove last node. Linked list is empty");

        if (count == 1) {
            first = null;
            last = null;
        }
        else {
            last = lists[count - 2];
            last.setNext(null);
            lists[count - 1] = null;
        }
        --count;
    }

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }

    // contains
    // indexOf
}
