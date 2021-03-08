package practice.code._Array;

/*
 * Write an efficient program to find the sum of contiguous subarray within a one-dimensional array of numbers which has the largest sum.
 */
public class LargestContigiousSubArray {
	// Using Kadanes Algorithm
	static int largestSumOfSubArray(int[] arr) {
		int curr_max = 0 , max_so_far = Integer.MIN_VALUE;
		for(int i = 0 ; i < arr.length ; i++) {
			curr_max = Math.max(arr[i],arr[i] + curr_max);
			max_so_far = Math.max(curr_max, max_so_far);
		}
		return max_so_far;
	}
	
	//
	static int largestSumOfSubArray2Loop(int[] arr) {
		int largest_sum = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			int tempSum = 0;
			for(int j = i; j < arr.length ; j++) {
				tempSum +=arr[j];
				if(largest_sum < tempSum) {
					largest_sum =  tempSum;
				}
			}
		}
		return largest_sum;
	}
}
