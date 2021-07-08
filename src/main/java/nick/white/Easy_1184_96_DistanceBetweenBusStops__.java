package nick.white;

public class Easy_1184_96_DistanceBetweenBusStops__ {

    public static void main(String[] args) {
        int[] distance = {1, 2, 3, 4};
        int start = 0;
        int destination = 1;

        System.out.printf(" After: %s", distanceBetweenBusStops(distance, start, destination));
    }

    public static int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if (start == destination) return 0;

        int total = 0;
        for (int i : distance) {
            total += i;
        }

        int forward = 0;
        if (start > destination) {
            for (int i = start; i < destination; i++) {
                forward += i;
            }
        } else {
            for (int i = start; i < distance.length; i++) {
                forward += i;
            }
            for (int i = 0; i < destination; i++) {
                forward += i;
            }
        }

        int backward = total - forward;
        return forward < backward ? forward : backward;
    }
}
