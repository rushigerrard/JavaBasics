package com.learning.java.dynamicprogramming;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LongestNonDecreasingSubsequence {

	
	private static void LongestNonDecreasingSubsquence(int[] arr) {
		
		int len = arr.length;
		int[] storage = new int[len];
		int[] cameFrom = new int[len];
		storage[0]  = 1;
		cameFrom[0] = 0;
		ArrayList<Integer> s = new ArrayList<>();
		for(int i = 1; i < len; i++){
			storage[i] = 1;
			int max = 0;

			for(int j = i - 1; j >= 0; j--){
				
				if(arr[i] >= arr[j]){
					
					if(max <= storage[j]){
						max = storage[j];
						storage[i] = max + 1;
						cameFrom[i] = j;
					}

				}	 
			}
		}
		for(int i = 0; i < len; i++)
			System.out.print(storage[i] + " , ");
		System.out.println();
		for(int i = 0; i < len; i++)
			System.out.print(cameFrom[i] + " , ");
		
		int max= storage[0]; 
		int maxLocation = 0;
		for(int i = 1; i < len; i++){
			if(storage[i] > max){
				max = storage[i];
				maxLocation = i;
			}
		}
		System.out.println();
		System.out.println("Maximum is " + max +  " at location :" + maxLocation);
		while(max > 0){
			s.add(arr[maxLocation]);
			System.out.println(arr[maxLocation]);
			maxLocation = cameFrom[maxLocation];
			max--;
		}
		Collections.reverse(s);
	}

	public static void main(String[] args) {
		int[] arr = new int[]{3, 45, 23, 9, 3, 1, 99, 108, 76, 12, 77, 16, 18, 4};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " , ");
		}
		System.out.println();
		//int[] arr = new int[]{3, 34, 23, 9, 12, 11, 11, 15};
		LongestNonDecreasingSubsquence(arr);

	}


}
