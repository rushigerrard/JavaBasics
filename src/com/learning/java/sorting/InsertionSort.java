package com.learning.java.sorting;

public class InsertionSort{
	public static void main(String args[]){
		int[] arr = {12,5,6,1,7,3,8,53,32,1,56,13};
		long current = System.currentTimeMillis();
		
		insertionSort(arr);
		long end = System.currentTimeMillis() - current;
		System.out.println("Time is " + end);
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
	
	public static int[] insertionSort(int[] arr){
		int value, hole, i;
		for(i = 1; i < arr.length; i++){
			value = arr[i];
			hole = i;
			while(hole > 0 && arr[hole - 1] > value){
				arr[hole] = arr[hole - 1];
				hole = hole - 1;
			}
			arr[hole] = value;
		}
		return arr;
	}
}