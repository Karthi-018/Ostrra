import java.util.Scanner;

public class StringSearch{
    public static int searchString(String text, String pattern) {
        int textLength = text.length();
        int patternLength = pattern.length();

        for (int i = 0; i <= textLength - patternLength; i++) {
            int j;

            for (j = 0; j < patternLength; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }

            if (j == patternLength) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings");
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(searchString(s1, s2));
    }
}