package com.utraque.leetcode.tag.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Medium_131_PalindromePartitioning {

    public static void main(String[] args) {
        String s = "caabc";
        System.out.printf(" After: %s", partition(s));
    }

    public static List<List<String>> partition(String s) {
        return getPartitions(s);
    }

    public static List<List<String>> getPartitions(String s) {

        List<List<String>> partitions = new ArrayList<>();

        if (s.length() == 2 && (s.charAt(0) == s.charAt(1))) {
            List<String> lst = new ArrayList<>();
            lst.add(s);
            partitions.add(lst);
            return partitions;
        }

        if (s.length() == 1) {
            List<String> lst = new ArrayList<>();
            lst.add(s);
            partitions.add(lst);
            return partitions;
        }

        int length = s.length();

        for (int i = 0; i <= length - 1; i++) {
            String subString = s.substring(0, i + 1);
            if (isPalindromic(subString)) {
                List<List<String>> subList = getPartitions(s.substring(i + 1));
                List<List<String>> newList = subList.stream().map(l -> {
                            List<String> list = new ArrayList<>();
                            list.add(subString);
                            list.addAll(l);
                            return list;
                        })
                        .collect(Collectors.toList());
                partitions.addAll(newList);
            }
        }
        return partitions;
    }

    private static boolean isPalindromic(String s) {
        int length = s.length();
        for (int i = 0; i < length / 2; i++) {
            if (s.charAt(i) != s.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

}

/**
 *  Pay attention to the indexes in isPalindromic()
 */