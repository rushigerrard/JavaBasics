package com.learning.java.dynamicprogramming;

import java.util.Arrays;

public class MatrixChainMultiplication {
	
	static int recursiveCallCount = 0;
	static int memoizationCallCount = 0;
	
	static int n = 3;
	static int q[][] = new int[n][n];
	
	static int map[][] = new int[n][n];
	
	static void initializeMap(){
		for(int i = 0; i < n; i++)
			Arrays.fill(map[i], Integer.MAX_VALUE);
	}
	/*
	static {
		for(int i = 0; i < 5; i++)
			Arrays.fill(map[i], Integer.MAX_VALUE);
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {5, 2, 4};
		long recursiveStartTime, recursiveEndTime;
		long dpStartTime, dpEndTime;
		long memStartTime, memEndTime;
		n = arr.length - 1;
		matrixChainMultiplicationThroughGivenOrder(arr);
		recursiveStartTime = System.nanoTime();
		//System.out.println("Total matrix multiplications needed are  :" + RecursiveMatrixChainOrder(arr, 1, arr.length - 1));
/*		RecursiveMatrixChainOrder(arr, 1, arr.length - 1);
		System.out.println("Recursive call counts = " + recursiveCallCount);
		recursiveEndTime = System.nanoTime();
		System.out.println("Time needed is " + (recursiveEndTime - recursiveStartTime) / 1000000);
*/
		dpStartTime = System.nanoTime();
		MatrixChainOrder(arr, arr.length);
		//System.out.println("Total matrix multiplications needed are  :" +  DP solution MatrixChainOrder(arr, arr.length));
		dpEndTime = System.nanoTime();
		System.out.println("Time needed is " + (dpEndTime - dpStartTime) / 1000);
		
/*		memStartTime = System.nanoTime();
		initializeMap();
		MemoizationMatrixChainOrder(arr, 1,  arr.length - 1);
		System.out.println("Memoization call counts = " + memoizationCallCount);
		//System.out.println("Total matrix multiplications needed are  :" + Memoization solution MemoizationMatrixChainOrder(arr, 1,  arr.length - 1));
		memEndTime = System.nanoTime();
		System.out.println("Time needed is " + (memEndTime - memStartTime) / 1000);
*/
	}

	private static void matrixChainMultiplicationThroughGivenOrder(int[] arr) {
		int len = arr.length;
		int sum = 0;
		for(int i = 2; i < arr.length; i++){
			int prod = arr[0] * arr[i] * arr[i - 1];
			sum = sum + prod;
		}
		System.out.println("Sum is " + sum);
	}

	private static int MemoizationMatrixChainOrder(int[] arr, int i, int j) {
		memoizationCallCount++;
		if(map[i][j] < Integer.MAX_VALUE){
			return map[i][j];
		}
		if(i == j)
			return 0;
		
		for(int k = i; k < j; k++){
			int compute = MemoizationMatrixChainOrder(arr, i, k) + MemoizationMatrixChainOrder(arr, k + 1, j) + arr[i - 1] * arr[k] * arr[j];
			
			if(compute < map[i][j]){
				map[i][j] = compute;
				
			}
				
		}
		return map[i][j];
		
	}
	
	private static int RecursiveMatrixChainOrder(int[] arr, int i, int j) {
		recursiveCallCount++;
		if(i == j)
			return 0;
		
		q[i][j] = Integer.MAX_VALUE;
		for(int k = i; k < j; k++){
			
			int compute = RecursiveMatrixChainOrder(arr, i, k) + RecursiveMatrixChainOrder(arr, k + 1, j) + arr[i - 1] * arr[k] * arr[j];
			
			if(compute < q[i][j]){
				q[i][j] = compute;
			}
				
		}
		return q[i][j];
	}

	private static Integer MatrixChainOrder(int[] arr, int n) {
		int m[][] = new int[n][n];
		int c[][] = new int[n][n];
		int j, q = 0;
		
		
		for(int i = n - 2; i  >= 1; i--){
			for(j = i + 1 ; j <= n - 1; j++){
				if(i == j)
					continue;
				
				m[i][j] = Integer.MAX_VALUE;
				
				for(int k = i; k <= j - 1; k++){

					q = m[i][k] + m[k  +  1][j] + arr[i - 1] * arr[k] * arr[j];
					if(q < m[i][j]){
						m[i][j] = q;
						c[i][j] = k;
					}
				}
			}
		}

		return m[1][n - 1];
	}
}
