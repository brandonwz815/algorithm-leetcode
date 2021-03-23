package amazon.nick.white;

public class ArrayMaxConsecutiveSum2 {

    public static void main(String[] args) {
        int[] inputArray = new int[]{-2, 2, 5, -11, 6, 4};
        System.out.println(arrayMaxConsecutiveSum2(inputArray));
    }

    private static int arrayMaxConsecutiveSum2(int[] inputArray) {
        int max_sum = inputArray[0];
        int current_sum = max_sum;

        for (int i = 0; i < inputArray.length; i++) {
            current_sum = Math.max(inputArray[i] + current_sum, inputArray[i]);
            max_sum = Math.max(current_sum, max_sum);
            System.out.println(current_sum + " " + max_sum);

        }
        return max_sum;
    }

}
