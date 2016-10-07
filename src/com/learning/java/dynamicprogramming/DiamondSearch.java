package com.learning.java.dynamicprogramming;

public class DiamondSearch {

	private static int n = 5;
	private static int[][] arr = {{0, 1, 0, 1, 1, 0},{1, 0, 1, 0, 1, 0},{1, 1, 0, 0, 0, 0},{0, 1, 1, 1, 1, 0}, {1, 1, 0, 1, 0, 0}, {0, 0, 0, 0, 0, 0}};
	private static int[][] path;
	
	public static void main(String[] args) {
		maxDiamond();
	}


	private static void maxDiamond() {
		int i;
		int j;

		for(i = 0; i <  n; i++){
			for(j = 0; j < n; j++){
				//left = 1 and right = 2
				if(arr[i][j + 1] > arr[i + 1][j]){
					path[i][j] = 1;
				}else{
					path[i][j] = 2;
				}
			}
		}
		for(i = 0; i <  n; i++){
			for(j = 0; j < n; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		i = 0; j = 0;
		
		while(i < n &&  j < n){
			
		}
		
	}


	/*private static int max(int i, int j) {
		if(i > j)
			return i;
		return j;
	}*/

}
