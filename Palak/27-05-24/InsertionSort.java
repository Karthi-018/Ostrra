import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int arr[] = new int[6];
       System.out.println("Enter the elements of an array: ");
       for(int i =0;i<6;i++){
        arr[i] = sc.nextInt();
       }
       for(int i=0;i<arr.length;i++){
        int key = arr[i];
        int j= i-1;
        while(j>=0 && arr[j]>key){
            arr[j+1]=arr[j];
            j=j-1;

        }
        arr[j+1] = key;

    }
    System.out.println("Sorted list is:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

}
}
