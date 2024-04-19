package org.example;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        var arrayDeque = new ArrayDeque<Integer>();
        arrayDeque.add(10);
        arrayDeque.add(20);
        arrayDeque.add(30);
        arrayDeque.add(40);
        arrayDeque.add(50);
        arrayDeque.add(60);
        arrayDeque.add(70);
        arrayDeque.add(80);
        arrayDeque.add(90);
        arrayDeque.add(100);
        System.out.println(arrayDeque);
        System.out.println("Reversed " + QueueReverser.reverse(arrayDeque, 7));
    }
}