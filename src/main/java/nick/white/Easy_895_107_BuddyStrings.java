package nick.white;

import java.util.ArrayList;
import java.util.List;

public class Easy_895_107_BuddyStrings {

    public static void main(String[] args) {
        String A = "aaaaaaaabc";
        String B = "aaaaaaaacd";
        System.out.printf(" After: %b\n", buddyStrings(A, B));

        String C = "aaaaaaaabc";
        String D = "aaaaaaaacb";
        System.out.printf(" After: %b\n", buddyStrings(C, D));
    }

    public static boolean buddyStrings(String A, String B) {
        if (A == null || B == null || A.length() != B.length()) return false;

        int swaps = 0;
        List swapped = new ArrayList<>(2);
        int length = A.length();
        for (int i = 0; i < length; i++) {
            char a = A.charAt(i);
            char b = B.charAt(i);
            if (a != b) {
                if (swaps == 2) return false;
                if (!swapped.isEmpty() && !(swapped.contains(a) && swapped.contains(b))) {
                    return false;
                }
                swaps += 1;
                swapped.add(a);
                swapped.add(b);
            }
        }
        return swaps == 2;
    }
}
