package nick.white;

public class A_Medium_33_128_SearchInRotatedSortedArray {

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 3;
        System.out.printf(" After: %d\n", search(nums, target));
    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length;

        int mid = start + (end - start) / 2;
        while (target != nums[mid]) {

        }
        return 0;
    }
}
