package com.learning.java.heap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayHeapify {
	public static void main(String[] args){
		Integer[] arr = new Integer[]{1, 2, 11, 22, 6, 3, 4, 8, 32, 43, 12};
		Integer[] minHeap = minHeap(arr);
		System.out.println("Minheap ordering");
		for(Integer i : minHeap){
			System.out.print(i + " , ");
		}
		System.out.println();
		System.out.println("Maxheap ordering");
		Integer[] maxHeap = maxHeap(arr);
		for(Integer i : maxHeap){
			System.out.print(i + " , ");
		}
	}

	private static Integer[] maxHeap(Integer[] arr) {
		Integer[] maximumHeap = new Integer[arr.length + 1];
		maximumHeap[0] = 0;
		for(int i = 0; i < arr.length; i++){
			maximumHeap[i + 1] = arr[i];
		}
		for(int i = maximumHeap.length / 2 + 1; i > 0; i--){
			maxHeapify(maximumHeap, i);
		}
		return maximumHeap;
	}

	private static void maxHeapify(Integer[] maximumHeap, int i) {
		if(2 * i + 1 <= maximumHeap.length){
			System.out.println("Doing heapify on " + i + "," + maximumHeap[i]);
			Integer leftIndex = 2 * i;
			Integer rightIndex = 2 * i + 1;
			Integer largest;
			if(maximumHeap[leftIndex] >= maximumHeap[rightIndex]){
				largest = leftIndex;
			}else{
				largest = rightIndex;
			}
			if(maximumHeap[largest] > maximumHeap[i]){
				int tmp = maximumHeap[largest];
				maximumHeap[largest] = maximumHeap[i];
				maximumHeap[i] = tmp;
				maxHeapify(maximumHeap, i);
			}
		}
	}

	private static Integer[] minHeap(Integer[] arr) {
		Integer[] minimumHeap = new Integer[arr.length + 1];
		minimumHeap[0] = 0;
		for(int i = 0; i < arr.length; i++){
			minimumHeap[i + 1] = arr[i];
		}
		System.out.println("Start heapifying process from " +  (minimumHeap.length / 2 - 1));
		for(int i = minimumHeap.length / 2 + 1; i > 0; i--){
			minHeapify(minimumHeap, i);
		}
		return minimumHeap;
	}

	private static void minHeapify(Integer[] minimumHeap, int i) {
		if(2 * i + 1 <= minimumHeap.length){
		
			System.out.println("Doing heapify on " + i + "," + minimumHeap[i]);
			Integer leftIndex = 2 * i;
			Integer rightIndex = 2 * i + 1;
			
			Integer smallest;
			if(minimumHeap[leftIndex] <= minimumHeap[rightIndex]){
				smallest = leftIndex;
			}else{
				smallest = rightIndex;
			}
			if(minimumHeap[smallest] < minimumHeap[i]){
				int tmp = minimumHeap[smallest];
				minimumHeap[smallest] = minimumHeap[i];
				minimumHeap[i] = tmp;
				minHeapify(minimumHeap, i);
			}
			
		}
	}
		
}
