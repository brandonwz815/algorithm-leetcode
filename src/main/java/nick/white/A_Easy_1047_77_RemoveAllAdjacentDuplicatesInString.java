package nick.white;

/**
 * Use a two-pointer solution, better solution
 * <p>
 * Time complexity: O(n)
 * Space complexity: O(1) ?
 */
public class A_Easy_1047_77_RemoveAllAdjacentDuplicatesInString {

    public static void main(String[] args) {
        String s = "abbaca";

        System.out.printf(" After: %s\n", removeDuplicates(s));
    }

    public static String removeDuplicates(String s) {
        if (s == null || s.length() == 1) {
            return s;
        }

        char [] charArray = s.toCharArray();
        int aPointer = 0;
        int bPointer = 1;

        while (aPointer > -1 && bPointer < s.length()) {
            if (s.charAt(aPointer) == s.charAt(bPointer)) {
//                s.;
                aPointer -= 1;
                bPointer += 1;

            }
        }
        return s;
    }
}
