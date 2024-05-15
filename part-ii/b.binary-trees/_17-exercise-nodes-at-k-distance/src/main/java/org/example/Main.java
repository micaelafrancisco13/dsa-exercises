package org.example;

public class Main {
    public static void main(String[] args) {
        // note that this is a binary search tree
        var tree1 = new Tree();
        tree1.insert(7);
        tree1.insert(4);
        tree1.insert(9);
        tree1.insert(1);
        tree1.insert(6);
        tree1.insert(8);
        tree1.insert(10);

        var tree2 = new Tree();
        tree2.insert(2);
        tree2.insert(1);
        tree2.insert(3);

        System.out.println(tree1.isBinarySearchTree());
        System.out.println(tree2.isBinarySearchTree());
    }
}