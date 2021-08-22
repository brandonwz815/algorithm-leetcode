package com.glassdoor.capitalone;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SeparatingStringByCurlyBrackets {

    public static void main(String[] args) {
        String s = "{hello{how are you}}";
        System.out.printf(" After: %s", Arrays.toString(parse(s)));
    }

    private static String[] parse(String s) {
//        if(s==null || s.length()==0) return Collections.emptyList();
//
//        Queue<String> queue = new ArrayDeque<>();
        String[] tokens = s.split("[\\{\\}]");
        List<String> filtered = Stream.of(tokens).filter(e->e.length()>0).collect(Collectors.toList());
        return filtered.toArray(new String[filtered.size()]);
    }
}
