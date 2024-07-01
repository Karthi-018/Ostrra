import java.util.Random;

public class MergeArraysAndSort {
    public static int[] merge2ArrUsingMerge(int[] a, int[] b) {
        int[] arr = a;
        int mini = 0;
        for (int i = 0; i < 10; i++) {
            mini = i;
            for (int j = i; j < 10; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }

            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;

        }
        a = arr;

        arr = b;
        mini = 0;
        for (int i = 0; i < 10; i++) {
            mini = i;
            for (int j = i; j < 10; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }

            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;

        }
        b = arr;

        int i1 = 0, i2 = 0;
        int[] res = new int[a.length + b.length];
        int k = 0;

        while (i1 < a.length && i2 < b.length) {
            if (a[i1] < b[i2]) {
                res[k++] = a[i1++];
            } else
                res[k++] = b[i2++];
        }
        while (i1 < a.length)
            res[k++] = a[i1++];
        while (i2 < b.length)
            res[k++] = b[i2++];

        return res;

    }

    static void add(int a, int b) {
        a = 4;
        b = 3;
    }

    public static int[] merge2Arr(int[] a, int[] b) {

        int[] arr = new int[a.length + b.length];
        int k = 0;
        for (int i : a)
            arr[k++] = i;
        for (int i : b)
            arr[k++] = i;

        int mini = 0;
        for (int i = 0; i < 10; i++) {
            mini = i;
            for (int j = i; j < 10; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }

            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;

        }
        return arr;
    }

    public static void main(String[] args) {
        int x = 0, y = 1;
        add(x, y);
        System.out.println(" hi ->" + x + y);
        int arr[] = new int[10];
        Random r = new Random();
        for (int i = 0; i < 10; i++)
            arr[i] = r.nextInt(100);
        int arr2[] = new int[10];
        for (int i = 0; i < 10; i++)
            arr2[i] = r.nextInt(100);
        System.out.println("ARRAY BEFORE SORTING ->");
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
        for (int i : arr2)
            System.out.print(i + " ");
        int[] res = merge2ArrUsingMerge(arr, arr2);

        System.out.println("\nARRAY AFTER SORTING");
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
        for (int i : arr2)
            System.out.print(i + " ");
        System.out.println("\nMERGED SORTED ARRAY -> ");
        for (int i : res)
            System.out.print(i + " ");

    }
}
