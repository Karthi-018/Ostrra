import java.util.Scanner;

public class bubbleSort{
    public static void main(String[] args){
        System.out.println("Enter marks of the 10 students");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        sort(arr);
        System.out.println("Sorted marks - ");
        for(int s : arr){
            System.out.print(s + " ");
        }
    }

    public static void sort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}