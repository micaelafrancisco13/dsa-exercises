package org.example;

public class Main {
    public static void main(String[] args) {
        // tree (root)
        // node (value, leftChild, rightChild)
        // insert(int value)
        // find(int value): boolean
        var tree = new Tree();
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(6);
        tree.insert(1);
        tree.insert(8);
        tree.insert(12);
        tree.insert(18);
        tree.insert(17);
        System.out.println(tree.find(13));
        System.out.println(tree.find(9));
    }
}