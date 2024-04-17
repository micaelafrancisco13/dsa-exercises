package org.example;

public class Main {
    public static void main(String[] args) {
        var arrayQueue = new ArrayQueue(5);
        arrayQueue.enqueue(1);
        arrayQueue.enqueue(2);
        arrayQueue.enqueue(3);
        arrayQueue.enqueue(4);
        arrayQueue.enqueue(5);
        arrayQueue.dequeue();
        arrayQueue.dequeue();
        System.out.println(arrayQueue);
        System.out.println(arrayQueue.peek());
        System.out.println(arrayQueue.isFull());
        System.out.println(arrayQueue.isEmpty());
    }
}