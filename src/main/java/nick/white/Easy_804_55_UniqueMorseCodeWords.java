package nick.white;

import java.util.HashSet;
import java.util.Set;

public class Easy_804_55_UniqueMorseCodeWords {

    public static String[] morseCodes = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.printf(" After: %s\n", uniqueMorseRepresentations(words));
    }

    public static int uniqueMorseRepresentations(String[] words) {
        Set<String> unique = new HashSet<>();
        for(String s : words) {
            StringBuilder morseRep = new StringBuilder();
            for(int i = 0; i< s.length(); i++) {
                morseRep.append(morseCodes[s.charAt(i)-'a']);
            }
            unique.add(morseRep.toString());
        }
        return unique.size();
    }
}
