package org.example;

public class Tree {
    private static class Node {
        private final int value;
        private Node leftChild;
        private Node rightChild;

        private Node(int value, Node leftChild, Node rightChild) {
            this.value = value;
            this.leftChild = leftChild;
            this.rightChild = rightChild;
        }
    }

    private Node root;
    private int count;
    private int rows;

    public void insert(int value) {
        var node = new Node(value, null, null);
        if (count == 0) {
            root = node;
            ++rows;
        }
        else {
            var current = root;
            while (current != null) {
                Node traverse;
                if (value < current.value) {
                    traverse = current.leftChild;
                    if (traverse == null) {
                        current.leftChild = node;
                        rows = (current.rightChild == null) ? rows + 1 : 0;
                    }
                }
                else {
                    traverse = current.rightChild;
                    if (traverse == null) {
                        current.rightChild = node;
                        rows = (current.leftChild == null) ? rows + 1 : 0;
                    }
                }
                current = traverse;
            }
        }
        ++count;
    }

    public boolean find(int value) {
        var current = root;
        var present = false;
        while (current != null) {
            if (value < current.value)
                current = current.leftChild;
            else
                current = current.rightChild;
            if (current != null && current.value == value) {
                present = true;
                break;
            }
        }
        return present;
    }
}
