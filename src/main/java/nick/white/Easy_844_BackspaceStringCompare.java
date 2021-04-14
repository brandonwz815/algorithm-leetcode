package nick.white;

import java.util.LinkedList;

public class Easy_844_BackspaceStringCompare {

    public static void main(String[] args) {

    }

    /**
     * Move from RIGHT to LEFT
     *
     * Not working.  Must count skips
     *
     */
    /*
    public boolean backspaceStringCompare(String S, String T) {
        int lenS = S.length();
        int lenT = T.length();
        StringBuilder sb = new StringBuilder(lenS);

        boolean isHash = false;
        for (int i = lenS-1; i>=0; i--) {
            char c = S.charAt(i);
            if (c == '#') {
                isHash=true;
            } else if(isHash) {
               isHash = false;
            } else {
                sb.append(c);
            }
        }
        for (int i = lenT-1; i>=0; i--) {
            char c = T.charAt(i);
            if (c == '#') {
                isHash=true;
            } else if(isHash) {
                isHash = false;
            } else {
                sb.append(c);
            }
        }

    }
    */


/*
    // Compare from left to right: Quite a few passes
    public boolean backspaceStringCompare(String S, String T) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for(int k = 0; k<S.length(); k++) {
            if(S.charAt(k)=='#') {
                i++;
            } else {
                break;
            }
        }
        for (; i < S.length(); i++) {
            char c = S.charAt(i);
            if(c == '#') {
               sb.setCharAt(i-1, (char)0);
            } else {
                sb.append(c);
            }
        }

        return false;
    }
*/
}
