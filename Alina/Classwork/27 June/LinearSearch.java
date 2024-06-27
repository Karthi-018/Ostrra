import java.util.Scanner;
public class LinearSearch {
    public static int linearSearch(int[] arr, int key) {
        int comp = 0;
        for (int i = 0; i < arr.length; i++) {
            comp++;
            if (arr[i] == key) {
                System.out.println("Number of comparisons made: " + comp);
                return i; 
            }
        }
        System.out.println("Number of comparisons made: " + comp);
        return -1; 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[20];
        int n;
        do {
            System.out.print("Enter the number of elements (1 to 20): ");
            n = scanner.nextInt();
        } while (n < 1 || n > 20);
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.print("Enter the number to search: ");
        int key = scanner.nextInt();
        int result = linearSearch(numbers, key);
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at position: " + (result + 1));
        }
        scanner.close();
    }
}
