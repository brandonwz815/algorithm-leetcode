package nick.white;

import java.util.*;

public class A_Medium_17_92_LetterCombinationOfAPhoneNumber {

    public static void main(String[] args) {
        String digits = "23";
        System.out.printf(" After: %s\n", letterCombinations(digits));
    }

    public static List<String> letterCombinations(String digits) {
//        Map<Integer, String> keypad = new HashMap<>();
//        keypad.put(1,"");
//        keypad.put(2,"abc");
        String[] keypad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        List<String> result = new ArrayList<>(); // result to return

        List<char[]> converted = new ArrayList<>();
        for (char c : digits.toCharArray()) {
            converted.add(keypad[c].toCharArray());
        }

        // bread-first search traversal


        // depth-first search traversal
        Deque<String> deque = new ArrayDeque<>();
        int level = 0; // track the level of converted

//        for (int i = 0; i < converted.size(); i++) {
//            result.get(i).add(converted.get(i).charAt(i));
//
//        }

        return result;
    }
}
