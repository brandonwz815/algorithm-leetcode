package nick.white;

import java.util.Arrays;

public class Easy_806_124_NumberOfLinesToWriteString__ {

    public static void main(String[] args) {
        int[] widths = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String s = "abcdefghijklmnopqrstuvwxyz";
        System.out.printf(" After: %s\n", Arrays.toString(numberOfLines(widths, s)));

        int[] widths2 = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String s2 = "bbbcccdddaaa";
        System.out.printf(" After: %s\n", Arrays.toString(numberOfLines(widths2, s2)));
    }

    public static int[] numberOfLines(int[] widths, String S) {
        int[] answer = new int[2];
        char[] chars = S.toCharArray();

        int LINE_WIDTH = 100;
        int lineLength = 100;
        for (int i = 0; i < chars.length; i++) {
            lineLength -= widths[chars[i] - 'a'];
            if (lineLength < 0) {
                answer[0] += 1;
                lineLength = LINE_WIDTH -  widths[chars[i] - 'a'];
            }
        }
        if(lineLength < LINE_WIDTH) answer[0]++;

        answer[1] = LINE_WIDTH - lineLength;
        return answer;
    }
}
