import java.util.Random;

public class BubbleSortMarksQues {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Random r = new Random();
        for (int i = 0; i < 10; i++)
            arr[i] = r.nextInt(100);

        System.out.println("ARRAY BEFORE SORTING");
        for (int i : arr)
            System.out.print(i + " ");

        for (int i = 0; i < 10; i++)
            for (int j = 0; j < 10 - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        System.out.println("\nARRAY AFTER SORTING");
        for (int i : arr)
            System.out.print(i + " ");
    }
}
