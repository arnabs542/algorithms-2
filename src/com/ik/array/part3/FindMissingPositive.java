package com.ik.array.part3;

import java.util.LinkedList;
import java.util.List;

class FindMissingPositive {

	/*
	 * Utility function that puts all non-positive (0 and negative) numbers on
	 * left side of arr[] and return count of such numbers
	 */
	static int segregate(int arr[], int size) {
		int j = 0, i;
		for (i = 0; i < size; i++) {
			if (arr[i] <= 0) {
				int temp;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				// increment count of non-positive
				// integers
				j++;
			}
		}
		return j;
	}

	/*
	 * Find the smallest positive missing number in an array that contains all
	 * positive integers
	 */
	static int findMissingPositive(int arr[], int size) {
		int i;

		// Mark arr[i] as visited by making
		// arr[arr[i] - 1] negative. Note that
		// 1 is subtracted because index start
		// from 0 and positive numbers start from 1
		for (i = 0; i < size; i++) {
			if (Math.abs(arr[i]) - 1 < size && arr[Math.abs(arr[i]) - 1] > 0)
				arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
		}

		// Return the first index value at which
		// is positive
		for (i = 0; i < size; i++)
			if (arr[i] > 0)
				return i + 1; // 1 is added becuase indexes
								// start from 0

		return size + 1;
	}

	/*
	 * Find the smallest positive missing number in an array that contains both
	 * positive and negative integers
	 */
	static int findMissing(int arr[], int size) {
		// First separate positive and
		// negative numbers
		int shift = segregate(arr, size);
		int arr2[] = new int[size - shift];
		int j = 0;
		for (int i = shift; i < size; i++) {
			arr2[j] = arr[i];
			j++;
		}
		// Shift the array and call
		// findMissingPositive for
		// positive part
		return findMissingPositive(arr2, j);
	}

	// main function
	public static void main(String[] args) {
		// int arr[] = {10, 1, 1, -10, -20};
		// int arr[] = {3, 4, -1, 1};
		// int arr[] = {1, 1, 1};

		// int arr[] = {4, -1, 7, -5, 10, 20};

		int arr[] = { 2, 3, 4, 1, -20, 10 };

		int arr_size = arr.length;
		int missing = findMissing(arr, arr_size);
		System.out.println("The smallest positive missing number is " + missing);
	}
	
	public static List<List<Integer>> f3(int[] n) {
	    return f3(n, 0);
	}
	
	private static List<List<Integer>> f3(int[] n, int i) {
	    if (i == n.length) {
	        List<List<Integer>> toReturn = new LinkedList<List<Integer>>();
	        toReturn.add(new LinkedList<Integer>());
	        return toReturn;
	    }
	    List<List<Integer>> toReturn = new LinkedList<List<Integer>>();
	    for (List<Integer> result : f3(n, i+1)) {
	        toReturn.add(new LinkedList<Integer>(result));
	        result.add(0, n[i]);
	        toReturn.add(new LinkedList<Integer>(result));
	    }
	    return toReturn;
	}
	
}