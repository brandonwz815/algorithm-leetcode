package nick.white;

import java.util.ArrayList;
import java.util.List;

public class Easy_412_82_FizzBuzz {

    public static void main(String[] args) {
        int n = 15;
        System.out.printf(" After: %s\n", fizzBuzz(n));
    }

    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if ((i % 5 == 0) ){
                list.add("Buzz");
            } else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }
}
