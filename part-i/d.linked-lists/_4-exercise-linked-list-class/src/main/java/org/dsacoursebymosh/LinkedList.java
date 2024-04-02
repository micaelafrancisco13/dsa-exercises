package org.dsacoursebymosh;

public class LinkedList {
    private Node first;
    private Node last;

    public LinkedList() {
        lists = new Node[1];
    }

    private Node[] lists;
    private Node[] newLists;
    private int count;

    // addFirst
    public void addFirst(int data) {
        var node = new Node(data, null);
        if (lists[0] == null)
            last = node;
        else {
            if (count == lists.length) {
                newLists = new Node[lists.length * 2];
                System.arraycopy(lists, 0, newLists, 0, lists.length);
                lists = newLists;
            }
            node.setNext(last);
        }
        first = node;
        for (int i = count - 1; i >= 0; --i)
            lists[i + 1] = lists[i];
        lists[0] = node;
        count++;
    }

    // addLast
    public void addLast(int data) {
        var node = new Node(data, null);
        if (lists[0] == null)
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
        for (int i = 0; i < count; ++i)
            System.out.println(lists[i].getValue());
    }

    // deleteFirst
    public void deleteFirst() {

    }
    // deleteLast
    // contains
    // indexOf
}
