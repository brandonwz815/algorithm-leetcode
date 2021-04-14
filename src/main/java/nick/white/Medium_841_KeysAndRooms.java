package nick.white;

import java.util.ArrayList;
import java.util.List;

public class Medium_841_KeysAndRooms {

    public static void main(String[] args) {
        List<List<Integer>> input = new ArrayList<>();

        List<Integer> room0 = new ArrayList<>();
        room0.add(1);
        input.add(room0);

        List<Integer> room1 = new ArrayList<>();
        room1.add(2);
        input.add(room1);

        List<Integer> room2 = new ArrayList<>();
        room2.add(3);
        input.add(room2);

        List<Integer> room3 = new ArrayList<>();
        input.add(room3);

        boolean canVisit = canVisitAllRooms(input);
        System.out.println(canVisit);
    }

    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        if (rooms == null || rooms.size() == 0) {
            return false;
        }
        if (rooms.size() == 1) {
            return true;
        } else {
            List<Integer> keysForNextRoom = rooms.get(0);
            for (int i = 1; i < rooms.size(); i++) {
                if (!keysForNextRoom.contains(i)) {
                    return false;
                }
                keysForNextRoom = rooms.get(i);
            }
            return true;
        }
    }

}
