package nick.white;

public class A_Medium_74_71_SearchA2DMatrix {

    public static void main(String[] args) {

    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        int width = matrix[0].length;
        int height = matrix.length;

        return search(matrix, 0, height - 1, width, target);
    }

    private static boolean search(int[][] matrix, int startRow, int endRow, int width, int target) {

        while (startRow < endRow) {
            int midRow = (endRow - startRow - 1) / 2 + startRow;

            if (target < matrix[midRow][0]) {
                endRow = midRow - 1;
            } else if (target > matrix[midRow][width - 1]) {
                startRow = midRow + 1;
            } else {
                // in mid Row
//                binarySearch(matrix[midRow], 0, width-1, target);

            }
        }
        return false;
    }
}
