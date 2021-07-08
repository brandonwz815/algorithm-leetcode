package nick.white;

import java.util.Arrays;

/**
 *  Nick's solution is better than this implementation
 *
 *  @see <a href="https://bit.ly/3w2dsa4">https://bit.ly/3w2dsa4</a>
 *
 */
public class Medium_807_90_MaxIncreaseToKeepCitySkyline__ {

    public static void main(String[] args) {
        int[][] grid = {
                {3, 0, 8, 4},
                {2, 4, 5, 7},
                {9, 2, 6, 3},
                {0, 3, 1, 0}
        };
        System.out.printf(" After %s\n", maxIncreaseKeepingSkyline(grid));
    }

    private static int maxIncreaseKeepingSkyline(int[][] grid) {
        int result = 0;
        int height = grid.length;
        int width = grid[0].length;

        int[][] newGrid = new int[height][width];

        // get skyline
        int maxOfHeightRow = 0;
        int tallest = Integer.MIN_VALUE;
        int[] skylineFromTop = Arrays.copyOf(grid[0], width);

        for (int i = 0; i < height; i++) {
            int maxOfWidth = Integer.MIN_VALUE;

            // populate skylineFromTop
            for (int j = 0; j < width; j++) {
                maxOfWidth = Math.max(maxOfWidth, grid[i][j]);
                skylineFromTop[j] = Math.max(skylineFromTop[j], grid[i][j]);
            }

            // assign the highest value of each row to the first element
            // and the rest is default to zero
            newGrid[i][0] = maxOfWidth;

            // get the tallest
            if (maxOfWidth > tallest) {
                tallest = maxOfWidth;
                maxOfHeightRow = i;
            }
        }

        // assign the values of the row with the highest element, i.e. 9 in this case
        for (int j = 0; j < width; j++) {
            newGrid[maxOfHeightRow][j] = skylineFromTop[j];
        }

        // complete assigning values to newGrid
        for (int i = 0; i < height; i++) {
            if (i == maxOfHeightRow) {
                continue;
            }
            for (int j = 1; j < height; j++) {
                newGrid[i][j] = Math.min(newGrid[i][0], skylineFromTop[j]);
            }
        }

        // calculate the difference
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result = result + (newGrid[i][j] - grid[i][j]);
            }
        }

        return result;
    }
}