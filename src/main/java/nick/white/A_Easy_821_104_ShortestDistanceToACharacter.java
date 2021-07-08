package nick.white;

import java.util.Arrays;

public class A_Easy_821_104_ShortestDistanceToACharacter {

    public static void main(String[] args) {
        String S = "loveleetcode";
        char C = 'e';

        System.out.printf(" After %s", Arrays.toString(shortestToChar(S, C)));
    }

    public static int[] shortestToChar(String S, char C) {
        int[] result = new int[S.length()];
//        if (S.length() == 1) result[0]

        int leftPointer = S.charAt(0) == C ? 0 : -1;
        int aPointer = 0;
        int bPointer = 0;

        while (aPointer <= S.length()) {
            if (bPointer > S.length()) {
                result[aPointer] = S.length();
                aPointer++;
                if (aPointer == S.length() ) {
//                    result[S.length()] = S.charAt(aPointer) == C?
                }
            } else {
                if (S.charAt(bPointer) != C) {
                    bPointer++;
                } else {
                    for (int i = aPointer; i < bPointer; i++) {
                        if (leftPointer == -1) {
                            result[i] = bPointer - i;
                        } else {
                            result[i] = Math.min(i - leftPointer, bPointer - 1);
                        }
                    }
                    aPointer++;
                    bPointer = aPointer + 1;
                }
            }
        }

        return result;
    }

}
