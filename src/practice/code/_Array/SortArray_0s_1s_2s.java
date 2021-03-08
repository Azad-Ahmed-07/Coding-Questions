package practice.code._Array;

public class SortArray_0s_1s_2s {
	/*
	 * Problem :: Given an array A[] consisting 0s, 1s and 2s. The task is to write a function that sorts the given array
	 */
	
	
	/*
	 * Solution ::
	 * https://www.geeksforgeeks.org/sort-an-array-of-0s-1s-and-2s/
	 * 
	 * Method 1 #
	 * Approach:The problem is similar to our old post Segregate 0s and 1s in an array, and both of these problems are 
	 * variation of famous Dutch national flag problem.
	 * The problem was posed with three colours, here `0′, `1′ and `2′. The array is divided into four sections:

	 * 1. a[1..Lo-1] zeroes (red)
	 * 2. a[Lo..Mid-1] ones (white)
	 * 3. a[Mid..Hi] unknown
	 * 4. a[Hi+1..N] twos (blue)
	 * 
	 * Dutch National Flag Algorithm OR 3-way Partitioning:
	 * 
	 * At first, the full array is unknown. There are three indices – low, mid and high. Initially, the value of low = mid = 1 and high = N.
	 * # If the ith element is 0 then swap the element to the low range, thus shrinking the unknown range.
	 * # Similarly, if the element is 1 then keep it as it is but shrink the unknown range.
	 * # If the element is 2 then swap it with an element in high range.

	 * Algorithm ::
	 * 
	 * 1. Keep three indices low = 1, mid = 1 and high = N and there are four ranges, 1 to low (the range containing 0), low to mid (the range containing 1), mid to high (the range containing unknown elements) and high to N (the range containing 2).
	 * 2. Traverse the array from start to end and mid is less than high. (Loop counter is i)
	 * 3. If the element is 0 then swap the element with the element at index low and update low = low + 1 and mid = mid + 1
	 * 4. If the element is 1 then update mid = mid + 1
	 * 5. If the element is 2 then swap the element with the element at index high and update high = high – 1 and update i = i – 1. As the swapped element is not processed
	 * 6. Print the output array.
	 * 
	 * 
	 */
	
	//Sort using Dutch National Flag Algo
	/*
	 * 	0	0	0	1	1	1	?	?	?	?	2	2	2
	 *              |			|			|				
	 *             low		   mid		   high
	 *             
	 * 
	 * 
	 */
	public static int[] sortUsingDNF_algo(int[] arr, int arr_size) {
		// low, mid and high are ranging index
		int low = 0 ;
		int mid = 0 ;
		int high = arr_size -1 ;
		int temp = 0;
		while (mid <= high) {
			switch (arr[mid]) {
			case 0:
				temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				low ++;
				mid ++;
				break;
			case 1:
				mid++;
				break;
				
			case 2:
				temp = arr[high];
				arr[high] = arr[mid];
				arr[mid] = temp;
				high --;
				break;					
			}
		}
		return arr;
	}
	
	
	

}
