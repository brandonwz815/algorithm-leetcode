package _my.test;

import java.util.*;

public class TestForLoop {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 3);
        map.put(4, 4);

        System.out.printf("Before: %s\n", map.size());

        for (int i = 0; i < map.size(); i++) {
            if (i % 2 == 0) {
                map.remove(i);
            }
        }

        System.out.printf(" After: %s", map.size());
    }
}
