package nick.white;

public class _200_NumberOfIslands {

    public static void main(String[] args) {

        int[][] a = new int[][]{
                {1, 1, 1, 1, 0},
                {1, 1, 0, 1, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0}
        };
        System.out.println("Number of Islands is " + test(a));

        int[][] b = new int[][]{
                {1, 1, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 1, 1}
        };
        System.out.println("Number of Islands is " + test(b));
    }

    private static int test(int[][] input) {
        int numberOfIslands = 0;

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                if (input[i][j] == 1) {
                    numberOfIslands++;
                    dfs(i, j, input);
                }
            }
        }
        return numberOfIslands;
    }

    private static void dfs(int i, int j, int[][] input) {
        if (i >= 0 && i < input.length && j >= 0 && j < input[i].length && input[i][j] == 1) {
            input[i][j] = 0;
            dfs(i + 1, j, input);
            dfs(i - 1, j, input);
            dfs(i, j + 1, input);
            dfs(i, j - 1, input);
        }
    }
}
