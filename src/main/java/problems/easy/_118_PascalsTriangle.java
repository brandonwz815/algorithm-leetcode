package problems.easy;

import java.util.ArrayList;
import java.util.List;

public class _118_PascalsTriangle {

    public static void main(String[] args) {


    }

    public static List<List<Integer>> compute(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();
        if (numRows == 0) {
            return triangle;
        }

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            int size = triangle.size();
            List<Integer> lastRow = triangle.get(size - 1);

            List<Integer> currentRow = new ArrayList<>(lastRow.size() + 1);
            triangle.add(currentRow);


            currentRow.add(1);
            for (int j = 1; j < lastRow.size(); j++) {
                currentRow.add(lastRow.get(j - 1) + lastRow.get(j));
            }
        }

        return triangle;
    }
}
