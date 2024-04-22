package org.dsacoursebymosh;

public class Main {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 2, 3, 3, 3, 4 };
        int[] array2 = { 1, 7, 5, 9, 2, 12, 3, 11 };
        int[] array3 = { 3, 2, 4 };
        int[] array4= { 3, 1, 4, 1, 5 };

        System.out.println("Most frequent " + HashTableExercises.mostFrequent(array1));
        System.out.println("Count pairs with difference " + HashTableExercises.countPairsWithDiff(array4, 2));
        var addends = HashTableExercises.twoSum(array3, 6);
        var addend1 = addends[0];
        var addend2 = addends[1];
        System.out.println("Two sum indices [" + addend1 + ", " + addend2 + ']');
    }
}