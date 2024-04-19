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

        System.out.println(' ');
        
        var linkedListQueue = new LinkedListQueue();
        linkedListQueue.enqueue(1);
        linkedListQueue.enqueue(2);
        linkedListQueue.enqueue(3);
        linkedListQueue.enqueue(4);
        linkedListQueue.enqueue(5);
        System.out.println(linkedListQueue.dequeue());
        System.out.println(linkedListQueue);
        System.out.println(linkedListQueue.peek());
        System.out.println(linkedListQueue.size());
        System.out.println(linkedListQueue.isEmpty());
    }
}