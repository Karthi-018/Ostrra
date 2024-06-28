import java.util.Scanner;

public class Bubble {
    public static int[] sort(int[] arr)
    {
        int n=arr.length;
        int i, j, temp;
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n- i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
         }
        return arr;   
    }
    public static void main(String a[]){
        int[] arr = new int[20];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<20;i++){
            arr[i]=sc.nextInt();
        }
        sort(arr);
        for(int i=0;i<20;i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}