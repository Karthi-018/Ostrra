public class Squares {
	public static void main(String args[]) {
		int sum = 0;
		int nums[] = {72, 51, 30, 17, 13, 47, 31, 7, 15, 3};
		for(int i =0; i < nums.length; i++) {
			if(nums[i]%2 != 0) {
				System.out.print(nums[i]*nums[i] + " ");
				sum += (nums[i]*nums[i]);
				
			}
		}
		
		System.out.println("\nThe sum is "+sum);
		
		// Sorting
		for(int i =0; i < nums.length; i++) {
			for(int j = i+1; j < nums.length; j++) {
				if(nums[i] > nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}  
			}
		}
		
		System.out.println("Sorted Sqaure");
		
		for(int i =0; i < nums.length; i++) {
			if(nums[i]%2 != 0) {
				System.out.print(nums[i]*nums[i]+ " ");
				
			}
		}
		
	}
}

