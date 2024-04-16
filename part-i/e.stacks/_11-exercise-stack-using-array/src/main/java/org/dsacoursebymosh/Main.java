package org.dsacoursebymosh;

public class Main {
    public static void main(String[] args) {
        var stack = new Stack();
        stack.push(1);
        stack.push(12);
        stack.push(13);
        stack.push(15);
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack);

        System.out.println(' ');

        var twoStacks = new TwoStacks();
        twoStacks.push1(1);
        twoStacks.push1(2);
        twoStacks.push2(3);
        twoStacks.push2(4);
        twoStacks.push1(5);
        twoStacks.push2(6);
        twoStacks.push1(7);
        System.out.println(twoStacks.peek1());
        System.out.println(twoStacks.peek2());
        System.out.println(twoStacks.pop1());
        System.out.println(twoStacks.pop2());
        System.out.println(twoStacks.peek1());
        System.out.println(twoStacks.peek2());
    }
}