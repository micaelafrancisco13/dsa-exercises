package org.example;

public class Main {
    public static void main(String[] args) {
        // tree (root)
        // node (value, leftChild, rightChild)
        // insert(int value)
        // find(int value): boolean
        var tree = new Tree();
        tree.insert(8);
        tree.insert(4);
        tree.insert(7);
        tree.insert(1);
        tree.insert(10);
        tree.insert(9);
        tree.insert(6);
        System.out.println(tree.find(13));
        System.out.println(tree.find(9));
    }
}