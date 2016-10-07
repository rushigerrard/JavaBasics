package com.learning.java.dynamicprogramming;

import java.util.ArrayList;
import java.util.Scanner;

public class RecursiveCoin {

	private int[] denomination = {25, 20, 10, 5, 1};
	
	public ArrayList<Integer> exchangeCoin(int n, ArrayList<Integer> a){
		for(int i= 0; i < denomination.length; i++){
			if(n == denomination[i]){
				a.add(denomination[i]);
				return a;
			}
			if((n - denomination[i]) > 0){
				a.add(denomination[i]);
				return exchangeCoin(n - denomination[i],a);
				
			}
		}
		return null;
	}
	
	public Integer iteratorExchange(int n){
		
		int counter = 0;
		for(int i= 0; i < denomination.length; i++){
			if(n >= denomination[i]){
				int count = n / denomination[i];
				counter = counter + count;
				n = n - count * denomination[i];
			}
			System.out.println("Counter " + counter);
		}
		return counter;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		RecursiveCoin rc = new RecursiveCoin();
		//rc.exchangeCoin(n, a);
		System.out.println(rc.iteratorExchange(n));
		/*for(Integer i : a){
			System.out.print(i + " ");
		}*/
		
	}

}
