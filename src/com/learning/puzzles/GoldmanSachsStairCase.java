package com.learning.puzzles;

public class GoldmanSachsStairCase {

/*	static long recursiveCount(int n){
		
		long count = 0;
		if(n < 0)
			return 0;
		if(n == 0)
			return 1;
		for(int i = 1; i <= 3; i++){
			count = count + recursiveCount(n - i);
		}
		return count;
		
	}
	static long countSteps(int n) {
		if(n == 0)
			return 0;
		return recursiveCount(n);
	}
	*/
	static long countSteps(int n) {
        if(n == 0)
            return 0;
        long dp[] = new long[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            if (i - 1 >= 0)
                dp[i] += dp[i - 1];
            if (i - 2 >= 0)
                dp[i] += dp[i - 2];
            if (i - 3 >= 0)
                dp[i] += dp[i - 3];
        }
        return dp[n];
    }
	public static void main(String[] args) {
		System.out.println(countSteps(0));
		System.out.println(countSteps(1));
		System.out.println(countSteps(2));
		System.out.println(countSteps(3));
		System.out.println(countSteps(2121221));
	}

}
