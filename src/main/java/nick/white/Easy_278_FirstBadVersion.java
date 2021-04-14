package nick.white;

public class Easy_278_FirstBadVersion {

    public static void main(String[] args) {
        System.out.println(5/2 + "");
    }

    public int firstBadVersion(int n) {
        if (isBadVersion(1)) {
            return 1;
        }
        if (!isBadVersion(n)) {
            return -1;
        }

        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1; // must set left to mid + 1, not to mid
            }
        }

        return left;
    }

    private boolean isBadVersion(int i) {
        return false;
    }

}
