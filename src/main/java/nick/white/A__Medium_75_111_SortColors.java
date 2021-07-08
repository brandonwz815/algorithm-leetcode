package nick.white;

public class A__Medium_75_111_SortColors {

    public static void main(String[] args) {

    }

    public static void sortColors(int[] nums) {

        int length = nums.length;
        if (length < 2) return;

        int aPointer = 0;
        int bPointer = length - 1;
        int pivot = 0;

        while (aPointer < length && bPointer >= 0) {
            if (nums[aPointer] > nums[bPointer]) {
                int temp = nums[aPointer];
                nums[aPointer] = nums[bPointer];
                nums[bPointer] = temp;
            } else if (nums[aPointer] < nums[bPointer]) {
                if (aPointer < length - 1) aPointer++;
                if (bPointer > 1) bPointer--;
            }
        }
    }
}
