import java.util.Scanner;

public class Shell {
    public static int[] sort(int[] arr) {
       
        int n = arr.length;
        for (int step = n/2; step > 0; step /= 2)
        {
        for (int i = step; i < n; ++i) {
            int k = arr[i];
            int j = i;
            while (j >= step && arr[j-step] > k) {
                arr[j] = arr[j-step];
                j--;
            }
            arr[j] = k;
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