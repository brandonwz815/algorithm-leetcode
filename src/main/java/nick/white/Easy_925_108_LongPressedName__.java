package nick.white;

public class Easy_925_108_LongPressedName__ {

    public static void main(String[] args) {
        String name = "saeed";
        String typed = "ssaaeedd";
        System.out.printf(" After: %b\n", isLongPressedName(name, typed));
    }

    public static boolean isLongPressedName(String name, String typed) {
        if (name == null
                || typed == null
                || name == ""
                || typed == ""
                || name.length() > typed.length()
        ) return false;

        int aPointer = 0; // pointer for name
        int bPointer = 0; // pointer for typed

        while (aPointer < name.length() && bPointer < typed.length()) {
//            char c = name.charAt(aPointer);
//            if (bPointer >= typed.length() && aPointer < name.length())
//            while (typed.charAt(bPointer) == c && bPointer < typed.length()) {
//                bPointer++;
//            }
            if (name.charAt(aPointer) == typed.charAt(bPointer)) {
                aPointer++;
                bPointer++;
            } else {
                char prevNameChar = aPointer == 0? name.charAt(0) : name.charAt(aPointer -1);
                if (prevNameChar == typed.charAt(bPointer)) {
                    bPointer++;
                } else {
                    return false;
                }
            }
        }

        if (aPointer < name.length() && bPointer == typed.length()) return false;
        return true;
    }
}
