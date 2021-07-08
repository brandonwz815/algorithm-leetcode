package nick.white;

/**
 * Iteration
 *
 * Compare islandPerimeter() vs islandPerimeterNick()
 *
 * Time complexity: O(n)
 * Space complexity: O(1)
 */
public class Easy_363_78_IslandPerimeter__ {

    public static void main(String[] args) {
        int[][] input = {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
//        int[][] input = {{0, 1, 0, 0}, {1, 1, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        System.out.printf(" After: %s\n", islandPerimeterNick(input));
    }

    public static int islandPerimeter(int[][] input) {
//        int elements = 0;
        int perimeter = 0;

        int width = input[0].length;
        int height = input.length;
//        int[][] visited = new int[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
//                calculatePerimeter(input, width, height, visited, i, j, perimeter,elements);
                if (input[i][j] == 1) {
//                    visited[i][j] = 1;
                    perimeter += 4;
                    if (i == 0) {
                        if (j == 0) {
                            continue;
                        } else {
                            if (input[0][j - 1] == 1) {
                                perimeter -= 2;
                            }
                        }
                    } else {
                        if (j == 0) {
                            if (i > 0 && input[i - 1][0] == 1) {
                                perimeter -= 2;
                            }
                        } else {
                            if (input[i - 1][j] == 1) {
                                perimeter -= 2;
                            }
                            if (input[i][j - 1] == 1) {
                                perimeter -= 2;
                            }
                        }
                    }
                }
            }
        }

        return perimeter;
    }

    public static int islandPerimeterNick(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) return 0;

        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    result += 4;

                    if (i > 0 && grid[i - 1][j] == 1) {
                        result -= 2;
                    }
                    if (j > 0 && grid[i][j - 1] == 1) {
                        result -= 2;
                    }
                }
            }
        }
        return result;
    }

//    private static void calculatePerimeter(int[][] input, int width, int height, int[][] visited, int i, int j, int perimeter, int elements) {
//        if (input[i][j] == 1) {
//            visited[i][j] = 1;
//            elements++;
//
//            if (i >= 1 && i < height - 2 && j >= 1 && j <= width - 2) {
//                calculatePerimeter
//            }
//        }
//    }
}
