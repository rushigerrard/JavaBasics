package com.learning.java.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort{
	
	private static Integer partition(ArrayList<Integer> arr, Integer low, Integer high) {
		Integer value = arr.get(high);
		Integer tmp;
		Integer j = low - 1;
		for(int i = low; i < high; i++){
			if(arr.get(i) < value){
				j = j + 1;
				tmp = arr.get(i);
				arr.set(i, arr.get(j));
				arr.set(j, tmp);
			}
		}
		tmp = arr.get(high);
		arr.set(high, arr.get(j + 1));
		arr.set(j+ 1, tmp);
		return j + 1;
	}

	public static ArrayList quickSort(ArrayList<Integer> arr, Integer low, Integer high){
		if(low < high){
			Integer p = partition(arr, low, high);
			quickSort(arr, low, p - 1);
			quickSort(arr, p + 1, high);
		}
		return arr;
	}
	public static void main(String args[]){
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(12,5,6,1,7,3,8,53,32,1,56,13));
		long current = System.currentTimeMillis();
		quickSort(arr, 0, arr.size() - 1);
		long end = System.currentTimeMillis() - current;
		System.out.println("Time is " + end);
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + " ");
		}
	}
}