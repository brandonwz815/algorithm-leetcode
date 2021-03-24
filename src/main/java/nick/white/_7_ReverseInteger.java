package nick.white;

public class _7_ReverseInteger {

    public static void main(String[] args) {
        int input = 123;

        System.out.println(reverse(input));

    }

    public static int reverse(int x) {
        if (x == 0) return 0;
        boolean isNegative = x < 0;
        if (isNegative) {
            x = -x;
        }
        int rev = 0;
        int pop;
        while (x > 0) {
            pop = x % 10;
            rev = rev * 10 + pop;
            x = x / 10;  // x = (x-pop)/10
        }
        return isNegative ? -rev : rev;
        //return 0;
    }
}
