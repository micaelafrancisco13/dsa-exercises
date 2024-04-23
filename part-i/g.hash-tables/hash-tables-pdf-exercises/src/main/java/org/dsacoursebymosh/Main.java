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

        System.out.println(' ');

        var hashMapLinearProbing = new HashMapLinearProbing(5);
        hashMapLinearProbing.push(2, "fortnight");
        hashMapLinearProbing.push(6, "clara bow");
        hashMapLinearProbing.push(4, "the black dog");
        hashMapLinearProbing.push(11, "guilty as sin");
        hashMapLinearProbing.push(1, "robin");
        System.out.println(hashMapLinearProbing);
        System.out.println("Removed " + hashMapLinearProbing.remove(4));
        System.out.println("Removed " + hashMapLinearProbing.remove(4));
        System.out.println("Get " + hashMapLinearProbing.get(6));
        System.out.println("Size " + hashMapLinearProbing.size());
        System.out.println(hashMapLinearProbing);
    }
}