import java.util.Scanner;

public class LinearSearch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[20];
    System.out.println("Enter the elements of an array: ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println("Enter the number for search:");
    int x = sc.nextInt();

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == x) {
        System.out.println(x + " is found");

      }

    }

  }

}
