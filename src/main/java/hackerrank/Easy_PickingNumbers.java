package hackerrank;

import java.util.*;

public class Easy_PickingNumbers {

    public static void main(String[] args) {

        int[] input = {4,97,5,97,97,4,97,4,97,97,97,97,4,4,5,5,97,5,97,99,4,97,5,97,97,97,5,5,97,4,5,97,97,5,97,4,97,5,4,4,97,5,5,5,4,97,97,4,97,5,4,4,97,97,97,5,5,97,4,97,97,5,4,97,97,4,97,97,97,5,4,4,97,4,4,97,5,97,97,97,97,4,97,5,97,5,4,97,4,5,97,97,5,97,5,97,5,97,97,97};

        System.out.printf(" After: %s", parse(input));
    }

    private static int parse(int[] a) {
        // Write your code here
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i : a) {
            if (map.get(i)==null) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i)+ 1);
            }
        }
        System.out.println(map);
        int longest = 0;
        int length = 0;
        Set<Integer> keys = map.keySet();
        for(Integer key : keys) {
            int value= map.get(key);
            if (value>longest) longest = value;
            if (map.get(key+1)==null) {
                continue;
            } else {
                int curLength = map.get(key+1) + value;
                if(curLength>length) length=curLength;
            }
        }

        return longest>length? longest : length;
    }
}
