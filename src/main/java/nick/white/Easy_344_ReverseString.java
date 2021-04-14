package nick.white;

public class Easy_344_ReverseString {

    public static void main(String[] args) {
        String s = "abc";
        char[] charArray = s.toCharArray();
        System.out.println(charArray);
        reverseStringWhileLoop(charArray);
        System.out.println(new String(charArray));
    }

    public static void reverseString(char[] s) {
        int length = s.length;
        for (int i = 0; i < length / 2; i++) {
            char temp = s[i];
            s[i] = s[length - 1 - i];
            s[length - 1 - i] = temp;
        }
    }

    public static void reverseStringWhileLoop(char[] s) {
        int pointerLeft = 0;
        int pointerRight = s.length - 1;

        while (pointerLeft < pointerRight) {
            char temp = s[pointerLeft];
            s[pointerLeft] = s[pointerRight];
            s[pointerRight] = temp;
            pointerLeft++;
            pointerRight--;
        }
    }

}
