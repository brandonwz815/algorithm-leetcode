package nick.white;

public class Easy_657_RobotReturnToOrigin {

    public static void main(String[] args) {

    }

    public static boolean judgeCircle(String moves) {
        if (moves == null || moves.equals("")) {
            return true;
        }
        int x = 0;
        int y = 0;
        int length = moves.length();
        for (int i = 0; i < length; i++) {
            char c = moves.charAt(i);
            if (c == 'R') {
                x++;
            } else if (c == 'L') {
                x--;
            } else if (c == 'U') {
                y++;
            } else if (c == 'D') {
                y--;
            }
        }

        return x == 0 && y == 0;
    }
}
