package org.example;

public class Main {
    public static void main(String[] args) {
        // note that this is a binary search tree
//        var tree1 = new Tree();
//        tree1.insert(7);
//        tree1.insert(4);
//        tree1.insert(9);
//        tree1.insert(1);
//        tree1.insert(6);
//        tree1.insert(8);
//        tree1.insert(10);
//
//        var tree2 = new Tree();
//        tree2.insert(3);
//        tree2.insert(1);
//        tree2.insert(2);
//
//        System.out.println(tree1.findNodesAtGivenDistance(2));
//        System.out.println(tree1.traverseLevelOrder());

        var tree3 = new Tree();
        tree3.insertUsingRecursion(3);
        tree3.insertUsingRecursion(1);
        tree3.insertUsingRecursion(2);
        System.out.println(tree3.traverseLevelOrder());
    }
}