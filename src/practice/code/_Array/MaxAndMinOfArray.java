package practice.code._Array;

public class MaxAndMinOfArray {
	static class Pair{
		int min;
		int max;
		
		// Only for printing
		@Override
		public String toString() {
			return "Min -"+ this.min + " Max - "+ this.max ;
		}
	
	}
	
	/*
	 * ** Using Linear Search **
	 *@arr - Array
	 *@size - Size of array
	 */
	public static Pair getMinMax_1(int[] arr, int size) {
		Pair minmax = new Pair();
		minmax.max = Integer.MIN_VALUE;
		minmax.min = Integer.MAX_VALUE;
		
		for(int num : arr) {
			if(minmax.min > num ) {
				minmax.min = num ;
			}
			if(minmax.max < num ) {
				minmax.max = num ;
			}
		}
		
		return minmax;
	}
}
