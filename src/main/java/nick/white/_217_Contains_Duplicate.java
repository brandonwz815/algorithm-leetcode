package nick.white;

import java.util.HashSet;
import java.util.Set;

public class _217_Contains_Duplicate {

    public static void main(String[] args) {
        int[] input1 = new int[]{1, 2, 3, 3};
        int[] input2 = new int[]{1, 2, 3, 4};
        int[] input3 = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 1};

        System.out.println(compute(input1));
        System.out.println(compute(input2));
        System.out.println(compute(input3));
    }

    private static boolean compute(int[] input) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < input.length; i++) {
            int element = input[i];
            if (set.contains(element)) {
                return true;
            }
            set.add(element);
        }
        return false;
    }
}

