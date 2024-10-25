package com.metacube;


public class LinearAndBinarySearch {
	/**
	 * To find target in array by linearSearch
	 * @param array in which we want to find target
	 * @param start integer which will show start of array in which we are searching 
	 * @param end integer which will show end of array in which we are searching 
	 * @param target integer which we want to find in array
	 * @return integer index of target if present else -1
	 */
	public int linearSearch(int[] array, int start , int end, int target) {
		if (start > end) {
			return -1;
		}
		
		if (array[start] == target) {
			return start;
		}
		if (array[end] == target) {
			return end;
		}
		
		return linearSearch(array, start+1, end-1, target);
	}
	
	/**
	 * To find target in array by binarySearch
	 * @param array in which we want to find target
	 * @param start integer which will show start of array in which we are searching 
	 * @param end integer which will show end of array in which we are searching 
	 * @param target integer which we want to find in array
	 * @return integer index of target if present else -1
	 */
	public int binarySearch(int array[], int start, int end, int target) {
		if ( start <= end ) {
			int middle = (start + end)/2;
			
			if (array[middle] > target) {
				return binarySearch(array, start, middle-1, target);
			} else if (array[middle] < target) {				
				return binarySearch(array, middle+1, end, target);
			} else {
				return middle;
			}
		}
		
		return -1;
	}
}
