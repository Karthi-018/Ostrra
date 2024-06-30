import java.util.Scanner;

public class mergeSort  {

    public static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; ++i) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            rightArray[j] = array[mid + 1 + j];
        }
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        System.out.println("Enter 10 elements for the first array:");
        for (int i = 0; i < 10; i++) {
            array1[i] = scanner.nextInt();
        }
        System.out.println("Enter 10 elements for the second array:");
        for (int i = 0; i < 10; i++) {
            array2[i] = scanner.nextInt();
        }
        int[] mergedArray = new int[20];
        for (int i = 0; i < 10; i++) {
            mergedArray[i] = array1[i];
        }
        for (int i = 0; i < 10; i++) {
            mergedArray[10 + i] = array2[i];
        }
        mergeSort(mergedArray, 0, mergedArray.length - 1);
        System.out.println("Sorted merged array:");
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }

        scanner.close();
    }
}
