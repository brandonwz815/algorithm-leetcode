package nick.white;

/**
 * Avoided using String.contains(String) as in Nick's solution
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 */
public class Easy_796_80_RotateString__ {

    public static void main(String[] args) {
        String A = "abcde";
        String B = "cdeab";
        System.out.printf(" After: %s\n", rotateString(A, B));

        String C = "abcde";
        String D = "abced";
        System.out.printf(" After: %s\n", rotateString(C, D));
    }

    private static boolean rotateString(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }

        // Look for first character of A in B, O(n)
        int index = 0;
        boolean found = false;
        for (int i = 0; i < B.length(); i++) {
            if (A.charAt(0) == B.charAt(i)) {
                found = true;
                index = i;
                break;
            }
        }
        if (!found) return false;

        // now march on both A and B
        int j = index + 1;
        if (j == B.length()) j = 0;
        for (int i = 1; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt(j++)) {
                return false;
            }
            if (j == B.length()) j = 0;
        }

        return true;
    }
}
