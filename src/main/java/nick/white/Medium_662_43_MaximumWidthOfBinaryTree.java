package nick.white;

import java.util.HashMap;
import java.util.Map;

public class Medium_662_43_MaximumWidthOfBinaryTree {

    public static void main(String[] args) {

    }

    public static int widthOfBinaryTree(TreeNode root) {
        int maxWidth =0;
        Map<Integer, Integer> leftmostPositions = new HashMap<>();
        getWidth(root, 0, 0);
        return maxWidth;
    }

    private static void getWidth(TreeNode root, int depth, int position) {

    }

}
