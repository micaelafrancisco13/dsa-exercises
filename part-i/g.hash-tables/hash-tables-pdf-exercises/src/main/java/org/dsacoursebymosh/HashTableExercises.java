package org.dsacoursebymosh;

import java.util.*;

public class HashTableExercises {
    public static int mostFrequent(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();

        for (var item : array) {
            var count = map.getOrDefault(item, 0);
            map.put(item, count + 1);
        }

//        var max = Collections.max(map.values());
        var max = 0;
        for (var value : map.values())
            if (value > max)
                max = value;

        return max;
    }

    public static int countPairsWithDiff(int[] array, int difference) {
        
    }

    public static int[] twoSum(int[] array, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] indices = { 0, 0 };
        var index = 0;
        for (var item : array)
            map.put(index++, item);

        var entries = map.entrySet();
        for (var current : entries) {
            for (var rest : entries) {
                var currentValue = current.getValue();
                var nextValue = rest.getValue();
                if ((!Objects.equals(current.getKey(), rest.getKey())) && (currentValue + nextValue == target)) {
                    indices[0] = current.getKey();
                    indices[1] = rest.getKey();
                    return indices;
                }
            }
        }
        return indices;
    }
}
