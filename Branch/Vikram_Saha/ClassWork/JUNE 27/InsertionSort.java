import java.util.Random;

public class InsertionSort {
public static void main(String[] args) {
     int arr[] = new int[10];
        Random r = new Random();
        for (int i = 0; i < 10; i++)
            arr[i] = r.nextInt(100);
            System.out.println("ARRAY BEFORE SORTING");
            for (int i : arr)
                System.out.print(i + " ");
        for(int i=0;i<10;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                else break;
            }
        }
        System.out.println("\nARRAY AFTER SORTING");
        for (int i : arr)
            System.out.print(i + " ");
}
}
