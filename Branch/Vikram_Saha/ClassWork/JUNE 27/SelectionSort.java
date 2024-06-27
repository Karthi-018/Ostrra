import java.util.Random;

public class SelectionSort {
public static void main(String[] args) {
     int arr[] = new int[10];
        Random r = new Random();
        for (int i = 0; i < 10; i++)
            arr[i] = r.nextInt(100);
            System.out.println("ARRAY BEFORE SORTING");
            for (int i : arr)
                System.out.print(i + " ");
        int mini=0;
        for(int i=0;i<10;i++){
            mini=i;
            for(int j=i;j<10;j++){
                if(arr[j]<arr[mini]){mini=j;
                }
               
            }
            int temp = arr[mini];
                    arr[mini] = arr[i];
                    arr[i] = temp;
            
        }
        System.out.println("\nARRAY AFTER SORTING");
        for (int i : arr)
            System.out.print(i + " ");
}
}
