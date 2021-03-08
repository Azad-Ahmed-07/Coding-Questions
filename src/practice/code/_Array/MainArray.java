package practice.code._Array;

import practice.code._Array.MaxAndMinOfArray.Pair;

public class MainArray {

	public static void main(String[] args) {
		Integer[] intArr = {10,20,30,50,60};
		Integer[] arr = ReverseArray.rversrseArrayIterative(intArr, 0, intArr.length - 1 );
		printArray(arr);
		
		String[] strArr = {"one", "two", "three", "four", "five"};
		ReverseArray.reverseArrayRecursive(strArr, 0, strArr.length - 1);
		printArray(strArr);
		
		// Find Min and Max
		print("Find min and Max from a Array");
		int[] minMAxArray = {1000, 11, 445, 1, 330, 3000};
		Pair p = MaxAndMinOfArray.getMinMax_1( minMAxArray , 6);
		System.out.println(p);
		
		// Kth smallest element 
		print("Kth Smallest element :: ");
		int[] kArr = {8, 1, 1, 3, 4, 10, 12, 12, 6 };
		print(Kth_MaxAndMinOfArray.kthSmallestElement(kArr, 2));
		
		//Sort of array containing 0s 1s 2s
		print("Sort of array containing 0 1 2 :: ");
		int[] arr012s = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		arr012s= SortArray_0s_1s_2s.sortUsingDNF_algo(arr012s,arr012s.length);
		printIntArray(arr012s);
		
		//Move all Negetive int in the begininig of Array
		print("Move negetive int in begining of Array");
		int[] arr2 = {-100, 0, 2, -1, 2, 5 , -5, 2, 3, -2};
		MoveAllNegetiveNoInTheBegining.reArrangeArray(arr2, arr2.length);
		printIntArray(arr2);
		print("Re-Arrange using two pointer");
		int[] arr3 = {-100, 0, 2, -1, 2, 5 , -5, 2, 3, -2};
		MoveAllNegetiveNoInTheBegining.reArrangeArray2Pointer(arr3, 0, arr3.length - 1);
		printIntArray(arr3);
		
		//Print union and Intersection of two sorted array
		int[] array1 = {1, 2, 2, 4,  4, 5, 6};
		int[] array2 = {2, 3, 5, 7, 7};
		
		//Unions
		print("Unions of Two Array");
		UnionAndIntersecOfSortedArray.printUnion2Pointers(array1, array2, array1.length, array2.length);
		print(" ");
		print("Unions by Removing duplicate");
		//Unions By Removing Duplicates
		UnionAndIntersecOfSortedArray.printUnionOfArrays2(array1, array2, array1.length, array1.length);
		print(null);
		
		
		// Cycliclically Rotate a Array by One
		print("Cyclically Rotate Array By One");
		int[] cArr = {1, 2, 3, 4, 5, 6};
		CyclicallyRotateArrayByOne.rotate(cArr, cArr.length);
		printIntArray(cArr);
		
		//Largest Contigious Sub Array
		print("Largest sum of Contigious Sub-Array  :: Brute Force ");
		int LCSA =  LargestContigiousSubArray.largestSumOfSubArray2Loop(new int[] {-2, -3, 4, -1, -2, 1, 5, -3});
		print(LCSA);
		
		//Largest Contigious Sub Array
		print("Largest contigious sub-Array  :: Kadane's Algorithm");
		int LCSA1 = LargestContigiousSubArray.largestSumOfSubArray(new int[] {-2, -3, 4, -1, -2, 1, 5, -3});
		print(LCSA1);
		
		print("Minimize the maximum difference between the heights");
		int[] minMaxDiffArr = {1, 10, 14, 14, 14, 15};
		int resMinDiff = MinimizeMaximumHeight.getMinDifferenceHeight(minMaxDiffArr, minMAxArray.length, 6);
		print(resMinDiff);
		
		
		
	}
	
	/*
	 * Utility function to print array 
	 */
	private static <T> void printArray ( T[] arr ) {
		for(int i = 0; i < arr.length ; i++ ) {
			System.out.print(arr[i].toString()+" ");
		}
		System.out.println();
	}
	
	private static void printIntArray(int[] arr) {
		for(int i : arr) {
			System.out.print(i+" ");
		}
		print("");
	}
	/*
	 * 
	 */
	private static void print(Object ele) {
	 if(ele != null) {
		 System.out.println(ele.toString());
	 }
	 else {
		 System.out.println();
	 }
	}
	
	
}
