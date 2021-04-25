package nick.white;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class A_Medium_54_52_SpiralMatrix {

    public static void main(String[] args) {
        int[][] input = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

//        System.out.printf("Before: %s\n", IntStream.of(input).flatMap(IntStream:of));
        System.out.printf(" After: %s\n", Arrays.deepToString(input));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        circle(
                matrix,
                0,
                matrix[0].length - 1,
                0,
                matrix.length,
                result
        );
        return result;
    }

    private static void circle(
            int[][] matrix,
            int horizontalStart,
            int horizontalEnd,
            int verticalStart,
            int verticalEnd,
            List<Integer> result) {

        if (horizontalEnd == horizontalStart) {
            for (int i = verticalStart; i <= verticalEnd; i++) {
                result.add(matrix[i][0]);
            }
        } else if (verticalEnd == verticalStart) {
            for (int i = horizontalStart; i <= horizontalEnd; i++) {
                result.add(matrix[0][i]);
            }
        } else {

            //

            if (horizontalEnd - horizontalStart > 1 && verticalEnd - verticalStart > 1) {
                // recursively call circle() with inner matrix
                circle(
                        matrix,
                        horizontalStart++,
                        horizontalEnd--,
                        verticalStart++,
                        verticalEnd--,
                        result
                );
            }
        }

    }
}
