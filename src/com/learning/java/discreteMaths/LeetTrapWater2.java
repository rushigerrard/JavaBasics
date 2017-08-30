package com.learning.java.discreteMaths;

public class LeetTrapWater2 {

	public int trapRainWater(int[][] heightMap) {

		if(heightMap.length == 0 || heightMap[0].length == 0)
			return 0;
		int maxLeft = 0, maxRight = 0;
		int maxTop = 0, maxBottom = 0;
		int[][] topArr = new int[heightMap.length][heightMap[0].length];
		int[][] bottomArr = new int[heightMap.length][heightMap[0].length];
		int[][] leftArr = new int[heightMap.length][heightMap[0].length];
		int[][] rightArr = new int[heightMap.length][heightMap[0].length];
		int[][] remaining = new int[heightMap.length][heightMap[0].length];
		for (int i = 0; i < heightMap.length; i++) {
			maxLeft = 0;
			for (int j = 0; j < heightMap[i].length; j++) {
				if (maxLeft < heightMap[i][j]) {
					maxLeft = heightMap[i][j];
				}
				leftArr[i][j] = maxLeft;
			}
		}

		for (int i = 0; i < heightMap.length; i++) {
			maxRight = 0;
			for (int j = heightMap[i].length - 1; j >= 0; j--) {

				if (maxRight < heightMap[i][j]) {
					maxRight = heightMap[i][j];
				}
				rightArr[i][j] = maxRight;
			}
		}

		for (int j = 0; j < heightMap[0].length; j++) {
			maxTop = 0;
			for (int i = 0; i < heightMap.length; i++) {
				if (maxTop < heightMap[i][j]) {
					maxTop = heightMap[i][j];
				}
				topArr[i][j] = maxTop;
			}
		}

		for (int j = heightMap[0].length - 1; j >= 0; j--) {
			maxBottom = 0;
			for (int i = heightMap.length - 1; i >= 0; i--) {
				if (maxBottom < heightMap[i][j]) {
					maxBottom = heightMap[i][j];
				}
				bottomArr[i][j] = maxBottom;
			}
		}

		int sum = 0;
		for (int i = 0; i < heightMap.length; i++) {
			for (int j = 0; j < heightMap[i].length; j++) {
				remaining[i][j] = min(topArr[i][j], bottomArr[i][j], leftArr[i][j], rightArr[i][j]) - heightMap[i][j];
				sum += remaining[i][j];
				System.out.print(remaining[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("left maximum : ");
		for (int i = 0; i < heightMap.length; i++) {
			for (int j = 0; j < heightMap[i].length; j++) {
				System.out.print(leftArr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("right maximum : ");
		for (int i = 0; i < heightMap.length; i++) {
			for (int j = 0; j < heightMap[i].length; j++) {
				System.out.print(rightArr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("top maximum : ");
		for (int i = 0; i < heightMap.length; i++) {
			for (int j = 0; j < heightMap[i].length; j++) {
				System.out.print(topArr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("bottom maximum : ");
		for (int i = 0; i < heightMap.length; i++) {
			for (int j = 0; j < heightMap[i].length; j++) {
				System.out.print(bottomArr[i][j] + " ");
			}
			System.out.println();
		}
		return sum;
	}

	private int min(int i, int j, int k, int l) {
		int min = Integer.MAX_VALUE;
		if (min > i)
			min = i;
		if (min > j)
			min = j;
		if (min > k)
			min = k;
		if (min > l)
			min = l;

		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeetTrapWater2 ltw2 = new LeetTrapWater2();
		int[][] heightMap = new int[][] { { 12, 13, 1, 12 }, { 13, 4, 13, 12 }, { 13, 8, 10, 12 }, { 12, 13, 12, 12 },
				{ 13, 13, 13, 13 } };
		System.out.println(ltw2.trapRainWater(heightMap));
	}

}
