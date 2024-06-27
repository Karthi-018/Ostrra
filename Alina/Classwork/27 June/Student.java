public class Student 
{
  public static void bubbleSort(int[] arr) 
  {
    int n=arr.length;
    for(int i=0;i<n-1;i++)
    {
        for(int j=0;j<n-1-i;j++)
        {
            if(arr[j]>arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
  }
  public static void displayArray(int[]arr) 
  {
for (int i=0;i<arr.length;i++)
{
    System.out.print(arr[i]+" ");
}
  System.out.println();    
  }
public static void main(String[] args) {
    int[] marks={88,76,73,92,98,91};
    System.out.println("Original Array");
    displayArray(marks);
    bubbleSort(marks);
    System.out.println("Sorted array:");
    displayArray(marks);
}
}
