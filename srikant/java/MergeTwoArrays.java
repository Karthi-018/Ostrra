public class MergeTwoArrays{
    public static int[] merge(int[] arr1, int[] arr2){
        int l1 = arr1.length;
        int l2 = arr2.length;
        int[] result = new int[l1 + l2];
        int i = 0,j = 0,k = 0;
        while(i<l1 && j<l2){
            if(arr1[i] < arr2[j])
                result[k++] = arr1[i++];
            else if(arr2[j] < arr1[i])
                result[k++] = arr2[j++];    
        }
            while(i<l1){
                result[k++] = arr1[i++];
            }

            while(j<l2){
                result[k++] = arr2[j++];
            }
        return result;
    }

    public static void bubbleSort(int[] arr){
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

    public static void print(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr1 = new int[]{40,20,80,60};
        int[] arr2 = new int[]{30,90,70,10,50};
        bubbleSort(arr1);
        bubbleSort(arr2);
        print(arr1);
        print(arr2);
        int[] result = merge(arr1,arr2);
        print(result);

    }
}