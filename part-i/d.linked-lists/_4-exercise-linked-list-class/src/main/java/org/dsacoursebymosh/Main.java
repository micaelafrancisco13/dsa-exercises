package org.dsacoursebymosh;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var list = new OptimizedLinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(13);
        list.addLast(40);
        list.addFirst(12);
        list.addLast(41);
        list.removeFirst();
        list.removeLast();
        list.addFirst(9);
        list.addLast(42);

        var contains = list.contains(213);
        var indexOf = list.indexOf(41);
        System.out.println(contains);
        System.out.println(indexOf);
        System.out.println("-----");
        System.out.println("Original: " + Arrays.toString(list.toArray()) + '\n');
        list.reverse();
        System.out.println("Reversed: " + Arrays.toString(list.toArray()));
    }
}