package util;

public class AlgoUtils {

    public static void print2DArray(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + ", ");
            }
            System.out.println();
        }
    }


}
