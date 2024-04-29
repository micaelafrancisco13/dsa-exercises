package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(calculateSumOfArithmeticSeries(4));
    }

    public static int calculateSumOfArithmeticSeries(int range) {
        if (range == 1)
            return 1;
        return range + calculateSumOfArithmeticSeries(range - 1);
    }
}