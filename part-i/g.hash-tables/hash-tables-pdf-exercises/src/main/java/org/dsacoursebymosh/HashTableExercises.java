package org.dsacoursebymosh;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
        Set<Integer> set = new HashSet<>();
        for (var item : array)
            set.add(item);

        var numberOfPairs = 0;
        for (var current : set)
            if (set.contains(current + difference))
                ++numberOfPairs;

        return numberOfPairs;
    }
}
