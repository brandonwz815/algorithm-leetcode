package com.glassdoor.capitalone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeparatingStringByCurlyBrackets2 {

    public static void main(String[] args) {
        String s = "{hello{how are you}}";
        System.out.printf(" After: %s", Arrays.toString(parse(s)));
    }

    private static String[] parse(String s) {
        if (s == null || s.length() == 0) return new String[0];

        List<String> list = new ArrayList<>();
        char[] input = s.toCharArray();
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (i < input.length) {
            if (input[i] == '{' || input[i] == '}') {
                if (sb.length() > 0) {
                    list.add(sb.toString());
                    sb = new StringBuilder();
                }
            } else {
                sb.append(input[i]);
            }
            i++;
        }
        return list.toArray(new String[list.size()]);
    }
}
