package nick.white;

import java.util.Arrays;

public class Easy_1160_79_FindWordsThatCanBeFormedByCharacters {

    public static void main(String[] args) {
        String[] words = {"cat", "bt", "hat", "tree"};
        String chars = "atach";
        System.out.printf(" After: %s\n", countChracters(words, chars));

        String[] words2 = {"hello", "world", "leetcode"};
        String chars2 = "welldonehoneyr";
        System.out.printf(" After: %s\n", countChracters(words2, chars2));
    }

    public static int countChracters(String[] words, String chars) {
        int result = 0;

        int[] charMap = new int[26];
        for(char c : chars.toCharArray()) {
            charMap[c-'a']++;
        }

        for(String word : words) {
            int[] charMapTemp = Arrays.copyOf(charMap, 26);
            int tempResult = 0;
            for (char c : word.toCharArray()) {
                if (charMapTemp[c-'a']>0) {
                    tempResult++;
                    charMapTemp[c-'a']--;
                } else {
                    break;
                }
            }
            if(word.length()==tempResult) {
                result += tempResult;
            }
        }

        return result;
    }
}
