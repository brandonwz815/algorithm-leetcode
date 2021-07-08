package nick.white;

/**
 *  It is necessary to add parentheses in newMax()
 */
public class Medium_695_75_MaxAreaOfIsland__ {

    public static void main(String[] args) {
        int[][] grid = {
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
        };

        System.out.printf(" After: %s\n", maxAreaOfIsland(grid));
    }

    public static int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;

        int height = grid.length;
        int width = grid[0].length;
        int[][] visited = new int[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (grid[i][j]==1)
                maxArea = Math.max(maxArea, newMax(grid, visited, i, j));
            }
        }


        return maxArea;
    }

    private static int newMax(int[][] grid, int[][] visited, int i, int j) {
        if (grid[i][j] == 1 && visited[i][j] != 1) {
            visited[i][j] = 1;
            return 1 +
                    (i - 1 < 0 ? 0 : newMax(grid, visited, i - 1, j)) +
                    (i + 1 >= grid.length ? 0 : newMax(grid, visited, i + 1, j)) +
                    (j - 1 < 0 ? 0 : newMax(grid, visited, i, j - 1)) +
                    (j + 1 >= grid[0].length ? 0 : newMax(grid, visited, i, j + 1));
        }
        return 0;
    }
}
