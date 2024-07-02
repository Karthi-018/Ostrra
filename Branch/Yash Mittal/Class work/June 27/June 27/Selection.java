public class Selection {
    static void sort(int arr[]){
        int n= arr.length;
        for (int i = 0; i< n-1;i++) {
            int minIndex =i;
            for(int j=i+1;j<n;j++){
            if(arr[minIndex]>arr[j]) minIndex=j;
            int temp = arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    }   
}
static void print(int arr[]){
    int i, l=arr.length;
    for (i = 0; i < l; i++){
        System.out.print(arr[i] + " ");
        System.out.println();
    }
}
public static void main(String[] args) {
    int[] arr= {10,6,3,8,7,1};
    sort(arr);
    print(arr);

}

}
