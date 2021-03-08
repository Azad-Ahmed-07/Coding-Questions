package practice.code._Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* Given Array of Integers .
 * Write a function to return array of duplicate element
 */
public class FindDuplicates {
	
	/*
	 * iff range of value is 1 <= x <= length(array)
	 */
	public static List<Integer> FindAllDuplicate(int[] array){
		Set<Integer> resSet = new HashSet<Integer>();
		for(int i = 0; i < array.length; i++) {
			int index = Math.abs(array[i]) - 1;
			if(array[index] < 0) {
				resSet.add(array[i]);
			}else {
				array[index] = -array[index];
			}
		}
		return new ArrayList<Integer>(resSet);
	}
}
