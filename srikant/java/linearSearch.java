import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 5, 1, 3, 7, 8, 4, 2, 1, 9, 6, 5, 3, 4, 7, 0, 2, 4, 1};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from 0 to 9");
        int target = sc.nextInt();

        int firstOccurrence = -1;
        int totalOccurrences = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                totalOccurrences++;
                if (firstOccurrence == -1) {
                    firstOccurrence = i;
                }
            }
        }

        if (totalOccurrences > 0) {
            System.out.println("Number " + target + " found at index: " + firstOccurrence);
            System.out.println("Total occurrences of number " + target + ": " + totalOccurrences);
        } else {
            System.out.println("Number " + target + " not found in the array.");
        }
    }
}
