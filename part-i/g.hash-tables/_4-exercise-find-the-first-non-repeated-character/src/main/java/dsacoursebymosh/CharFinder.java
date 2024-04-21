package dsacoursebymosh;

import java.util.HashMap;
import java.util.Map;

public class CharFinder {
    public char findFirstNonRepeatingChar(String string) {
        Map<Character, Integer> map = new HashMap<>();

        System.out.println("map before " + map);

        var chars = string.toCharArray();
        for (var ch : chars) {
            var count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count + 1);
        }

        System.out.println("map after " + map);

        for (var ch : chars)
            if (map.get(ch) == 1)
                return ch;

        return Character.MIN_VALUE;
    }
}
