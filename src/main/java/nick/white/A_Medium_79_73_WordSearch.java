package nick.white;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Cannot use Deque because this is not a Tree
 *
 * Use x, y, and check if x, y has exceeded the bounds
 */
public class A_Medium_79_73_WordSearch {

    public static void main(String[] args) {

    }

    public static boolean exist(char[][] board, String word) {


//        Deque<Character> deque = new ArrayDeque<>(); // depth-first search, preorder
//        deque.offerLast(board[0][0]);

        int width = board[0].length;
        int height = board.length;

        if (width * height < word.length()) {
            return false;
        }

        boolean[][] visited = new boolean[width][height];
        int x = 0;
        int y = 0;
        int wordIndex = 0;

        while (wordIndex < word.length()) {
//            Character c = deque.poll();
            Character c = board[x][y];
            if (c.equals(word.charAt(wordIndex))) {
                wordIndex++;
                visited[x][y] = true;
            }
            if (width == 1 && height > 1) {
                y++;
            } else if (height == 1) {
                x++;
            } else if (y < height - 1) {
                if (x < width - 1) {
                    x++;
//                    deque.offerLast()


                }
            }
        }
        return false;
    }
}
