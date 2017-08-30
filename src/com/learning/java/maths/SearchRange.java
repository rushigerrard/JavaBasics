package com.learning.java.maths;

public class SearchRange {

	public int searchFirstOccurence(int[] nums, int target, int start, int end){
		while(start < end){
			int middle = (start + end) / 2;
			if(nums[middle] < target){

				start = middle + 1;
			}else{
				end = middle;
			}

		}
		return start;
	}
	public int searchLastOccurence(int[] nums, int target, int start, int end){
		
		int result = -1;
		
		while(start <= end){
			int middle = (start + end) / 2;
			if(nums[middle] == target){
				result = middle;
				start = middle + 1;
			}
			else if(nums[middle] < target){
				start = middle + 1;
			}else {
				end = middle - 1;
			}
			
		}
		return result;
	}

	public int[] searchRange(int[] nums, int target) {
		int[] arr = new int[2];
		arr[0] = searchFirstOccurence(nums, target, 0, nums.length - 1);
		System.out.println(arr[0] + " , " + arr[1]);
		
		arr[1] = searchLastOccurence(nums, target, 0, nums.length - 1);
		System.out.println(arr[0] + " , " + arr[1]);
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[]{5, 7, 7, 8, 8, 10};
		int target = 8;
		SearchRange sr = new SearchRange();
		sr.searchRange(arr, target);
	}


}
