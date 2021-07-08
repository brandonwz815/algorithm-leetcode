package nick.white;

public class A_Medium_752_116_OpenTheLock {

    public static void main(String[] args) {
        String target = "0202";
        String[] deadends = {"0201", "0101", "0102", "1212", "2002"};
        System.out.printf(" After: %d\n", openLock(deadends, target));
    }

    public static int openLock(String[] deadends, String target) {
        int[] begin = {0, 0, 0, 0};
        for (int i = 0; i < 10; i++) {
            begin[0] = i;
            for (int j = 0; j < 10; j++) {
                begin[1] = j;
                for (int k = 0; k < 10; k++) {
                    begin[2] = k;
                    for (int l = 0; l < 10; l++) {
                        begin[3] = l;
//                        if
                    }
                }
            }
        }
        return 0;
    }
}
