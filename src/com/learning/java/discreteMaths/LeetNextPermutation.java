package com.learning.java.discreteMaths;

import java.util.Arrays;

public class LeetNextPermutation {

	public void nextPermutation(int[] nums) {
		int swapElementIndex = 0;
		int diff = Integer.MAX_VALUE;
		for (int i = nums.length - 1; i >= 0; i--) {
			if (i > 0 && nums[i] > nums[i - 1]) {

				for (int j = i; j < nums.length; j++) {
					if (nums[j] > nums[i - 1]) {
						if ((nums[j] - nums[i - 1]) < diff) {
							diff = (nums[j] - nums[i - 1]);
							swapElementIndex = j;
						}
					}
				}
				int tmp = nums[i - 1];
				nums[i - 1] = nums[swapElementIndex];
				nums[swapElementIndex] = tmp;

				Arrays.sort(nums, i, nums.length);

				return;
			}
		}
		Arrays.sort(nums);
		return;
	}

	public static void main(String[] args) {
		LeetNextPermutation lnp = new LeetNextPermutation();
		int[] nums = new int[] { 1, 2, 3, 6, 4, 2 };
		for (int k = 0; k < nums.length; k++) {
			System.out.print(nums[k] + " , ");
		}
		System.out.println();
		System.out.println("------------------");
		lnp.nextPermutation(nums);
		Arrays.sort(nums);
		System.out.println();
		System.out.println("------------------");
		for (int k = 0; k < nums.length; k++) {
			System.out.print(nums[k] + " , ");
		}
	}

}
