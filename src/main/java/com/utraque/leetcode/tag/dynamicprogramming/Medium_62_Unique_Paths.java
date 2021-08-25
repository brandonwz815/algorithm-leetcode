package com.utraque.leetcode.tag.dynamicprogramming;

public class Medium_62_Unique_Paths {

    public static void main(String[] args) {
        int m = 3;
        int n = 7;
        System.out.printf(" After: %s", uniquePaths(m, n));
    }

    private static int uniquePaths(int m, int n) {
        return getUniquePaths(m, n, 0, 0);
    }

    private static int getUniquePaths(int m, int n, int curM, int curN) {
        if (curM > m || curN > n) {
            return 0;
        }
        if (curM < m - 1 && curN == n - 1) {
            return 1 ;
        }
        if (curM == m - 1 && curN < n - 1) {
            return 1;
        }

        return getUniquePaths(m,n,curM+1,curN) + getUniquePaths(m,n,curM, curN+1);
    }


//    private static int getUniquePaths(int m, int n, int curM, int curN) {
//        if (curM == m - 1 && curN == n - 1) return 0;
//
//        if (curM < m - 1 && curN == n - 1) {
//            return 1 + getUniquePaths(m, n, curM + 1, n - 1);
//        }
//        if (curM == m - 1 && curN < n - 1) {
//            return 1 + getUniquePaths(m, n, m - 1, curN + 1);
//        }
//        if (curM < m - 1 && curN < n - 1) {
//            return 1 + getUniquePaths(m, n, curM + 1, curN ) +
//                    1 +  getUniquePaths(m, n, curM, curN +1) ;
//        }
//        return 0;
//    }


}
