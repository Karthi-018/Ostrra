public class Insertion {
    static void sort(int arr[]){
        int n= arr.length;
        for(int i =1;i<n;i++){
            int key = arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
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

