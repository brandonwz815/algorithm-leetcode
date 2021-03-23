package nick.white;

/**
 * Question URL: https://leetcode.com/problems/longest-repeating-character-replacement/
 * Answer: https://www.youtube.com/watch?v=00FmUN1pkGE&list=PLU_sdQYzUj2keVENTP0a5rdykRSgg9Wp-&index=119 (looks incorrect)
 */
public class _424_LongestRepeatingCharacterReplacement {

    public static void main(String[] args) {
//        String input = "ABAB";
//        String input = "BAAABAA";
        String input = "AABABBA";
        int result = compute(input, 1);
        System.out.println("Result is " + result);
    }

    private static int compute(String s, int k) {
        int N = s.length();
        int[] charCounts = new int[26];

        int windowStart = 0;
        int maxLength = 0;
        int maxCount = 0;

        for (int windowEnd = 0; windowEnd < N; windowEnd++) {
            int currentCharCount = ++charCounts[s.charAt(windowEnd) - 'A'];
            maxCount = Math.max(maxCount, currentCharCount);

            while (windowEnd - windowStart + 1 - maxCount > k) {
                currentCharCount--;
                windowStart++;
            }

            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);

            System.out.println("s.charAt(" + windowEnd + ")=" + s.charAt(windowEnd) + " windowStart=" + windowStart + " maxCount=" + maxCount + " maxlength=" + maxLength);
        }

        return maxLength;
    }
}
