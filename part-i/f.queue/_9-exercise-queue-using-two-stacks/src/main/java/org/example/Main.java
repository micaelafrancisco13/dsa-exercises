package org.example;

public class Main {
    public static void main(String[] args) {
        var queueStack = new QueueStack(5);
        queueStack.add(1);
        queueStack.add(2);
        queueStack.add(3);
        queueStack.add(4);
        queueStack.add(5);
        System.out.println(queueStack.remove());
        queueStack.add(6);
        System.out.println(queueStack);
        System.out.println(queueStack.peek());
        System.out.println(queueStack.isEmpty());
        System.out.println(queueStack.isFull());
    }
}