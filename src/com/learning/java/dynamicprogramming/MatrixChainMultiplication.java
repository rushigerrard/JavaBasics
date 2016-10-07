package com.learning.java.dynamicprogramming;

public class MatrixChainMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {4, 5, 6, 7, 8};
		System.out.println("Total matrix multiplications needed are  :" + MatrixChainOrder(arr, arr.length));
	}

	private static Integer MatrixChainOrder(int[] arr, int n) {
		int m[][] = new int[n][n];
		int j, q;
		
		//Cost of multiplying one matrix is zero
		/*for(int i = 1; i < n; i++){ 
			m[i][i] = 0; 
		}*/
		//l is chain length
		for(int l = 2; l < n; l++){
			for(int i = 1; i < n - l + 1; i++){
				j = i + l - 1;
				if(j == n)
					continue;
				m[i][j] = Integer.MAX_VALUE;
				for(int k = i; k <= j - 1; k++){
					// q = cost / scalar multiplication
					q = m[i][k] +  m[k + 1][j] + arr[i - 1] * arr[k] * arr[j];
					System.out.println("i = "+ i + " k = " + k + " j = " + j + " l = " + l + " q = " + q);
					if(q < m[i][j])
						m[i][j] = q;
				}
			}
		}
		for(int i = 1; i < n; i++){
			for(j = 1; j < n; j++){
				System.out.print(m[i][j] + "\t");
			}
			System.out.println("");
		}
		return m[1][n - 1];
	}

}
