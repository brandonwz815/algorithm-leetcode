package nick.white;

public class Easy_118_PascalsTriangle {

    public static void main(String[] args) {
        int input = 5;
        compute(input);
    }

    private static void compute(int input) {
        int[][] result = new int[input][];
        if (input == 1) {
            result[0] = new int[]{1};
            System.out.println(1);
        } else if (input == 2) {
            result[0] = new int[]{1};
            System.out.println(1);

            result[1] = new int[]{1, 2};
            System.out.print(1);
            System.out.print(1);
            System.out.println();
        } else {
            result[0] = new int[]{1};
            result[1] = new int[]{1, 1};
            for (int i = 2; i < input; i++) {
                result[i] = new int[i + 1];
                result[i][0] = 1;
                for (int j = 1; j < i; j++) {
                    result[i][j] = result[i - 1][j - 1] + result[i - 1][j];
                    System.out.print(result[i][j]);
                }
                result[i][i] = 1;
                System.out.println(result[i][i]);

            }
        }
//        return result;
    }
}