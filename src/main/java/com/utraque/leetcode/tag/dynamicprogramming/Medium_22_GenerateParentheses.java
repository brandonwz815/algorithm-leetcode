package com.utraque.leetcode.tag.dynamicprogramming;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Medium_22_GenerateParentheses {

    public static void main(String[] args) {
        int n = 3;
        System.out.printf(" After: %s", generateParenthesis(n));
    }

    public static List<String> generateParenthesis(int n) {
        return f(n);
    }

    private static List<String> f(int n) {
        List<String> list = new ArrayList<>();

        if(n==1) {
            list.add("()");
            return list;
        }

        List<String> subList = f(n-1);

        Set<String> set = new HashSet<>();
        for (String s : subList) {
            for (int i = 0; i < s.length(); i++) {
                set.add(s.substring(0,i) + "()" + s.substring(i));
            }
        }

//        System.out.println(set);
        return new ArrayList<>(set);



//        return subList.stream().map(e-> {
//            Set<String> set = new HashSet<>();
//            for (int i =0; i< e.length(); i++) {
//                set.add(e.substring(i) + "()" + e.substring(i+1));
//            }
//            return new ArrayList(set).stream().flatMap(Stream::of);
//        })
////                .flatMap(Stream::of)
//                .collect(Collectors.toList());

    }

}
