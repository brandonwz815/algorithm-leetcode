package nick.white;

public class Medium_1004_MaxConsecutiveOnesIII {

    public static void main(String[] args) {
        int[] input = {0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0};
        int result = compute(input, 2);
        System.out.println("Result is " + result);
    }

    private static int compute(int[] A, int k) {
        int i = 0;
        int j = 0;
        while (i < A.length) {
            if (A[i] == 0) {
                k--;
            }
            if (k < 0 && A[j++] == 0) {  // j increments regardless whether A[j]==0
                k++;
            }
            System.out.println("A[" + i + "]=" + A[i] + " j=" + j + " k=" + k);
            i++;
        }
        return i - j;
    }
}
