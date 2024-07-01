import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int arr[] = new int[6];
       System.out.println("Enter the elements of an array: ");
       for(int i =0;i<6;i++){
        arr[i] = sc.nextInt();
       }

       for (int i=0;i<arr.length-1; i++) {
        int min_index = i;
  
        for (int j = i + 1; j < arr.length; j++) {
  
         
          if (arr[j] < arr[min_index]) {
            min_index = j;
          }
        }
  
       
        int temp = arr[i];
        arr[i] = arr[min_index];
        arr[min_index] = temp;
      }
      System.out.println("Sorted list is:");
      for(int i=0;i<arr.length;i++){
          System.out.println(arr[i]);
      }
    
}
}
