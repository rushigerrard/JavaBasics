package com.learning.java.discreteMaths;

public class uniqueBST {

	public static int numTrees(int n) {
		int[] dp = new int[n + 1];
		dp[0] = 1;
		dp[1] = 1;
		if(n < 0){
			return 0;
		}
		if(n == 0){
			return dp[n];
		}
		if(n == 1){
			return dp[n];
		}
		for(int i = 2; i <= n; i++){
			int ans = 0;
			for(int j = 1; j <= i; j++){
				int current = dp[j - 1] * dp[i - j];
				ans = ans + current;
			}
			dp[i] = ans;
			
		}
		return dp[n];
	}

	public static void main(String[] args) {
		System.out.println(numTrees(5));

	}

}
