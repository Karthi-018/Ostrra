import java.util.Scanner;

public class Insertion {
    public static int[] sort(int[] arr) {
       
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int k = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > k) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = k;
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

    

