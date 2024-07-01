public class MergeSortPro1 {
    
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
    public static void main(String[] args){

        int[] arr1 = {1,3,5,7,9,11};
        sort(arr1);
        int[] arr2 = {2,4,6,8,10,12};
        sort(arr2);
        int[] arr3 = new int[arr1.length+arr2.length];

        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                arr3[k++]=arr1[i++];
            }else if(arr1[i]>arr2[j]){
                arr3[k++]=arr2[j++];
                
            }
        }
        while(i<arr1.length){
            arr3[k++]=arr1[i++];
        }
        while(j<arr1.length){
            arr3[k++]=arr1[j++];
        }
        for(int d=0;d<arr3.length;d++){
        
            System.out.println(arr3[d]);
        }
    }
}
