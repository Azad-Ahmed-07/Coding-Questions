package practice.code._Array;

public class ReverseArray {
	/*
	 * <code>rversrseArrayIterative</code> returns array in reverse by iterative way
	 * 
	 * @param arr array of <T> type 
	 * @param start starting range of array
	 * @param end End range of array 
	 * 
	 * @author Azad Ahmed
	 * 
	 */
	public static <T> T[] rversrseArrayIterative (T[] arr, int start , int end){
		T temp;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] =  temp;
			start ++ ;
			end -- ;
		}
		return arr ;
	}
	
	/*
	 * <code> reverseArrayRecursive</code>  returns array in reverse by recursive way
	 * @param array of type <T> type
	 * @start  start index of array
	 * @param end index of array
	 */
	public static <T> void reverseArrayRecursive(T[] arr , int start , int end) {
		T temp;
		if ( start >= end )
			return;
		temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp ;
		reverseArrayRecursive(arr, start+1, end-1);
	}
}
