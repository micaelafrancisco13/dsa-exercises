package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(calculateSumOfArithmeticSeries(4));
        System.out.println(calculateFibonacciSeries(5));
    }

    // 4
    // 4 + (3)
    //       (2)
    //        (1)

    public static int calculateSumOfArithmeticSeries(int range) {
        if (range == 1)
            return 1;
        return range + calculateSumOfArithmeticSeries(range - 1);
    }

    // 0 =
    // 0 + 1 = 1 . 1
    // 1 + 1 = 2 . 2
    // 1 + 2 = 3 . 3
    // 2 + 3 = 5 . 4
    // 3 + 5 = 8 . 5

    public static int calculateFibonacciSeries(int length) {
        if ((length == 0) || (length == 1))
            return length;
        return calculateFibonacciSeries(length - 1) + calculateFibonacciSeries(length - 2);
    }
}