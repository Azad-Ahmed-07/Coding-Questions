package practice.code._Array;

import java.util.Arrays;

/*
 * Given an array arr[] and a number K where K is smaller than size of array, 
 * the task is to find the Kth smallest element in the given array. 
 * It is given that all array elements are distinct.
 * 
 * @param
 * @param K - 
 */
// 1 2 2 3 4 5 6
public class Kth_MaxAndMinOfArray {
	public static int kthSmallestElement(int[] arr, int k) {
		Arrays.sort(arr);
		int kthSmallest = arr[0];
		k--;
		for(int i=1;k > 0  && i <= arr.length - 1 ; i++) {
			if(kthSmallest == arr[i]) {
				continue;
			}
			kthSmallest = arr[i];
			k--;
		}
		return kthSmallest;
	}
}
