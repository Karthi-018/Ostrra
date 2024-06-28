import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[] = new int[10];
        System.out.println("Enter 10 numbers");
        for(int i = 0; i < 10; i++) {
            nums[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        // sorting
        for(int i = 0; i < nums.length; i++) {
            min = nums[i];
            for(int j = i; j < nums.length; j++) {
                if(nums[j] < min) {
                    min = nums[j];
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        // Printing
        System.out.println("Sorted list using bubble sort");
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }

        sc.close();
    }
}
