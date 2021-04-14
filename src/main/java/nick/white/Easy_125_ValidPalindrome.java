package nick.white;

import java.util.Locale;

public class Easy_125_ValidPalindrome {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
//        String s = "racecar";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^0-9a-zA-Z]", "").toLowerCase(Locale.ROOT);
        System.out.println(s);

        int length = s.length();
        int left = 0;
        int right = length - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

}
