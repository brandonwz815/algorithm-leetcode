package nick.white;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 *   Review deleting mapping from a Map during a for loop
 */
public class Medium_RV_846_35_HandOfStraights__ {

    public static void main(String[] args) {
        int[] hand = new int[]{1, 2, 3, 6, 2, 3, 4, 7, 8};
        System.out.println(isNStraightHands(hand, 3));

        int[] hand2 = new int[]{1, 2, 3, 4, 5};
        System.out.println(isNStraightHands(hand2, 4));
    }

    public static boolean isNStraightHands(int[] hand, int W) {
        if (hand.length % W != 0) {
            return false;
        }

        SortedMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < hand.length; i++) {
            int element = hand[i];
            if (!map.containsKey(element)) {
                map.put(element, 0);
            }
            map.put(element, map.get(element) + 1);
        }

//        Set<Integer> keys = map.keySet();
//        Iterator<Integer> it = keys.iterator();
//        while (it.hasNext()) {
//            Integer first = it.next();
//            if (map.get(first) == 0) {
//                it.remove();
//                continue;
//            }
//            else {
//
//            }
//        }
//        return false;

        while (map.size() > 0) {
            Integer firstKey = map.firstKey();
            for (int i = firstKey; i < firstKey + W; i++) {
                Integer value = map.get(i);
                if (value == null) {
                    return false;
                }
                if (value == 1) {
                    map.remove(i);
                } else {
                    map.replace(i, value, value - 1);
                }
            }
        }
        return true;
    }

}
