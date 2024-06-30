import java.util.Scanner;

public class checkString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();
        boolean found = false;
        char[] firstCharArray = firstString.toCharArray();
        char[] secondCharArray = secondString.toCharArray();

        for (int i = 0; i <= firstCharArray.length - secondCharArray.length; i++) {
            int j;
            for (j = 0; j < secondCharArray.length; j++) {
                if (firstCharArray[i + j] != secondCharArray[j]) {
                    break;
                }
            }
            if (j == secondCharArray.length) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("The second string exists within the first string.");
        } else {
            System.out.println("The second string does not exist within the first string.");
        }

        scanner.close();
    }
}
