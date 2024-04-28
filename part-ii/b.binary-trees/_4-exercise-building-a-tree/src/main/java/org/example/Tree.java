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

        @Override
        public String toString() {
            return "Node = " + value;
        }
    }

    private Node root;
    private int count;

    public void insert(int value) {
        var node = new Node(value, null, null);
        if (count == 0) {
            root = node;
        }
        else {
            var current = root;
            while (current != null) {
                Node traverse;
                if (value < current.value) {
                    traverse = current.leftChild;
                    if (traverse == null) {
                        current.leftChild = node;
                    }
                }
                else {
                    traverse = current.rightChild;
                    if (traverse == null) {
                        current.rightChild = node;
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
