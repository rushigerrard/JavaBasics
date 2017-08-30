package com.ads.tree.intervals;

public class RushiSegmentTree {


	int st[]; // The array that stores segment tree nodes
	
	public RushiSegmentTree(int[] arr, int n) {
		
	}

	public static void main(String[] args) {
		int arr[] = {1, 3, 5, 7, 9, 11};
		int n = arr.length;
		RushiSegmentTree tree = new RushiSegmentTree(arr, n);

/*		// Build segment tree from given array

		// Print sum of values in array from index 1 to 3
		System.out.println("Sum of values in given range = " +	tree.getSum(n, 1, 3));

		// Update: set arr[1] = 10 and update corresponding segment
		// tree nodes
		tree.updateValue(arr, n, 1, 10);

		// Find sum after the value is updated
		System.out.println("Updated sum of values in given range = " +
				tree.getSum(n, 1, 3));*/

	}

}
