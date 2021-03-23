package problems.medium;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Example:
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * <p>
 * Explanation: 342 + 465 = 807.
 */
public class _2_AddTwoNumbers {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(2, 4, 3);
        List<Integer> list2 = Arrays.asList(5, 6, 4, 8);
        List<Integer> result = compute(list1, list2);
        System.out.println(result);
    }

    public static List<Integer> compute(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new LinkedList<>();

        Iterator<Integer> it1 = list1.iterator();
        Iterator<Integer> it2 = list2.iterator();

        int addedToNext = 0;
        while (true) {
            int int1 = 0;
            int int2 = 0;
            if (it1.hasNext()) {
                int1 = it1.next();
            }
            if (it2.hasNext()) {
                int2 = it2.next();
            }
            Integer sum = int1 + int2 + addedToNext;
            int remaining = sum % 10;
            addedToNext = (sum - remaining) / 10;
            if (int1 == 0 && int2 == 0 && addedToNext == 0) {
                break;
            }
            result.add(remaining);
        }
        return result;
    }
}
