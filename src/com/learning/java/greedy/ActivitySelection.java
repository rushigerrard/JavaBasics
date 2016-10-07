package com.learning.java.greedy;

import java.util.ArrayList;
import java.util.Arrays;

import com.learning.java.sorting.QuickSort;

public class ActivitySelection {

	private static ArrayList<Activity> arr = new ArrayList<Activity>();
	
	private static void initialise() {
		int[] s = {1, 3, 0, 5, 3, 5, 6, 8, 8, 12};
		int[] f = {4, 5, 6, 7, 8, 9, 10, 11, 12, 14};
		for(int i = 0; i < 10; i++){
			Activity a = new Activity();
			a.start = s[i];
			a.finish = f[i];
			arr.add(a);
		}	
			
	}

	private static void ActivitySelect() {
		
		initialise();
		//Sort by finish time
		/*
		QuickSortObject q = new QuickSortObject();
		q.quicksort(arr, "finish");
		*/
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActivitySelect();
	}


}
class Activity{
	int start;
	int finish;
}
