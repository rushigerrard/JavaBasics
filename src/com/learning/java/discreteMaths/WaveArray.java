package com.learning.java.discreteMaths;

import java.util.Scanner;

public class WaveArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase, T;
		T = sc.nextInt();
		for(int i = 0; i < T; i++){
			int arrSize= sc.nextInt();
			int[] arr = new int[arrSize];
			for(int j = 0; j < arrSize; j++){
				arr[j] = sc.nextInt();
			}
			waveArray(arr);
		}
	}

	private static void waveArray(int[] arr) {
		// TODO Auto-generated method stub
		
	}

}
