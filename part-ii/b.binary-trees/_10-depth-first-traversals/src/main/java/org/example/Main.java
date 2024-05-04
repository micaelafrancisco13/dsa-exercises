package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var tree = new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);
        System.out.println(tree.find(13));
        System.out.println(tree.find(9));
        System.out.println("Pre-order depth " + Arrays.toString(tree.traversePreOrder()));
        System.out.println("In-order depth " + Arrays.toString(tree.traverseInOrder()));
        System.out.println("Post-order depth " + Arrays.toString(tree.traversePostOrder()));
        System.out.println("Height " + tree.height());
    }
}