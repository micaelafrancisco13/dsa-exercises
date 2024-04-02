package org.dsacoursebymosh;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

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

        list.print();
    }
}