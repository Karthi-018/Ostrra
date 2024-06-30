import java.util.Scanner;
public class arraySort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr1 = new int[10];
        int[] arr2=new int[10];
        int[] mergedArray=new int[20];
       System.out.println("Enetr elements of first array:");
       for(int i=0;i<10;i++)
       {
        arr1[i]=sc.nextInt();
       }  
       System.out.println("Enetr elements of second array:");
       for(int i=0;i<10;i++)
       {
        arr2[i]=sc.nextInt();
       }  
       for (int i = 0; i < 10; i++) {
        mergedArray[i] = arr1[i];
    }
    for (int i = 0; i < 10; i++) {
        mergedArray[10 + i] = arr2[i];
    }

    for (int i = 0; i < mergedArray.length - 1; i++) {
        for (int j = 0; j < mergedArray.length - 1 - i; j++) {
            if (mergedArray[j] > mergedArray[j + 1]) {
                int temp = mergedArray[j];
                mergedArray[j] = mergedArray[j + 1];
                mergedArray[j + 1] = temp;
            }
        }
    }
    System.out.println("Merged and sorted array:");
    for (int i = 0; i < mergedArray.length; i++) {
        System.out.print(mergedArray[i] + " ");
    }
    sc.close();   
}   
   
}




