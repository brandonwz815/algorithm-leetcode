package nick.white;

public class A_Easy_953_121_VerifyingAnAlienDictionary {

    public static void main(String[] args) {
        String[] words = {"hello", "leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        System.out.printf(" After: %b\n", isAlienSorted(words, order));
    }

    public static boolean isAlienSorted(String[] words, String order) {

        int length = words[0].length();
        for (String word : words) {
            if (word.length() < length) return false;
            length = word.length();
        }

        int[] charMap = new int[26];
        for (int i = 0; i < 26; i++) {
            charMap[order.charAt(i) - 'a'] = i;
        }

        int startWord = 0;
        for (int i = 0; i < length; i++) { // longest word length
            if (words[startWord].length() - 1 < i ) startWord += 1;
            char currentChar = words[startWord].charAt(i);
            for (int j = startWord; j < words.length; j++) {
                if (charMap[words[j].charAt(i) - 'a'] < charMap[currentChar - 'a']) return false;
                currentChar = words[j].charAt(i);
            }
        }

        return true;
    }
}
