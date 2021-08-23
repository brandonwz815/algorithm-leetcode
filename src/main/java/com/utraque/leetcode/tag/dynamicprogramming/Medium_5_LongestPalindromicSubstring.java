package com.utraque.leetcode.tag.dynamicprogramming;

/**
 *
 * Using the class design format of https://www.youtube.com/watch?v=oBt53YbR9Kk&t=1550s
 * based on constructing a tree
 *
 */
public class Medium_5_LongestPalindromicSubstring {

    public static void main(String[] args) {
//        String s = "babad";
        String s = "cbabadcef";
        System.out.printf(" After: %s", longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        Result result = longestPalindrome(s, "", false);
        return result.palString;
    }

    public static Result longestPalindrome(String s, String parent, boolean extensible) {
        int length = s.length();
        if (length == 1) return new Result(parent + s + parent, extensible);
        if (length == 2) {
            if (s.charAt(0) == s.charAt(1)) new Result(parent + s + parent, extensible);
            return null;
        }

        if (s.charAt(0) == s.charAt(length - 1)) {
            return longestPalindrome(s.substring(1, length - 1), s.substring(0, 1), true);
        }

        Result leftResult = longestPalindrome(s.substring(0, length - 1), "", false);
        Result rightResult = longestPalindrome(s.substring(1, length), "", false);

        if (leftResult == null && rightResult != null) {
            if (!rightResult.extensible)
                parent = "";
            return new Result(rightResult.palString + parent, extensible);
        }
        if (leftResult != null && rightResult == null) {
            if (!leftResult.extensible)
                parent = "";
            return new Result(parent + leftResult.palString, extensible);
        }
        if (leftResult == null && rightResult == null) return null;
        if (leftResult.palString.length() > rightResult.palString.length()) {
            if (!leftResult.extensible)
                parent = "";
            return new Result(parent + leftResult.palString, extensible);
        }
        if (!rightResult.extensible)
            parent = "";
        return new Result(rightResult.palString + parent, extensible);
    }

    static class Result {
        public String palString;
        public boolean extensible;

        public Result(String palString, boolean extensible) {
            this.palString = palString;
            this.extensible = extensible;
        }
    }

}



/**
 * Use s.substring() to get the first character
 * Don't use char, which is difficult to convert to a String
 */
