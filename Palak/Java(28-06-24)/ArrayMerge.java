import java.util.Scanner;

public class ArrayMerge {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int arr1[] = new int[5];
       System.out.println("Enter the elements of an array: ");
       for(int i =0;i<arr1.length;i++){
        arr1[i] = sc.nextInt();
       }
       int arr2[] = new int[7];
       System.out.println("Enter the elements of 2nd array: ");
       for(int i =0;i<arr2.length;i++){
        arr2[i] = sc.nextInt();
       }

       int mergeArr[]= new int[arr1.length+arr2.length];
       for(int i =0;i<arr1.length;i++){
        int j;
        for(j=i+1;j<arr1.length;j++)
        {
            if(arr1[i]>arr1[j]){
            int temp= arr1[i];
            arr1[i]= arr1[j];
            arr1[j]= temp;
            }
        }
        

    }
    for(int i =0;i<arr2.length;i++){
        int j;
        for(j=i+1;j<arr2.length;j++)
        {
            if(arr2[i]>arr2[j]){
            int temp= arr2[i];
            arr2[i]= arr2[j];
            arr2[j]= temp;
            }
        }
        

    }
    int i=0;
    int j=0;
    for(int k=0;k<mergeArr.length;k++){
        if(i<arr1.length && j<arr2.length){
        if(arr1[i]<arr2[j]){
            mergeArr[k]=arr1[i];
            i++;

        }
        else{
            mergeArr[k]=arr2[j];
            j++;


        }
    }
    else{
        if(i>=arr1.length){
            mergeArr[k]=arr2[j];
            j++;
        }
        else{
            mergeArr[k]=arr1[i];
            i++;
        }
    }
}

System.out.println("Sorted And Merged Array: ");
for(int k =0;k<mergeArr.length;k++){
    System.out.print(mergeArr[k]+ " ");
}
    }
    
}
