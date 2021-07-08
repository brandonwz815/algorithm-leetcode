package nick.white;

/**
 * time O(n^2)
 * space O(1)
 */
public class Medium_838_109_PushDominoes__ {

    public static void main(String[] args) {
        String input = ".L.R...LR..R..L..L..";
        System.out.printf("Before: %s\n", input);
        System.out.printf(" After: %s\n", pushDominoes(input));
    }

    public static String pushDominoes(String dominoes) {
        if (dominoes == null || dominoes.length() == 0) return dominoes;

        int length = dominoes.length();
        char[] output = dominoes.toCharArray();

        int pointer = 0;
        int nextL = -1;
        int prevR = -1;

        while (pointer < length) {
            char c = dominoes.charAt(pointer);

            if (c == 'L') {
                if (prevR == -1) {
                    if (nextL == -1) {
                        nextL = 0;
                    }
                    for (int i = nextL + 1; i < pointer; i++) {
                        output[i] = 'L';
                    }
                    nextL = pointer;
                } else if (prevR > nextL) { // eg.  LR..L
                    nextL = pointer;
                    int dots = nextL - prevR - 1;
                    for (int i = prevR + 1; i <= (prevR + dots / 2); i++) {
                        output[i] = 'R';
                    }
                    for (int i = nextL - 1; i >= (nextL - dots / 2); i--) {
                        output[i] = 'L';
                    }
                } else if (nextL > prevR) { // eg. RL...L
                    for (int i = nextL + 1; i < pointer; i++) {
                        output[i] = 'L';
                    }
                    nextL = pointer;
                } else { // eg. R..L
                    nextL = pointer;
                }
            } else if (c == 'R') {
                if (prevR > nextL) { // eg. R....R
                    for (int i = prevR + 1; i < pointer; i++) {
                        output[i] = 'R';
                    }
                }
                prevR = pointer;
            }

            pointer++;
        }

        if (prevR > nextL) {
            for (int i = prevR + 1; i < length; i++) {
                output[i] = 'R';
            }
        }

        return new String(output);
    }

}
