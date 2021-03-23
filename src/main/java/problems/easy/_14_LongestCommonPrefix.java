package problems.easy;

public class _14_LongestCommonPrefix {

    public static void main(String[] args) {
        String[] input1 = {"flower", "flow", "flight"};
        System.out.println(compute(input1));

        String[] input2 = {"dog", "racecar", "car"};
        System.out.println(compute(input2));
    }

    private static String compute(String[] arr) {
        StringBuilder res = new StringBuilder();

        int pos = 0;
        boolean stop = false;
        while (!stop) {

            char tmp = '\u0000';
            boolean diff = false;
            for (int i = 0; i < arr.length; i++) {
                if (pos < arr[i].length()) {
                    char a = arr[i].charAt(pos);
                    if (tmp == '\u0000') {
                        tmp = a;
                    } else if (a == tmp) {
                        continue;
                    } else {
                        diff = true;
                        break;
                    }
                } else {
                    stop = true;
                }
            }
            if (!diff && !stop) {
                res.append(tmp);
            }
            pos++;
        }
        return res.toString();
    }

}
