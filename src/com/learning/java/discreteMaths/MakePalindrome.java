package com.learning.java.discreteMaths;

import java.util.ArrayList;
import java.util.Scanner;

//Richie Rich
public class MakePalindrome {

	private static String checkPalindrome(String no, int l, int k) {
		int[] a = new int[10];
		int mid = l / 2 - 1;
		char[] noc = no.toCharArray();
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i = 0; i <= mid; i++){
			if(noc[i] != noc[l - i - 1]){
				arr.add(i);
			}
			
		}
		//arr contains all the differently occurring pair of elements.
		if(arr.size() > k){
			return "-1";
		}
		//real shit begins. Managing k and difference.
		
		int diff = arr.size();
		
		
		return new String(noc);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int k = sc.nextInt();
		String no = sc.next();
		System.out.println(checkPalindrome(no, l, k));
	}

	

}

/*while(k > 0){
				if(noc[arr.get(j)] > noc[l - arr.get(j) - 1]){
					noc[arr.get(j)] = noc[l - arr.get(j) - 1];
				}
				else{
					noc[l - arr.get(j) - 1] = noc[arr.get(j)];
				}
				k--;
			}*/


/*int j = 0;

if(arr.size() == k){
	while(k > 0){
		if(noc[arr.get(j)] > noc[l - arr.get(j) - 1]){
			noc[l - arr.get(j) - 1] = noc[arr.get(j)];
		}
		else{
			noc[arr.get(j)] = noc[l - arr.get(j) - 1];
		}
		k--;
	}
	
	return new String(noc);
}
int diff = arr.size();

for(int i = 0; i < arr.size() && diff <= k; i++){
	if(diff == k){
		if(noc[arr.get(i)] > noc[l - arr.get(i) - 1]){
			noc[l - arr.get(i) - 1] = noc[arr.get(i)];
		}
		else{
			noc[arr.get(i)] = noc[l - arr.get(i) - 1];
		}
	}
	else{ 
		if(noc[arr.get(i)] < '9'){
			noc[arr.get(i)] = '9';
			k--;
		}
		if(noc[l - arr.get(i) - 1] < '9' && diff <= k){
			noc[l - arr.get(i) - 1] = '9';
			k--;
		}
	diff--;
	}
}
*/