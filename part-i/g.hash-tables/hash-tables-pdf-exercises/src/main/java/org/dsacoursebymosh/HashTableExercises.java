package org.dsacoursebymosh;

import java.util.HashMap;
import java.util.Map;

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
}
