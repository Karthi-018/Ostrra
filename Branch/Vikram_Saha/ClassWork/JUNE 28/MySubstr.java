public class MySubstr {
    public static boolean isPresent(String a, String b) {
        int i1 = 0, i2 = 0;
        boolean found = false;
        if (a.length() < b.length())
            return false;

        for (; i1 < a.length(); i1++) {
            found = true;
            for (i2 = 0; i2 < b.length(); i2++) {
                if (a.charAt(i1 + i2) != b.charAt(i2)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                System.out.println("found at " + i1);
                return true;
            }
        }

        return found;
    }

    public static void main(String[] args) {
        System.out.println(isPresent("concat", "cat"));
    }
}
