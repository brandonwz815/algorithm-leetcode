package com.utraque.leetcode.tag.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

public class A_Medium_131_PalindromePartitioning_bf {

    public static void main(String[] args) {
        String s = "caabc";
        System.out.printf(" After: %s", partition(s));
    }

    public static List<List<String>> partition(String s) {

        List<List<String>> partitions = new ArrayList<>();

        int length = s.length();

        // substrings
        for (int i =0; i<length; i++) {
            for (int j=i+1; j<length +1;j++) {
                String ss = s.substring(i,j);
                List<String> pals = new ArrayList<>();

                System.out.println(ss);

                for(int k =0; k<ss.length(); k++ ) {
                    int start =k;
                    int end = k;
                    expand(s, start, end, pals);
                    partitions.add(pals);
                }

            }
        }

        return partitions;

    }

    public static void expand(String s, int start, int end, List<String> pals) {
        int length = s.length();

        while (start>=0 && end<length) {
            if(s.charAt(start)==s.charAt(end)) {
                pals.add(s.substring(start, end+1));
            }
            start--;
            end++;
        }
    }

}