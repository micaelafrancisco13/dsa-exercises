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

    public static int countPairsWithDiff(int[] array, int k) {
        k = Math.abs(k);
        Map<Integer, Integer> map = new HashMap<>();
        var numberOfPairs = 0;
        if (k == 0) {
            for (int i = 0; i < array.length; ++i) {
                for (int j = i + 1; j < array.length; ++j) {
                    var first = array[i];
                    var second = array[j];
                    if (Math.abs(first - second) == k)
                        if (!map.containsKey(first) && !map.containsKey(second))
                            map.put(first, second);
                }
            }
            numberOfPairs = map.size();
        }
        else {
            Set<Integer> set = new HashSet<>();
            for (var item : array)
                set.add(item);

            for (var current : set)
                if (set.contains(current + k))
                    ++numberOfPairs;
        }

        return numberOfPairs;
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
