public class InsertionSort {
    public static void main(String[] args) {
        int nums[] = {10, 3, 5, 243, 45, 34, 24, 3, 57, 1};

        for(int i = 1; i < nums.length; i++) {
            int temp = nums[i];
            int j = i-1;

            while(j >=0 && nums[j] > temp) {
                nums[j+1] = nums[j];
                j -= 1;
            }
            nums[j+1] = temp;
        }

        // Printing
        System.out.println("Sorted list using bubble sort");
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}
