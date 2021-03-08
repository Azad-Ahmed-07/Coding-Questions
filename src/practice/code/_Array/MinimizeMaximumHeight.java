package practice.code._Array;

import java.util.Arrays;

/*
 * ** Minimize the maximum difference between the heights **
 * 
 * Given heights of n towers and a value k. We need to either increase or decrease height of every tower by k (only once) where k > 0. 
 * The task is to minimize the difference between the heights of the longest and the shortest tower after modifications, and output this difference.
 * 
 * Example ::
 * Input  : arr[] = {1, 15, 10}, k = 6
 * Output :  Maximum difference is 5.
 * Explanation : We change 1 to 6, 15 to 
 * 9 and 10 to 4. Maximum difference is 5
 * (between 4 and 9). We can't get a lower
 * difference.
 * 
 */
public class MinimizeMaximumHeight {
	// Modifies the array by subtracting/adding 
	// k to every element such that the difference 
	// between maximum and minimum is minimized 
	public static int getMinDifferenceHeight(int[] arr, int size, int k) {
		if( size < 0 ) {
			return -1;
		}
		Arrays.sort(arr);
		
		// Initialized result
		int ans = arr[size-1] - arr[0];
		
		// Hndle Corner Element
		int small = arr[0] + k ;
		int big = arr[size-1] - k;
		
		if(small > big ) {
			//swap
			int temp = big;
			big = small;
			small = temp;
		}
		for(int i = 1 ; i < arr.length ; i++) {
			
			int subtract = arr[i] - k; 
            int add = arr[i] + k;
			//// Either subtraction causes a smaller 
			// number or addition causes a greater 
			// number. Update small or big using 
			// greedy approach (If big - subtract 
			// causes smaller diff, update small 
			// Else update big)
			
			if(big - subtract <= add - small) {
				small = subtract; 
			}
			else
				big = add; 
          }
		return Math.min(ans, big - small);
	}

}
