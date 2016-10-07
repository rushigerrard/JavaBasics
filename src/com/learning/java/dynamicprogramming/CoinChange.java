package com.learning.java.dynamicprogramming;


public class CoinChange {

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
		int[] denomination = new int[]{10, 6, 1};
		int amount = 13;
		exchangeCoin(denomination, amount);
	}

}
