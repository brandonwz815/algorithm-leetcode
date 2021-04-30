package nick.white;

/**
 * Compared with Nick's solution, mine is clearer
 */
public class Easy_680_68_ValidPalindromII__ {

    public static void main(String[] args) {
        String s = "ddabcadd";
        System.out.printf(" After: %s\n", validPalindrome(s));
    }

    public static boolean validPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        if (s.length() == 1) {
            return true;
        }

        int length = s.length();
//        int mid = (length - 1) / 2;
        int left = 0;
        int right = length - 1;
//        for (int i = 0; i < mid; i++) {
//            if(s.charAt(i)==s.charAt(length-1-i)) {
//                continue;
//            }
//        }
        boolean skipped = false;
        while (left < right) {
//            System.out.println(s.charAt(left) == s.charAt(right));
            if (s.charAt(left) == s.charAt(right)) {
                left+=1;
                right-=1;
            } else if (skipped) {
                return false;
            } else {
                if (s.charAt(left + 1) == s.charAt(right)) {
//                    System.out.printf("Comparing %s and %s ",s.charAt(left + 1),  s.charAt(right));
//                    System.out.println();
                    left += 2;
                    right--;
                    skipped = true;
                } else if (s.charAt(left) == s.charAt(right - 1)) {
//                    System.out.printf("Comparing %s and %s ",s.charAt(left),  s.charAt(right-1));
//                    System.out.println();
                    left++;
                    right -= 2;
                    skipped = true;
                } else {
                   return false;
                }
            }
        }
        return true;
    }

}
