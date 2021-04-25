package nick.white;

/**
 * Key: use Character.isLetter()
 */
public class Easy_917_51_ReverseOnlyLetters__ {

    public static void main(String[] args) {
        String S = "Test1ng-Leet=code-Q!";

        System.out.printf("Before: %s\n", S);
        System.out.printf(" After: %s\n", reverseOnlyLetters(S));
    }

    public static String reverseOnlyLetters(String S) {
        if (S.length() < 2) { // length is 0 or 1
            return S;
        }

        int aPointer = 0;
        int bPointer = S.length() - 1;
        char[] input = S.toCharArray();

        while (aPointer < bPointer) {
            char a = input[aPointer];
            if (!Character.isLetter(a)) {
                aPointer++;
                continue;
            }

            char b = input[bPointer];
            if (!Character.isLetter(b)) {
                bPointer--;
                continue;
            }
            input[aPointer] = b;
            input[bPointer] = a;
            aPointer++;
            bPointer--;
        }

        return new String(input);
    }

}
