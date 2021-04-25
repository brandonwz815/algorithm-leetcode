package nick.white;

import java.util.HashMap;
import java.util.Map;

/**
 * O(n) instead of O(n2)
 */
public class Easy_771_46_JewelsAndStones__ {

    public static void main(String[] args) {
        String J = "aA";
        String S = "aAAbbbb";
        System.out.printf("Output is %d\n", numJewelsInStones(J, S));
    }

    public static int numJewelsInStones(String J, String S) {
        int numJewels = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (char c : S.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (char c : J.toCharArray()) {
            if (map.containsKey(c)) {
                numJewels += map.get(c);
            }
        }

        return numJewels;
    }
}
