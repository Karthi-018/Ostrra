import java.util.Scanner;

public class Bubble{

    static int[] Arrayin(){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter the elements of the array: ");  
        for(int i=0;i<10;i++){
             arr[i]= sc.nextInt();
        }
        return arr;
    }
    static void bubbleSort(int arr[])
    {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < 10; i++) {
            swapped = false;
            for (j = 0; j <91; j++) {
                if (arr[j] > arr[j + 1]) {
                    
                    
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

           
            if (swapped == false)
                break;
        }
    }

    
    static void printArray(int arr[])
    {
        int i;
        for (i = 0; i < 10; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    
    public static void main(String args[])
    {
        int arr[]= Arrayin();
        bubbleSort(arr);
        System.out.println("Sorted array: ");
        printArray(arr);
    }
}
