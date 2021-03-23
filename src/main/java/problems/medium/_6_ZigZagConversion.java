package problems.medium;

import java.util.ArrayList;
import java.util.List;

public class _6_ZigZagConversion {

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int rows = 4;
        System.out.println(compute(s, 4));
    }

    public static String compute(String s, int n) {
        List<List<Character>> matrix = new ArrayList<>();
        List<Character> list = new ArrayList<>(n);
//        Collections.fill(list, ' ');
        matrix.add(list);

        for (int i = 0; i < s.length(); i++) {
            int remainer = i % (2 * n - 2);
            if (remainer >= 0 && remainer < n) {
                list.add(s.charAt(i));
            } else {
                if (remainer >= n && remainer < (2 * n - 2)) {
                    list = new ArrayList<>(n);
                    matrix.add(list);
                    int leadingEmptyChars = 2 * n - remainer - 2; // n - (remainer - n -2)
                    for (int j = 0; j < leadingEmptyChars; j++) {
                        list.add(' ');
                    }
                    list.add(s.charAt(i));
                    for (int j = 0; j < (remainer - n + 1); j++) {
                        list.add(' ');
                    }
                    if (remainer - n == 1) {
                        list = new ArrayList<>(n);
                        matrix.add(list);
//                        Collections.fill(list, ' ');
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (List<Character> lst : matrix) {
                if (i < lst.size()) {
                    Character c = lst.get(i);
                    if (c != null && !c.equals(' ')) {
                        sb.append(c);
                    }
                }
            }
        }

        return sb.toString();
    }

}
