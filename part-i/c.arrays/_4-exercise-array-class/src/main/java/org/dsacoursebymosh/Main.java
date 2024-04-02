package org.dsacoursebymosh;

public class Main {
    public static void main(String[] args) {
        OptimizedArray array = new OptimizedArray(2);
        array.insert(10);
        array.insert(20);
        array.insert(30);
        array.insert(40);
        array.removeAt(1);
        array.insert(50);
        array.insert(60);
        array.removeAt(3);
        array.insert(70);
        array.insert(80);
        array.print();
        System.out.println(array.indexOf(30));
    }
}