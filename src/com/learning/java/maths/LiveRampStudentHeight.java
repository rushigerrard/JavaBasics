package com.learning.java.maths;

import java.util.Arrays;

public class LiveRampStudentHeight {

	public int solution(int[] A) {
		
		int start = 0, end = -1;
		int[] copyA = Arrays.copyOf(A, A.length);
		Arrays.sort(copyA);
		
		for(int i = 0; i < A.length; i++){
			if(A[i] != copyA[i]){
				start = i;
				break;
			}
		}
		for(int i = A.length - 1; i >= 0; i--){
			if(A[i] != copyA[i]){
				end = i;
				break;
			}
		}
		return end - start + 1;
	}
	public static void main(String[] args){
		LiveRampStudentHeight lrsh = new LiveRampStudentHeight();
		int[] a = new int[]{2, 1};
		
		System.out.println(lrsh.solution(a));
	}
}
