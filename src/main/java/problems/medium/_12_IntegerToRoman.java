package problems.medium;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 *
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.
 *
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 *
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given an integer, convert it to a roman numeral. Input is guaranteed to be within the range from 1 to 3999.
 *
 */
public class _12_IntegerToRoman {

    public  static void main(String[] args) {
        int a = 3;
        System.out.println(compute(a));
        int b = 4;
        System.out.println(compute(b));
        int c = 9;
        System.out.println(compute(c));
        int d = 58;
        System.out.println(compute(d));
        int e = 1994;
        System.out.println(compute(e));
    }

    private static String compute(int a) {
        String roman = "";

        int milli = a / 1000;
        roman += getMilli(milli);
        a -= milli * 1000;

        int hundred = a / 100;
        roman += getHundredOrTenOrSingle(hundred, "C", "D", "M");
        a -= hundred * 100;

        int ten = a / 10;
        roman += getHundredOrTenOrSingle(ten, "X", "L", "C");
        a -= ten * 10;

        roman += getHundredOrTenOrSingle(a, "I", "V", "X");

        return roman;
    }

    private static String getHundredOrTenOrSingle(int hundred, String s1, String s2, String s3) {
        if (hundred == 0) {
            return "";
        }
        String h = "";
        if(hundred>=1 && hundred <=3) {
            for (int i = 1; i <= hundred; i++) {
                h += s1;
            }
        } else if (hundred == 4) {
            h += s1 + s2;
        } else if(hundred==5) {
            h = s2;
        } else if(hundred >=6 && hundred <=8) {
            h = s2;
            for(int i = 6; i <= 8; i++) {
                h += s1;
            }
        } else if(hundred == 9) {
            h = s1 + s3;
        }
        return h;
    }

    private static String getMilli(int milli) {
        if(milli==0) {
            return "";
        }
        String m = "";
        for(int i = 1; i <= milli; i++) {
            m += "M";
        }
        return m;
    }

}
