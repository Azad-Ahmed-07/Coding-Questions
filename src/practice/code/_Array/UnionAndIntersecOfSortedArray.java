package practice.code._Array;

import java.util.ArrayList;
import java.util.List;

public class UnionAndIntersecOfSortedArray {
	/*
	 * Union and Intersection of two sorted arrays
	 */
	
	/***********  PRINT UNION OF 2 ARRAYS ***********************/
	
	/*
	 * Solution #1
	 * 
	 * 1) Use two index variables i and j, initial values i = 0, j = 0 
	   2) If arr1[i] is smaller than arr2[j] then print arr1[i] and increment i. 
	   3) If arr1[i] is greater than arr2[j] then print arr2[j] and increment j. 
	   4) If both are same then print any of them and increment both i and j. 
	   5) Print remaining elements of the larger array.
	 */
	public static void printUnion2Pointers(int[] array1,int[] array2, int size1, int size2) {
		int i = 0, j = 0 ;
		while(i < size1 && j < size2 ) {
			if(array1[i] < array2[j]) {
				System.out.print(array1[i]);
				i++;
			}
			else if(array1[i] > array2[j]) {
				System.out.print(array2[j]);
				j++;
			}
			else {
				System.out.print(array1[i]);
				i++;
				j++;
			}
			System.out.print(" ");		
		}
		
		// Printing remaining array
		if(i < size1) {
			for(int index = i ; i < size1 ;index++) {
				System.out.print(array1[index]);
				System.out.print(" ");
			}
		}
		if(j < size2) {
			for(int index = j ; i < size1 ;index++) {
				System.out.print(array1[index]);
				System.out.print(" ");
			}
		}
	}
	
	/*
	 * Hnadle Duplicate print
	 * 
	 */
	public static void printUnionOfArrays2(int[] array1,int[] array2, int size1, int size2) {
		int i = 0, j = 0;
		List<Integer> resList = new ArrayList<Integer>();
		
		while(i < size1 && j < size2 ) {
			if(resList.contains(array1[i])) { 
				i++;
			}
			if(resList.contains(array2[j])) {
				j++;
			}
			if(array1[i] < array2[j]) {
				resList.add(array1[i]);
				i++;
			}
			else if(array1[i] > array2[j]) {
				resList.add(array2[j]);
				j++;
			}
			else {
				resList.add(array2[j]);
				i++;
				j++;
			}
		}
		
		// Printing remaining array
		if(i < size1) {
			for(int index = i ; i < size1 ;index++) {
				if(!resList.contains(array1[index])) {
					resList.add(array1[index]);
				}
			}
		}
		if(j < size2) {
			for(int index = j ; i < size1 ;index++) {
				if(!resList.contains(array2[index])) {
					resList.add(array2[index]);
				}
			}
		}
		
		for(int num : resList) {
			System.out.print(num+" ");
		}
	}
}
