package problems.medium;

import java.util.Arrays;

public class _3_LongestSubstringWIthoutRepeatingCharacters {

    public static void main(String[] args) {
        System.out.println(compute("abbad"));
    }

    public static int compute(String s) {
        int[] index = new int[128];
        Arrays.fill(index, -1);
        int ans = 0;
        int i = 0;
        for(int j = 0; j < s.length(); j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j;
        }
        System.out.println(i);
        return ans;
    }

}
