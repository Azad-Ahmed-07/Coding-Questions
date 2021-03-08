package practice.code._Array;

public class MoveAllNegetiveNoInTheBegining {
	/*
	 * 
	 * Move all negative numbers to beginning and positive to end with constant extra space
	 * 
	 * An array contains both positive and negative numbers in random order. 
	 * Rearrange the array elements so that all negative numbers appear before all positive numbers.
	 * 
	 */
	
	/*
	 * Solution#1 ::  The idea is to simply apply the partition process of quicksort. 
	 */
	public static void reArrangeArray(int[] array, int size) {
		int j=0 ,temp; // j -> First pointer 
		for(int i = 0 ; i < size ; i++) {
			if(array[i] < 0) { //if array[j] is negetive but in first place that will not swapped but j increased
				if(i != j) {
					//Swapping two integer
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
				j++;
			}
		}
	}
	
	/*
	 * Two Pointers Approach
	 * 
	 * 1.Check If the left and right pointer elements are negative then simply increment the left pointer.
	 * 2.Otherwise, if the left element is positive and the right element is negative then simply swap the elements, and Simultaneously increment or decrement the left and right pointers.
	 * 3.Else if the left element is positive and the right element is also positive then simply decrement the right pointer.
	 * 4.Repeat the above 3 steps until the left pointer ≤ right pointer
	 * 
	 */
	public static void reArrangeArray2Pointer(int[] array, int first , int last) {
		int temp;
		while(first <= last) {
			// Condition to check if the left
	        // and the right elements are
	        // negative
			if(array[first] < 0 && array[last] < 0 ) {
				first++;
			}
			// Condition to check if the left
	        // pointer element is positive and
	        // the right pointer element is negative
			else if(array[first] >= 0 && array[last] < 0 ) {
				//Swap
				temp = array[first];
				array[first] = array[last];
				array[last] = temp;
				first ++;
				last --;
			}
			// Condition to check if both the
	        // elements are positive
			else if(array[first] >= 0 && array[last] > 0) {
				last --;
			}
			else {
				first ++;
				last --;
			}
		}
	}
}
