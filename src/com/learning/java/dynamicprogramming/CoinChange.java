package com.learning.java.dynamicprogramming;


public class CoinChange {

	private static void dynamicExchangCoin(int[] denomination, int amount) {
		int[][] a = new int[denomination.length][amount + 1];
		int count;
		// Do A[i][0] = 0
		//Do A[0][i] = j;
		for(int i = 0; i < denomination.length; i++){
			a[i][0] = 0;
		}
		for(int i = 1; i <= amount; i++){
			a[0][i] = i;
		}
		for(int i = 1; i < denomination.length; i++){
			for(int j = 1; j <= amount; j++){
				
				if(j < denomination[i]){
					a[i][j] = a[i - 1][j];
				}
				else{
					a[i][j] = min( a[i - 1][j], a[i][j  - denomination[i]]  + 1 ) ;
				}
				
			}
		}
		for(int i = 0; i < denomination.length; i++){
			for(int j = 0; j <= amount; j++){
				System.out.print(a[i][j] + " ");
			}	
			System.out.println();
		}	
		
		System.out.println(a[denomination.length - 1][amount]);
	}

	private static int min(int i, int j) {
		if(i < j)
			return i;
		
		return j;
	}

	private static int exchangeCoin(int[] d, int amount){
		int[] counter = new int[d.length];
		int count;
		int originalAmount = amount;
		for(int j = 0; j < d.length; j++){
			amount = originalAmount;
			for(int i = j; i < d.length; i++){
				if(amount >= d[i]){
					count = amount / d[i];
					counter[j] = counter[j] + count;
					amount = amount - count * d[i];
				}
			}
		}
		for(int j = 0; j < d.length; j++){
			System.out.print(counter[j] + " ");
		}
		System.out.println();
		return counter[1];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] denomination = new int[]{1, 5, 6, 10};
		int amount = 17 ;
		//exchangeCoin(denomination, amount);
		dynamicExchangCoin(denomination, amount);
	}


}
