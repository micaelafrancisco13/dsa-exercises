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
    private int[] items;
    private int index;

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

    public int[] traversePreOrder() {
        items = new int[count];
        traversePreOrder(root);
        return items;
    }

    private void traversePreOrder(Node root) {
        if (root == null)
            return;
        items[index++] = root.value;
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
    }

    public int[] traverseInOrder() {
        index = 0;
        items = new int[count];
        traverseInOrder(root);
        return items;
    }

    private void traverseInOrder(Node root) {
        if (root == null)
            return;
        traverseInOrder(root.leftChild);
        items[index++] = root.value;
        traverseInOrder(root.rightChild);
    }

    public int[] traversePostOrder() {
        index = 0;
        items = new int[count];
        traversePostOrder(root);
        return items;
    }

    private void traversePostOrder(Node root) {
        if (root == null)
            return;
        traversePostOrder(root.leftChild);
        traversePostOrder(root.rightChild);
        items[index++] = root.value;
    }
}
