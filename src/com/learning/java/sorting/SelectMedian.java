package com.learning.java.sorting;

import java.util.ArrayList;

public class SelectMedian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{12,5,6,1,7,3,8,53,32,1,56,13};
		System.out.println(rSelect(arr, 0, arr.length - 1, 3));
	}

	private static Integer partition(int[] arr, Integer low, Integer high) {
		Integer value = arr[high];
		Integer tmp;
		Integer j = low - 1;
		for(int i = low; i < high; i++){
			if(arr[i] < value){
				j = j + 1;
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
		}
		tmp = arr[high];
		arr[high] = arr[j + 1];
		arr[j + 1] = tmp;

		return j + 1;
	}
	
	private static int rSelect(int[] arr, int p, int r, int i) {
		int q, k;
		if(p == r)
			return p;
		else{
			 q = partition(arr, p, r);
			 k = q - p + 1;
			 if(k == i)
				 return arr[q];
			 else if(k > i){
				 return rSelect(arr, p, q - 1, i);
			 }
			 else{
				 return rSelect(arr, q + 1, r, i - k);
			 }
		}
	}

}
