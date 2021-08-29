package com.utraque.leetcode.tag.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

public class A_Medium_120_Triangle {

    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();

        List<Integer> list1 = new ArrayList<>();
        list1.add(2);

        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);

        List<Integer> list3 = new ArrayList<>();
        list3.add(6);
        list3.add(5);
        list3.add(7);

        List<Integer> list4 = new ArrayList<>();
        list4.add(4);
        list4.add(1);
        list4.add(8);
        list4.add(3);

        triangle.add(list1);
        triangle.add(list2);
        triangle.add(list3);
        triangle.add(list4);

        System.out.printf(" After: %s", minimumTotal(triangle));
    }

    private static int minimumTotal(List<List<Integer>> triangle) {
        return getMinTotal(triangle, 0, 0);
    }

    private static int getMinTotal(List<List<Integer>> triangle, int m, int n) {
//        if (m == triangle.size()) return 0;


        int base = triangle.get(0).get(0);

        int height = triangle.size();
        if (height == 1) return base;

        List<Integer> curLevelNodes = triangle.get(m);
//        int curVal = curLevelNodes.get(n);

        Integer node = curLevelNodes.get(n);

        if (m + 1 <= height) {
            int min = curLevelNodes.get(n);
            if (n < curLevelNodes.size()) {
                for (int i = n + 1; i < curLevelNodes.size(); i++) {
                    int cumulatedVal = node;
                    for (int j = n + 1; j <= i; j++) {
                        cumulatedVal += curLevelNodes.get(j);
                    }
                    int curVal = cumulatedVal + +lookDown(triangle, m, i);
                    if (curVal < min) {
                        min = curVal;
                    }
                }
            }
            if (n > 0) {
                for (int i = n - 1; i >= 0; i--) {
                    int cumulatedVal = node;
                    for (int j = n - 1; j < n - 1 - i && j >= 0; j--) {
                        cumulatedVal = curLevelNodes.get(j);
                    }
                    int curVal = cumulatedVal + lookDown(triangle, m, i);
                    if (curVal < min) {
                        min = curVal;
                    }
                }
            }
            int noMove = Math.min(node + lookDown(triangle, m + 1, n), node + lookDown(triangle, m + 1, n + 1));
            return Math.min(noMove, min);
        }
        return triangle.get(m).get(n);
    }

    private static int lookDown(List<List<Integer>> triangle, int m, int n) {
        return 0;
    }

}
